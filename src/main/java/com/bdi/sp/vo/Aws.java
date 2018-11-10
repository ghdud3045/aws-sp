package com.bdi.sp.vo;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("aws")
@Data
public class Aws {

	private Integer awnum;
	private String awname;
	private Integer awage;
}
