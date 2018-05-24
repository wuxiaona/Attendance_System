package com.lab.Attendance_System.dao.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="user_belong_T")
public class U_belong_T {
	@Id
	@GeneratedValue
	private Integer manage_id;
	
	
	public Integer getMid(){
		return manage_id;
	}
	
	public void setTid(Integer m_id){
		this.manage_id=m_id;
	}

}
