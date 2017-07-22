package org.big.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.big.domain.Cart;
import org.big.domain.Goods;
import org.big.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

/**
 * 处理物品请求控制器
 */
@Controller
public class GoodsController {
	/**
	 * 自动注入GoodsService
	 */
	@Autowired
	@Qualifier("goodsService")
	private GoodsService goodsService;
	
	/**
	 * 处理/goodsForm请求
	 */
	@RequestMapping(value="/goodsForm")
	public String goodsForm (Model model){
		//获取所有物品集合
		List<Goods> goods_list=goodsService.getAll();
		//将物品集合添加到model中
		model.addAttribute("goods_list",goods_list);
		// 跳转到goodsForm页面
		return "goodsForm";
	}
	//商品详情请求
	@RequestMapping(value="/select")
	public ModelAndView select(
			 String goods_id,
			 ModelAndView mv,
			 HttpSession session){
		Goods goods=goodsService.selectGoods(goods_id);
		System.out.println("goods_id");
		session.setAttribute("goods", goods);
		mv.setView(new RedirectView("./goodslist"));
		return mv;
	}
	@RequestMapping(value="/goods")
	public String goods (Model model){
		//获取所有物品集合
		List<Goods> goods_list=goodsService.getAll();
		//将物品集合添加到model中
		model.addAttribute("goods_list",goods_list);
		// 跳转到goodsForm页面
		return "goods";
	}
	
	@RequestMapping(value="/addgoods")
	public ModelAndView addGoods(
			@ModelAttribute Goods goods,
			ModelAndView mv){
		int a=goodsService.addGoods(goods);
		mv.setView(new RedirectView("./goods"));
		return mv;
	}
	
	@RequestMapping(value="/reducegoods")
	public ModelAndView reduceGoods(
			String goods_id,
			ModelAndView mv,
			HttpSession session){
		System.out.print("goods_id");
		Integer id=goodsService.deleteGoods(goods_id);
		
		mv.setView(new RedirectView("./goods"));
		return mv;
	}
}
