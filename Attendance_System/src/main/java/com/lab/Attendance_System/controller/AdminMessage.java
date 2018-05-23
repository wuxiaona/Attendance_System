package com.lab.Attendance_System.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.lab.Attendance_System.dao.model.Admin;


@Service
public class AdminMessage {
	private List<Admin> admin;
	
	//初始化一些user
		@PostConstruct
		private void Message() {
			admin = new ArrayList<Admin>();
			Admin user1 = new Admin("wuxiaona", "password:1");
			Admin user2 = new Admin("zhongying", "password:2");
			
			
			admin.add(user1);
			admin.add(user2);
			
		}
	
	public List<Admin> find(String username){
		List<Admin> result = admin.stream()//组合流
				.filter(a -> a.getUsername().equals(username))
				.collect(Collectors.toList());
		//把相同的用户名提取到新的List里
		return result;
	}
	
	

}
