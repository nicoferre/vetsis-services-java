package com.vetsis.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class userEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Long id;
	public String userName;
	public String password;
	public String name;
	public String lastname;
	public String roleId;
	public String email;
	public String documentNumber;
	public String phone;
	
	public userEntity(Long id, String userName, String password, String name, String lastname, String roleId,
			String email, String documentNumber, String phone) {
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.name = name;
		this.lastname = lastname;
		this.roleId = roleId;
		this.email = email;
		this.documentNumber = documentNumber;
		this.phone = phone;
	}
	
	public userEntity() {}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getRoleId() {
		return roleId;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDocumentNumber() {
		return documentNumber;
	}
	public void setDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "userEntity [id=" + id + ", userName=" + userName + ", password=" + password + ", name=" + name
				+ ", lastname=" + lastname + ", roleId=" + roleId + ", email=" + email + ", documentNumber="
				+ documentNumber + ", phone=" + phone + "]";
	}
}
