package com.lab.Attendance_System.dao.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="sign")
public class Sign {
	@Id
	@GeneratedValue
	@Column(name="sign_id")
	private Integer signId;
	
	@Column(name="sign_time")
	private Long signTime;
	
	@Column(name="sign_code")
	private String signCode;
	
	@ManyToOne
	@JoinColumn(name="team_name")
	private Team team;
	
	@OneToMany(mappedBy="sign")
	private Set<Complete_sign> Complete_sign=new HashSet<Complete_sign>();
	
	public Integer getSId() {
		return signId;
	}

	public void setSId(Integer signId) {
		this.signId = signId;
	}
	
	public Long getSTime() {
		return signTime;
	}

	public void setSTime(Long signTime) {
		this.signTime = signTime;
	}

	public String getScode() {
		return signCode;
	}
	
	public void setScode(String signCode) {
		this.signCode = signCode;
    }
	
	 public Team getTeam() {
	     return team;
	 }

	 public void setTeam(Team team) {
	     this.team = team;
	 }
	 

}
