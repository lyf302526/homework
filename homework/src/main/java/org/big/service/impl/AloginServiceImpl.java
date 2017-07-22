package org.big.service.impl;

import org.big.domain.Alogin;
import org.big.mapper.AloginMapper;
import org.big.service.AloginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
@Service("aloginService")
public class AloginServiceImpl implements AloginService{

	
	@Autowired
	private AloginMapper aloginMapper;
	@Transactional(readOnly=true)
	
	@Override
	public Alogin man(String loginname, String password) {
		// TODO Auto-generated method stub
		return aloginMapper.findWithLoginnameAndPassword(loginname, password);
	}
}
