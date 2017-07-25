package org.big.controller;

import javax.servlet.http.HttpServletRequest;

import org.big.domain.Evaluation;
import org.big.service.EvaluationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class EvaluationController {

	@Autowired
	@Qualifier("evaluationService")
	private EvaluationService evaluationService;
	
	@RequestMapping(value="/evaluat")
	public ModelAndView addEvaluation(
			@ModelAttribute Evaluation evaluation,
			ModelAndView mv,HttpServletRequest request){
		String goods_id=request.getParameter("goods_id");
		System.out.println(goods_id);
		String user_id=request.getParameter("user_id");
		System.out.println(user_id);
		int count=evaluationService.addEvaluation(evaluation);
		mv.setView(new RedirectView("./goodsForm"));
		return mv;
	}
}
