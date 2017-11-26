package com.etc.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.etc.dao.LogMapper;
import com.etc.entity.Log;
import com.etc.service.LogService;

@Service
public class LogServiceImpl implements LogService {
	@Resource
	private LogMapper logDao;
	public int deleteByPrimaryKey(Integer logId) {
		
		return logDao.deleteByPrimaryKey(logId);
	}

	public int insert(Log record) {
		// TODO Auto-generated method stub
		return logDao.insert(record);
	}

	public int insertSelective(Log record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Log selectByPrimaryKey(Integer logId) {
		// TODO Auto-generated method stub
		return null;
	}

	public int updateByPrimaryKeySelective(Log record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int updateByPrimaryKey(Log record) {
		// TODO Auto-generated method stub
		return 0;
	}

}
