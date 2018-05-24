package com.lab.Attendance_System.dao.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="complete_task")
public class Complete_task {
	@Id
	@GeneratedValue
	private Integer complete_task_id;
	public Integer getCtid(){
		return complete_task_id;
	}
	public void setCsid(Integer ct_id){
		this.complete_task_id=ct_id;
	}

}
