package com.pt.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="Mobile")
@Entity
public class Mobile {
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private int m_num;
	@Column(name="m_name")
	private String m_name;
	@Column(name="ram")
	private int ram;
	@Column(name="color")
	private String color;
	@Column(name="imei")
	private long imei;
	public Mobile() {
		
	}
	public Mobile(int m_num,String m_name,int ram,String color,long imei) {
		this.m_num=m_num;
		this.m_name=m_name;
		this.ram=ram;
		this.color=color;
		this.imei=imei;
	}
	public int getM_num() {
		return m_num;
	}
	public void setM_num(int m_num) {
		this.m_num = m_num;
	}
	public String getM_name() {
		return m_name;
	}
	public void setM_name(String m_name) {
		this.m_name = m_name;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public long getImei() {
		return imei;
	}
	public void setImei(long imei) {
		this.imei = imei;
	}
}
