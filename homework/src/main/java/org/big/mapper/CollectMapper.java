package org.big.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.big.domain.Cart;
import org.big.domain.Collect;

public interface CollectMapper {
	@Select("select * from tb_collection ")
	List<Collect> findAll();
	@Delete("delete from tb_collection where id=#{id}")
	int delete(Collect collect);
	@Insert("insert into tb_collection (goods_id,image1,price,count)values(#{goods_id},#{image1},#{price},#{count})")
	int save(Collect collect);
	@Delete("delete from tb_collection")
	int deleteAll(Collect collect);
	@Select(" select * from tb_collection where goods_id=#{goods_id}")
	Collect findWithId(@Param("goods_id") String goods_id);
}
