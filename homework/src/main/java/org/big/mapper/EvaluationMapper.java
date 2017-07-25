package org.big.mapper;

import org.apache.ibatis.annotations.Insert;
import org.big.domain.Evaluation;

public interface EvaluationMapper {
	
	@Insert("insert into tb_evaluation(goods_id,user_id,wuliu,maijia,zhiliang,image,text) values(#{goods_id},#{user_id},#{wuliu},#{maijia},#{zhiliang},#{image},#{text})")
	int add(Evaluation evaluation);
}
