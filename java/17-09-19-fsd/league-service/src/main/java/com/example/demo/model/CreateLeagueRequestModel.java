package com.example.demo.model;

public class CreateLeagueRequestModel {
	private String name;
	private String specialist;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSpecialist() {
		return specialist;
	}
	public void setSpecialist(String specialist) {
		this.specialist = specialist;
	}
	public CreateLeagueRequestModel(String name, String specialist) {
		super();
		this.name = name;
		this.specialist = specialist;
	}
	public CreateLeagueRequestModel() {
		super();
	}
	
	
}
