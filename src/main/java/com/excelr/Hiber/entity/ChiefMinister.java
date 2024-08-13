package com.excelr.Hiber.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class ChiefMinister {


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int cmno;
	private String cmname;
	private int age;
	@OneToOne
	@JoinColumn(name="mystate")
	State state;
		
	
	public ChiefMinister() {
		
	}
	public ChiefMinister(int cmno, String cmname, int age) {
		super();
		this.cmno = cmno;
		this.cmname = cmname;
		this.age = age;
	}
	public int getCmno() {
		return cmno;
	}
	public void setCmno(int cmno) {
		this.cmno = cmno;
	}
	public String getCmname() {
		return cmname;
	}
	public void setCmname(String cmname) {
		this.cmname = cmname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "ChiefMinister [cmno=" + cmno + ", cmname=" + cmname + ", age=" + age + "]";
	}
}
