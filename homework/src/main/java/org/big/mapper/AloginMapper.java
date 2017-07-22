package org.big.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.big.domain.Alogin;

public interface AloginMapper {
	
	
	@Select("select * from tb_manager where loginname=#{loginname} and password=#{password}")
	Alogin findWithLoginnameAndPassword(@Param("loginname")String loginname,
			@Param("password") String password);
}
