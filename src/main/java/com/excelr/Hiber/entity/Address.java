package com.excelr.Hiber.entity;

import javax.persistence.Embeddable;

@Embeddable
public class Address {

	private int houseNo;
	private String locality;
	private int pinCode;
	
	public Address() {
		
	}
	
	public Address(int houseNo, String locality, int pinCode) {
		this.houseNo = houseNo;
		this.locality = locality;
		this.pinCode = pinCode;
	}


	public int getHouseNo() {
		return houseNo;
	}


	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}


	public String getLocality() {
		return locality;
	}


	public void setLocality(String locality) {
		this.locality = locality;
	}


	public int getPinCode() {
		return pinCode;
	}


	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", locality=" + locality + ", pinCode=" + pinCode + "]";
	}
	
}
