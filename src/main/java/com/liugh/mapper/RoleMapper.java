package com.liugh.mapper;

import java.util.List;

import com.liugh.entity.RoleFormMap;
import com.liugh.mapper.base.BaseMapper;

public interface RoleMapper extends BaseMapper{
	public List<RoleFormMap> seletUserRole(RoleFormMap map);
	
	public void deleteById(RoleFormMap map);
}
