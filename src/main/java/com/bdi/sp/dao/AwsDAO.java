package com.bdi.sp.dao;

import java.util.List;

import com.bdi.sp.vo.Aws;

public interface AwsDAO {

	public List<Aws> selectAwsList();
	public Aws selectAws(int awnum);
	public Integer insertAws(Aws aws);
	public Integer updateAws(Aws aws);
	public Integer deleteAws(int awnum);
}
