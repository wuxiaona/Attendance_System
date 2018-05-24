package com.lab.Attendance_System.dao.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
		@Id
		@GeneratedValue
		public Integer user_id;
		private boolean is_user;//是否是管理人员
		private String user_name;
		private String user_password;
		private String tel;
		
		public User(){	
		}
		
		public Integer getUid(){
			return user_id;
		}
		public void setUid(Integer id){
			this.user_id=id;
		}
		
		//布尔类型，那么其getter和setter方法为is...()和set...s()
		public boolean isIs(){
			return is_user;
		}
		public void setIs(boolean is){
			this.is_user=is;
		}
		
		public String getUname(){
			return user_name;
		}
		public void setUname(String name){
			this.user_name=name;
		}
		
		public String getUpassword(){
			return user_password;
		}
		public void setUpassword(String password){
			this.user_password=password;
		}
		public String getTel(){
			return tel;
		}
		public void setTel(String tel){
			this.tel=tel;
		}

}
