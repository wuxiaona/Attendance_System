package com.lab.Attendance_System.dao.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="complete_sign")
public class Complete_sign {
	
	@Id
	@GeneratedValue
	@Column(name="complete_sign_id")
	private Integer comsignId;
	
	//多对一
	
	@ManyToOne
	@JoinColumn(name="sign_id")
	private Sign sign;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;
	
	
	
	public Integer getCsid(){
		return comsignId;
	}
	public void setCsid(Integer comsignId){
		this.comsignId=comsignId;
	}
	
	public User getUser() {
	     return user;
	 }

	 public void setUser(User user) {
	     this.user = user;
	 }
	 
	 public Sign getSign() {
	     return sign;
	 }

	 public void setSign(Sign sign) {
	     this.sign = sign;
	 }

}
