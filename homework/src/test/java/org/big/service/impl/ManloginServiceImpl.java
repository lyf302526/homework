package org.big.service.impl;

import org.big.domain.Manlogin;
import org.big.mapper.ManloginMapper;
import org.big.service.ManloginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
@Service("manlogingerService")
public class ManloginServiceImpl implements ManloginService{
	
	@Autowired
	private ManloginMapper manloginMapper;
	
	
	@Override
	public Manlogin manlogin(String loginname, String password) {
		// TODO Auto-generated method stub
		return manloginMapper.findWithLoginnameAndPassword(loginname, password);
	}

}
