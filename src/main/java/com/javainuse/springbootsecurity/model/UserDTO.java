package com.javainuse.springbootsecurity.model;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

public class UserDTO {
	private String emailid;
	private String password;
	private String role;
	private String firstName;
	private String lastName;
	private String kyc;
	@JsonFormat(pattern="yyyy-MM-dd")
	private LocalDate dob;
	@JsonFormat(pattern="yyyy-MM-dd")
	private LocalDate registerDate;
	@JsonFormat(pattern="yyyy-MM-dd")
	private LocalDate updatedDate;
	private int otp;
	@JsonFormat(pattern="yyyy-MM-dd")
	private LocalDate purchaseDate;
	@JsonFormat(pattern="yyyy-MM-dd")
	private LocalDate expiryDate;

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getKyc() {
		return kyc;
	}

	public void setKyc(String kyc) {
		this.kyc = kyc;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public LocalDate getRegisterDate() {
		return registerDate;
	}

	public void setRegisterDate(LocalDate registerDate) {
		this.registerDate = registerDate;
	}

	public LocalDate getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(LocalDate updatedDate) {
		this.updatedDate = updatedDate;
	}

	public int getOtp() {
		return otp;
	}

	public void setOtp(int otp) {
		this.otp = otp;
	}

	public LocalDate getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(LocalDate purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public LocalDate getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}