package com.liugh.mapper;

import java.util.List;

import com.liugh.entity.UserFormMap;
import com.liugh.mapper.base.BaseMapper;


public interface UserMapper extends BaseMapper{

	public List<UserFormMap> findUserPage(UserFormMap userFormMap);
	
}
