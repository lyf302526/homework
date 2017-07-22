package org.big.controller;

import javax.servlet.http.HttpSession;

import org.big.domain.Alogin;
import org.big.service.AloginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class AloginController {

	
	@Autowired
	@Qualifier("aloginService")
	private AloginService aloginService;
	@RequestMapping(value="/man")
	public ModelAndView man( 
			String loginname,String password,
			 ModelAndView mv,
			 HttpSession session){
		Alogin alogin=aloginService.man(loginname, password);
		if(alogin != null){
			session.setAttribute("alogin", alogin);
			mv.setView(new RedirectView("./goods"));
		}else{
			mv.addObject("message", "登录名或密码错误，请重新输入!");
			mv.setViewName("aloginForm");
		}
		return mv;
	}
}
