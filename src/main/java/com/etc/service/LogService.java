package com.etc.service;

import com.etc.entity.Log;

public interface LogService {
	int deleteByPrimaryKey(Integer logId);

	int insert(Log record);

	int insertSelective(Log record);

	Log selectByPrimaryKey(Integer logId);

	int updateByPrimaryKeySelective(Log record);

	int updateByPrimaryKey(Log record);
}
