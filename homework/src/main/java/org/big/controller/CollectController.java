package org.big.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.big.domain.Cart;
import org.big.domain.Collect;
import org.big.service.CollectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class CollectController {
	@Autowired
	@Qualifier("collectService")
	private CollectService collectService;
	@RequestMapping(value="/collectForm")
	public String collectlist(Model model){
		List<Collect> collect_list=collectService.getCollect();
		model.addAttribute("collect_list",collect_list);
		return "collectForm";
	}
	@RequestMapping(value="/addcollect")
	public ModelAndView addCollect(
			@ModelAttribute Collect collect,
			ModelAndView mv,
			 HttpSession session,
			 HttpServletRequest request){
		String goods_id=request.getParameter("goods_id");
		collect.setGoods_id(goods_id);
		Collect collect1= collectService.findCollect(goods_id);
		if (collect1 == null){
			collectService.saveCollect(collect);
		}else{
			mv.addObject("massage", "注册成功，请登陆！");
		}
		mv.setView(new RedirectView("./collectForm"));
	return mv;
	}
	
	@RequestMapping(value="/removecollect")
	public ModelAndView removeCollect(
			@ModelAttribute Collect collect,
			ModelAndView mv,
			 HttpSession session){
		collectService.deleteCollect(collect);
		mv.setView(new RedirectView("./collectForm"));
	return mv;
	}
	@RequestMapping(value="/clearcollect")
	public ModelAndView clearCollec(
			@ModelAttribute Collect collect,
			ModelAndView mv,
			 HttpSession session){
		int count=collectService.deleteAll(collect);
		mv.setView(new RedirectView("./collectForm"));
	return mv;
	}
}

