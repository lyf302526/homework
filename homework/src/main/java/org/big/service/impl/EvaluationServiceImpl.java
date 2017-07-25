package org.big.service.impl;

import org.big.domain.Evaluation;
import org.big.mapper.EvaluationMapper;
import org.big.service.EvaluationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
@Service("evaluationService")
public class EvaluationServiceImpl implements EvaluationService{
	
	@Autowired
	private EvaluationMapper evaluationMapper;
	
	//@Transactional(readOnly=true)

	@Override
	public int addEvaluation(Evaluation evaluation) {
		// TODO Auto-generated method stub
		return evaluationMapper.add(evaluation);
	}

}
