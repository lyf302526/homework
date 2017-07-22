package org.big.service.impl;

import java.util.List;

import org.big.domain.Collect;
import org.big.mapper.CollectMapper;
import org.big.service.CollectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT)
@Service("collectService")
public class ClloectServiceImpl implements CollectService{
	@Autowired
	private CollectMapper collectMapper;
	@Transactional(readOnly=true)
	@Override
	public List<Collect> getCollect() {
		// TODO Auto-generated method stub
		return collectMapper.findAll();
	}

	@Override
	public int deleteCollect(Collect collect) {
		// TODO Auto-generated method stub
		return collectMapper.delete(collect);
	}

	@Override
	public int deleteAll(Collect collect) {
		// TODO Auto-generated method stub
		return collectMapper.deleteAll(collect);
	}

	@Override
	public Collect findCollect(String goods_id) {
		// TODO Auto-generated method stub
		return collectMapper.findWithId(goods_id);
	}

	@Override
	public void saveCollect(Collect collect) {
		// TODO Auto-generated method stub
		int i = 1;
		collect.setCount(i);
		collectMapper.save(collect);
	}

}
