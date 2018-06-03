package com.lab.Attendance_System.controller;

import java.util.List;


import com.lab.Attendance_System.dao.model.User;

public class AjaxResponse {
	private String msg;
	private List<User> result;
	
	public String getMsg() {
		return msg;
	}
	
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public List<User> getResult() {
		return result;
	}
	
	public void setResult(List<User> result) {
		this.result = result;
	}

}
