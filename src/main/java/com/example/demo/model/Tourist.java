package com.example.demo.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Tourist implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private String username;

	@Column
	private String name;

	@Column
	private String surname;

	@Column
	private String email;

	@Column
	private String phoneNumber;

	@ManyToMany
	@JoinTable(name = "tourist_event", joinColumns = @JoinColumn(name = "username", referencedColumnName = "username"), inverseJoinColumns = @JoinColumn(name = "idEvent", referencedColumnName = "idEvent"))
	private List<Event> events;

	@ManyToMany
	@JoinTable(name = "tourist_status", joinColumns = @JoinColumn(name = "username", referencedColumnName = "username"), inverseJoinColumns = @JoinColumn(name = "idStatus", referencedColumnName = "idStatus"))
	private List<Status> status;

	public Tourist(String name, String surname, String email, String phoneNumber) {
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.events = new ArrayList<Event>();
		this.status = new ArrayList<Status>();
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Event> getEvents() {
		return events;
	}

	public List<Status> getStatus() {
		return status;
	}

	@Override
	public String toString() {
		return this.name + " " + this.surname + " " + this.email + " " + this.phoneNumber;
	}
}
