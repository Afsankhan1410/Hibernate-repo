package com.excelr.Hiber.entity;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name="excelrstudent")
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)

public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="rollno")
	private int rno;
	@Column(name="studname",length = 10)
	private String sname;
	@Column(name="percentage")
	private double per;
	@Column(unique = true)
	private String email;
	
	private Address address;
	
	public Student() {}
	
	public Student(String sname, double per,String email) {
		this.sname = sname;
		this.per = per;
		this.email = email;
	}
	public Student(int rno, String sname, double per) {
		this.rno = rno;
		this.sname = sname;
		this.per = per;
	}
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public double getPer() {
		return per;
	}
	public void setPer(double per) {
		this.per = per;
	}
	
	@Override
	public String toString() {
		return "Student [rno=" + rno + ", sname=" + sname + ", per=" + per + "]";
	}
	
	
}
