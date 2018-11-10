package com.bdi.sp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bdi.sp.service.AwsService;
import com.bdi.sp.vo.Aws;

@Controller
public class AwsController {
	
	@Autowired
	private AwsService ats;
	
	@GetMapping("/awstests")
	public @ResponseBody List<Aws> getAwsList(){
		return ats.selectAwsList();
	}
}
