package com.bdi.sp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bdi.sp.dao.AwsDAO;
import com.bdi.sp.service.AwsService;
import com.bdi.sp.vo.Aws;

@Service
public class AwsServiceImpl implements AwsService {
	
	@Autowired
	private AwsDAO awdao;

	@Override
	public List<Aws> selectAwsList() {
		return awdao.selectAwsList();
	}

	@Override
	public Aws selectAws(int awnum) {
		return awdao.selectAws(awnum);
	}

	@Override
	public Integer insertAws(Aws aws) {
		return awdao.insertAws(aws);
	}

	@Override
	public Integer updateAws(Aws aws) {
		return awdao.updateAws(aws);
	}

	@Override
	public Integer deleteAws(int awnum) {
		return awdao.deleteAws(awnum);
	}

}
