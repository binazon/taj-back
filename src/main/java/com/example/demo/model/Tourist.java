package com.example.demo.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Tourist implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "username")
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
	@JsonIgnore
	@JoinTable(name = "tourist_event", joinColumns = @JoinColumn(name = "username"), inverseJoinColumns = @JoinColumn(name = "idEvent"))
	private Set<Event> events;

	@ManyToMany
	@JsonIgnore
	@JoinTable(name = "tourist_status", joinColumns = @JoinColumn(name = "username"), inverseJoinColumns = @JoinColumn(name = "idStatus"))
	private Set<Status> status;

	public Tourist() {
		// TODO Auto-generated constructor stub
	}

	public Tourist(String name, String surname, String email, String phoneNumber) {
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.events = new HashSet<Event>();
		this.status = new HashSet<Status>();
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

	public Set<Event> getEvents() {
		return events;
	}

	public void setEvents(Set<Event> events) {
		this.events = events;
	}

	public Set<Status> getStatus() {
		return status;
	}

	public void setStatus(Set<Status> status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return this.name + " " + this.surname + " " + this.email + " " + this.phoneNumber;
	}
}
