package com.catalogue.moviecatalogueauthenticator.dto;

import com.catalogue.moviecatalogueauthenticator.entity.Address;

import java.sql.Date;
import java.sql.Timestamp;

public class UserDTO {

    public UserDTO(){

    }

    /**
     *
     * @param userId
     * @param address
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
    public UserDTO(Long userId, Address address, String userName, String userRole, String userEmail, String userPhoneNumber, String userFirstName, String userLastName, Date userDOB, String userIdentity, String userPassword, Timestamp createdAt) {
        this.userId = userId;
        this.address = address;
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

    private Long userId;
    private Address address;
    private String userName;
    private String userRole;
    private String userEmail;
    private String userPhoneNumber;
    private String userFirstName;
    private String userLastName;
    private Date userDOB;
    private String userIdentity;
    private String userPassword;
    private Timestamp createdAt;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
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