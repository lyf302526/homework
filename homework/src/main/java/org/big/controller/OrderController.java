package org.big.controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
import org.big.domain.Order;
import org.big.domain.User;
import org.big.service.OrderService;
import org.big.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class OrderController {
	
	@Autowired
	@Qualifier("orderService")
	private OrderService orderService;
	@Autowired
	@Qualifier("userService")
	private UserService userService;
	
	@RequestMapping(value="/orderForm")
	 public String orderlist(Model model){
		List<Order> order_list = orderService.getAll();
		model.addAttribute("order_list", order_list);
		return "orderForm";
	}
	
	@RequestMapping(value="/order")
	public String order (Model model){
		List<Order> order_list=orderService.getAll();
		model.addAttribute("order_list",order_list);
		return "order";
	}
	
	@RequestMapping(value="/addorder")
	public ModelAndView addorder(
			@ModelAttribute Order order,
			ModelAndView mv,
			 HttpSession session,
			 HttpServletRequest request, Integer count,Integer sale){
		String state="待处理";
		order.setState(state);
		String goods_id=request.getParameter("goods_id");
		order.setGoods_id(goods_id);
		orderService.addorder(order, goods_id,count,sale);
		mv.setView(new RedirectView("./orderForm"));
	return mv;
	}
	@RequestMapping(value="/deleteorder")
	public ModelAndView deleteorder(
			@ModelAttribute Order order,
			ModelAndView mv,
			 HttpSession session){
		int count=orderService.deleteorder(order);
		mv.setView(new RedirectView("./orderForm"));
	return mv;
	}

	@RequestMapping(value="/endorder")
	public ModelAndView endorder(
			@ModelAttribute Order order,
			ModelAndView mv,
			 HttpSession session,
			 HttpServletRequest request){
		int id=Integer.parseInt(request.getParameter("id"));
		order.setId(id);
		String state="已完成";
		order.setState(state);
		orderService.updateOrder(state, id);
		mv.setView(new RedirectView("./orderForm"));
	return mv;
}
	@RequestMapping(value="/selectorder")
	 public ModelAndView selectorder(
			 int id,
			 ModelAndView mv,
			 HttpSession session){
		Order order=orderService.selectOrder(id);
		session.setAttribute("order", order);
		mv.setViewName("./showorderForm");
		return mv;
	}
	@RequestMapping(value="/doingorder",method = RequestMethod.POST)
	public ModelAndView doingorder(@ModelAttribute Order order,
			ModelAndView mv,
		String loginname,Integer user_id,
		HttpSession session,HttpServletRequest request,HttpServletResponse response)throws Exception{	
		int id=Integer.parseInt(request.getParameter("id"));
		order.setId(id);
		String state="配送中";
		order.setState(state);
		orderService.updateOrder(state, id);	
		
	    User user=userService.findLoginname(user_id);
	    System.out.println(user_id);
	    loginname=user.getLoginname();
	    System.out.println(loginname);
		if(user!=null){
			
			StringBuffer url = new StringBuffer();
			StringBuilder builder = new StringBuilder();
			// 正文
			builder.append(
					"<html><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" /></head><body>");
			url.append("<font color='red'>"+"亲爱的顾客：您在饰品小屋购买的商品已经发货，请您耐心等待收货！ "+ "</font>");
			builder.append("<br/><br/>");
			builder.append("<div>" + url + "</div>");
			builder.append("</body></html>");
			SimpleEmail sendemail = new SimpleEmail();
			sendemail.setHostName("smtp.126.com");// 指定要使用的邮件服务器
			sendemail.setAuthentication("lyf1424944719@126.com", "liyanfang123");// 使用163的邮件服务器需提供在163已注册的用户名、密码
			sendemail.setCharset("UTF-8");
			try {
				sendemail.setCharset("UTF-8");
				sendemail.addTo(loginname);
				sendemail.setFrom("lyf1424944719@126.com");
				sendemail.setSubject("订单通知");
				sendemail.setMsg(builder.toString());
				sendemail.send();
				System.out.println(builder.toString());
			} 
				catch (EmailException e) {
				e.printStackTrace();
				}	
			
		}
		mv.setView(new RedirectView("./order"));
	    return mv;
	    
	}

}