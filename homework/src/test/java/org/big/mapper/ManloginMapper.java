package org.big.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.big.domain.Manlogin;

public interface ManloginMapper {
	@Select("select * from tb_manager where loginname = #{loginname} and password = #{password}")
	Manlogin findWithLoginnameAndPassword(@Param("loginname")String loginname,
			@Param("password") String password);
	
}
