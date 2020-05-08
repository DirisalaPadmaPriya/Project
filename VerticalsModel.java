package com.spoc.model;
import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="vertical")
public class VerticalsModel implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="vertical_id")
	private int vertical_id;
	
	private String vertical_name;
	public VerticalsModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public VerticalsModel(int vertical_id, String vertical_name) {
		super();
		this.vertical_id = vertical_id;
		this.vertical_name = vertical_name;
	}
	public String getVertical_name() {
		return vertical_name;
	}
	public void setVertical_name(String vertical_name) {
		this.vertical_name = vertical_name;
	}
	public int getVertical_id() {
		return vertical_id;
	}
	public void setVertical_id(int vertical_id) {
		this.vertical_id = vertical_id;
	}
	@Override
	public String toString() {
		return "VerticalsModel [vertical_id=" + vertical_id + ", vertical_name=" + vertical_name + "]";
	}
	
	
}
