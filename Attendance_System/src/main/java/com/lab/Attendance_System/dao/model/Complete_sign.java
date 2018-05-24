package com.lab.Attendance_System.dao.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="complete_sign")
public class Complete_sign {
	
	@Id
	@GeneratedValue
	private Integer complete_sign_id;
	
	public Integer getCsid(){
		return complete_sign_id;
	}
	public void setCsid(Integer cs_id){
		this.complete_sign_id=cs_id;
	}

}
