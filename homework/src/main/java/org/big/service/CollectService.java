package org.big.service;

import java.util.List;

import org.big.domain.Collect;

public interface CollectService {
	List<Collect> getCollect();
	int deleteCollect(Collect collect);
	int deleteAll(Collect collect);
	Collect findCollect(String goods_id);
	void saveCollect(Collect collect);
}
