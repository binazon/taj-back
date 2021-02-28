package com.example.demo.model;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Status implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idStatus")
	private Long idStatus;

	@Column
	private String nameStatus;

	@Column
	private Date creationDate;

	@Column
	private int amountVisit;

	@Column
	private String image;

	@JsonIgnore
	@ManyToMany(mappedBy = "status")
	private Set<Tourist> tourists;

	public Status() {
		// TODO Auto-generated constructor stub
	}

	public Status(String nameStatus, Date creationDate, int amountVisit, String image, List<Tourist> tourists) {
		this.nameStatus = nameStatus;
		this.creationDate = creationDate;
		this.amountVisit = amountVisit;
		this.image = image;
		this.tourists = new HashSet<Tourist>();
	}

	public String getNameStatus() {
		return nameStatus;
	}

	public void setNameStatus(String nameStatus) {
		this.nameStatus = nameStatus;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
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

	public int getAmountVisit() {
		return amountVisit;
	}

	public void setAmountVisit(int amountVisit) {
		this.amountVisit = amountVisit;
	}
}
