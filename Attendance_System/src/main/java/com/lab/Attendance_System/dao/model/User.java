package com.lab.Attendance_System.dao.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
	      //采用数据库自增长的方式来增主键字段\
		@Column(name="user_id")
		public Integer userId;//主键策略
		
		@Column(name="is_user")
		private boolean isUser;//是否是管理人员
		
		@Column(name="user_name")
		private String userName;
		
		@Column(name="user_password")
		private String userPassword;
		
		@Column(name="tel")
		private String Tel;
		
		//一对多
		@OneToMany(mappedBy="user")
		private Set<Team> team=new HashSet<Team>();
		
		@OneToMany(mappedBy="user")
		private Set<U_belong_T> u_belong_t =new HashSet<U_belong_T>();
		
		@OneToMany(mappedBy="user")
		private Set<Complete_sign> complete_sign=new HashSet<Complete_sign>();
		
		@OneToMany(mappedBy="user")
		private Set<Task> task=new HashSet<Task>();
		
		@OneToMany(mappedBy="user")
		private Set<Complete_task> complete_task=new HashSet<Complete_task>();
		
		public User(String userName, String userPassword) {
			this.userName = userName;
			this.userPassword = userPassword;
		}

		public User(){	
		}
		
		public Integer getUserId(){
			return userId;
		}
		public void setUserId(Integer id){
			this.userId=id;
		}
		
		//布尔类型，那么其getter和setter方法为is...()和set...s()
		public boolean isIs(){
			return isUser;
		}
		public void setIs(boolean is){
			this.isUser=is;
		}
		
		public String getUserName(){
			return userName;
		}
		public void setUserName(String name){
			this.userName=name;
		}
		
		public String getUserPassword(){
			return userPassword;
		}
		public void setUserPassword(String password){
			this.userPassword=password;
		}
		public String getTel(){
			return Tel;
		}
		public void setTel(String tel){
			this.Tel=tel;
		}

}
