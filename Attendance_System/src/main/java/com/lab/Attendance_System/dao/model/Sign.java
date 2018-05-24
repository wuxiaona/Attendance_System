package com.lab.Attendance_System.dao.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sign")
public class Sign {
	@Id
	@GeneratedValue
	private Integer s_id;
	private String s_code;
	
	public Integer getSId() {
		return s_id;
	}

	public void setSId(Integer id) {
		this.s_id = id;
	}

	public String getSNumber() {
		return s_code;
	}
	
	public void setSNumber(String code) {
		this.s_code = code;
    }

}
