package com.lab.Attendance_System.dao.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="task")
public class Task {
	
	@Id
	@GeneratedValue
	private Integer tk_id;
	
	public Integer getTkid(){
		return tk_id;
	}
	
	public void setTkid(Integer id){
		this.tk_id=id;
	}
	

}
