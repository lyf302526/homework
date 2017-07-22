package org.big.controller;

import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.big.domain.Cart;
import org.big.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class CartController {
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	@Autowired
	@Qualifier("cartService")
	private CartService cartService;
	@RequestMapping(value="/cartForm")
	 public String cartlist(Model model){
		List<Cart> cart_list = cartService.getCart();
		model.addAttribute("cart_list", cart_list);
		return "cartForm";
	}
	@RequestMapping(value="/addCart")
	public ModelAndView addCart(
			@ModelAttribute Cart cart,
			ModelAndView mv,
			 HttpSession session,
			 HttpServletRequest request){
		String goods_id=request.getParameter("goods_id");
		cart.setGoods_id(goods_id);
		Cart cart1= cartService.findCart(goods_id);
		if (cart1 == null){
			 cartService.saveCart(cart);
		}else{
			 cartService.addCart(goods_id);
			}
		
		mv.setView(new RedirectView("./cartForm"));
	return mv;
	}
	@RequestMapping(value="/removecart")
	public ModelAndView removeCart(
			@ModelAttribute Cart cart,
			ModelAndView mv,
			 HttpSession session){
		  cartService.deleteCart(cart);
		mv.setView(new RedirectView("./cartForm"));
	return mv;
	}
	@RequestMapping(value="/clearcart")
	public ModelAndView clearCart(
			@ModelAttribute Cart cart,
			ModelAndView mv,
			 HttpSession session){
		int count=cartService.deleteAll(cart);
		mv.setView(new RedirectView("./cartForm"));
	return mv;
	}
}
