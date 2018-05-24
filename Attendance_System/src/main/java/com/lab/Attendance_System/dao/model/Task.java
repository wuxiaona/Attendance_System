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
	private Integer task_id;
	private String task_desc;//任务描述）
	
	public Integer getTkid(){
		return task_id;
	}
	
	public void setTkid(Integer id){
		this.task_id=id;
	}
	
	public String getDesc(){
		return task_desc;
	}
	public void setDesc(String desc){
		this.task_desc=desc;
	}

}
