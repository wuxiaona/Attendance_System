package com.lab.Attendance_System.controller;

import java.util.List;

public class AjaxResponse {
	private String msg;
	private List<Admin> result;
	
	public String getMsg() {
		return msg;
	}
	
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public List<Admin> getResult() {
		return result;
	}
	
	public void setResult(List<Admin> result) {
		this.result = result;
	}

}
