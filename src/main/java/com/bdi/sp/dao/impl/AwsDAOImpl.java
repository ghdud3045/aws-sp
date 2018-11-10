package com.bdi.sp.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bdi.sp.dao.AwsDAO;
import com.bdi.sp.vo.Aws;

@Repository
public class AwsDAOImpl implements AwsDAO {
	
	@Autowired
	private SqlSession ss;

	@Override
	public List<Aws> selectAwsList() {
		return ss.selectList("com.bdi.sp.AWS_TEST.selectAWSList");
	}

	@Override
	public Aws selectAws(int awnum) {
		return ss.selectOne("com.bdi.sp.AWS_TEST.selectAWS",awnum);
	}

	@Override
	public Integer insertAws(Aws aws) {
		return ss.insert("com.bdi.sp.AWS_TEST.insertAWS",aws);
	}

	@Override
	public Integer updateAws(Aws aws) {
		return ss.insert("com.bdi.sp.AWS_TEST.updateAWS",aws);
	}

	@Override
	public Integer deleteAws(int awnum) {
		return ss.delete("com.bdi.sp.AWS_TEST.deleteAWS",awnum);
	}

}
