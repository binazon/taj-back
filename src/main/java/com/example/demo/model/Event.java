package com.example.demo.model;

import java.io.Serializable;
import java.sql.Blob;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Event implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idEvent")
	private Long idEvent;

	@Column
	private String nameEvent;

	@Column
	private Date dateStartEvent;

	@Column
	private Date dateEndEvent;

	@Column
	private double amountEvent;

	@Column
	private Blob image;

	@ManyToMany
	@JoinTable(name = "tourist_event", joinColumns = @JoinColumn(name = "idEvent"), inverseJoinColumns = @JoinColumn(name = "username"))
	private List<Tourist> tourists;

	public Event(String nameEvent, Date dateStartEvent, Date dateEndEvent, double amountEvent, Blob image) {
		this.nameEvent = nameEvent;
		this.dateStartEvent = dateStartEvent;
		this.dateEndEvent = dateEndEvent;
		this.amountEvent = amountEvent;
		this.image = image;
		this.tourists = new ArrayList<Tourist>();
	}

	public Event(String nameEvent, Date dateStartEvent, Date dateEndEvent, double amountEvent, Blob image,
			List<Tourist> tourists) {
		this.nameEvent = nameEvent;
		this.dateStartEvent = dateStartEvent;
		this.dateEndEvent = dateEndEvent;
		this.amountEvent = amountEvent;
		this.image = image;
		this.tourists = tourists;
	}

	public String getNameEvent() {
		return nameEvent;
	}

	public void setNameEvent(String nameEvent) {
		this.nameEvent = nameEvent;
	}

	public Date getDateStartEvent() {
		return dateStartEvent;
	}

	public void setDateStartEvent(Date dateStartEvent) {
		this.dateStartEvent = dateStartEvent;
	}

	public Date getDateEndEvent() {
		return dateEndEvent;
	}

	public void setDateEndEvent(Date dateEndEvent) {
		this.dateEndEvent = dateEndEvent;
	}

	public double getAmountEvent() {
		return amountEvent;
	}

	public void setAmountEvent(double amountEvent) {
		this.amountEvent = amountEvent;
	}
}