package org.big.controller;

import java.util.Properties;
import java.util.Random;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.big.domain.User;
import org.big.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

/**
 * 处理用户请求控制器
 * */
@Controller
public class UserController {
	
	/**
	 * 自动注入UserService
	 * */
	@Autowired
	@Qualifier("userService")
	private UserService userService;

	/**
	 * 处理/login请求
	 * */
	@RequestMapping(value="/login")
	 public ModelAndView login(
			 String loginname,String password,
			 ModelAndView mv,
			 HttpSession session){
		// 根据登录名和密码查找用户，判断用户登录
		User user = userService.login(loginname, password);
		if(user != null){
			// 登录成功，将user对象设置到HttpSession作用范围域
			session.setAttribute("user", user);
			// 转发到main请求
			mv.setView(new RedirectView("./goodsForm"));
		}else{
			// 登录失败，设置失败提示信息，并跳转到登录页面
			mv.addObject("message", "登录名或密码错误，请重新输入!");
			mv.setViewName("loginForm");
		}
		return mv;
	}
	
	@RequestMapping(value="/sign")
	public ModelAndView save(
			@ModelAttribute User user,
			ModelAndView mv,
			HttpSession session){
		int count=userService.addUser(user);
		mv.addObject("massage", "注册成功，请登陆！");
		mv.setViewName("loginForm");
		return mv;
	}
	@RequestMapping(value="/update")
	public ModelAndView update(
			@ModelAttribute User user,
			ModelAndView mv,
			HttpSession session){
		int count=userService.updateUser(user);
		mv.addObject("massage", "修改成功");
		mv.setViewName("loginForm");
		return mv;
	}
	@RequestMapping(value="/forget")
	public String forget(String loginname,String email,HttpServletRequest request){
		try{
			 Properties props = new Properties();  
		        props.put("username1", "lyf1424944719@126.com");   
		        props.put("password1", "liyanfang123");   
		        props.put("mail.transport.protocol", "smtp" );  
		        props.put("mail.smtp.host", "smtp.126.com");  
		        props.put("mail.smtp.port", "25" );
		        Session mailSession = Session.getDefaultInstance(props);
		        Message msg = new MimeMessage(mailSession);     
		        msg.setFrom(new InternetAddress("lyf1424944719@126.com"));  
		        msg.addRecipients(Message.RecipientType.TO, InternetAddress.parse(email)); 
		        msg.setSubject("找回密码");   
		        msg.setContent("<h1>此邮件为官方邮件！请点击下面链接完成找回密码操作！</h1><h3><a href='http://localhost:8090/homework/getPassword.action?loginname="+loginname+"'>http://localhost:8080/SendMail/servlet/GetPasswordServlet</a></h3>","text/html;charset=UTF-8");
		        //msg.setContent("<h1>此邮件为官方邮件！请点击下面的链接完成找回密码的操作！</h1><h3><a href='http://localhost:80' ></h3>","text/html;charset=UTF-8");
		        msg.saveChanges();  
		        
		        Transport transport = mailSession.getTransport("smtp");  
		        transport.connect(props.getProperty("mail.smtp.host"), props  
		                .getProperty("username1"), props.getProperty("password1"));   
		        transport.sendMessage(msg, msg.getAllRecipients());  
		        transport.close();     
		        request.setAttribute("information", "找回密码成功，请登录");
			
		}catch(Exception e){
			
		}
		return "redirect:/loginForm";
	}
	@RequestMapping(value="/getPassword")
	
		public ModelAndView getPassword(String loginname,HttpServletRequest request,HttpSession session,ModelAndView mv){
			Random random=new Random();
			String password=random.nextInt(9000)+1000+"";
			session.setAttribute("randomPassword", password);
			userService.updateUserPassword(loginname, password);
			mv.setViewName("getUserPassword");
			return mv;
		}
	
}
