package com.lab.Attendance_System.dao.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="sign")
public class Sign {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
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
	
	
	 public Integer getSignId() {
		return signId;
	}

	public void setSignId(Integer signId) {
		this.signId = signId;
	}

	public Long getSignTime() {
		return signTime;
	}

	public void setSignTime(Long signTime) {
		this.signTime = signTime;
	}

	public String getSignCode() {
		return signCode;
	}

	public void setSignCode(String signCode) {
		this.signCode = signCode;
	}

	public Team getTeam() {
	     return team;
	 }

	 public void setTeam(Team team) {
	     this.team = team;
	 }
	 

}
