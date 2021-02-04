package com.example.demo.model;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	private String image;

	@ManyToMany(mappedBy = "events")
	private Set<Tourist> tourists;

	public Event() {
		// TODO Auto-generated constructor stub
	}

	public Event(String nameEvent, Date dateStartEvent, Date dateEndEvent, double amountEvent, String image) {
		this.nameEvent = nameEvent;
		this.dateStartEvent = dateStartEvent;
		this.dateEndEvent = dateEndEvent;
		this.amountEvent = amountEvent;
		this.image = image;
		this.tourists = new HashSet<Tourist>();
	}

	public Event(String nameEvent, Date dateStartEvent, Date dateEndEvent, double amountEvent, String image,
			Set<Tourist> tourists) {
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

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Set<Tourist> getTourists() {
		return tourists;
	}

	public void setTourists(Set<Tourist> tourists) {
		this.tourists = tourists;
	}

	public double getAmountEvent() {
		return amountEvent;
	}

	public void setAmountEvent(double amountEvent) {
		this.amountEvent = amountEvent;
	}
}