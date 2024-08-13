package com.excelr.Hiber.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Employee {


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int eno;
	private String ename;
	private double sal;
	
	
	@ManyToOne
	@JoinColumn(name="mydept")
	Dept dept;
	
	
	public Employee() {
		
	}
	public Employee(int eno, String ename, double sal) {
		this.eno = eno;
		this.ename = ename;
		this.sal = sal;
	}
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	
	
	public Dept getDept() {
		return dept;
	}
	public void setDept(Dept dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + ", sal=" + sal + "]";
	}
	
	
}
