package com.catalogue.entity;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.sql.Date;

@Entity
@Table(name = "USERS")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "USER_ID")
	private long userId;
	@Column(name = "USER_NAME", length = 30)
	private String userName;
	@Column(name = "USER_ROLE", length = 30)
	private String userRole;
	@Column(name = "USER_EMAIL", length = 80)
	private String userEmail;
	@Column(name = "USER_PHONE_NUMBER", length = 20)
	private String userPhoneNumber;
	@Column(name = "USER_FIRST_NAME", length = 30)
	private String userFirstName;
	@Column(name = "USER_LAST_NAME", length = 30)
	private String userLastName;
	@Column(name = "USER_DOB")
	private Date userDOB;
	@Column(name = "USER_IDENTITY", length = 20)
	private String userIdentity;
	@Column(name = "USER_PASSWORD", length = 500)
	private String userPassword;
	@Column(name = "CREATED_AT")
	private Timestamp createdAt;

	public User() {

	}

	/**
	 * @param userId
	 * @param userName
	 * @param userRole
	 * @param userEmail
	 * @param userPhoneNumber
	 * @param userFirstName
	 * @param userLastName
	 * @param userDOB
	 * @param userIdentity
	 * @param userPassword
	 * @param createdAt
	 */
	public User(long userId, String userName, String userRole, String userEmail, String userPhoneNumber,
			String userFirstName, String userLastName, Date userDOB, String userIdentity, String userPassword,
			Timestamp createdAt) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userRole = userRole;
		this.userEmail = userEmail;
		this.userPhoneNumber = userPhoneNumber;
		this.userFirstName = userFirstName;
		this.userLastName = userLastName;
		this.userDOB = userDOB;
		this.userIdentity = userIdentity;
		this.userPassword = userPassword;
		this.createdAt = createdAt;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserPhoneNumber() {
		return userPhoneNumber;
	}

	public void setUserPhoneNumber(String userPhoneNumber) {
		this.userPhoneNumber = userPhoneNumber;
	}

	public String getUserFirstName() {
		return userFirstName;
	}

	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}

	public String getUserLastName() {
		return userLastName;
	}

	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}

	public Date getUserDOB() {
		return userDOB;
	}

	public void setUserDOB(Date userDOB) {
		this.userDOB = userDOB;
	}

	public String getUserIdentity() {
		return userIdentity;
	}

	public void setUserIdentity(String userIdentity) {
		this.userIdentity = userIdentity;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public Timestamp getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

}
