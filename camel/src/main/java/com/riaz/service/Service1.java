package com.riaz.service;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.springframework.stereotype.Service;


@Service
public class Service1 {//implements RestResource{//implements ApplicationListener<ContextRefreshedEvent>{
	
	@GET
	@Path("test")
	public String test(){
	
		return "success";
	}

public String getBasePath() {
	
	return "/service1/";
}

	
	
}