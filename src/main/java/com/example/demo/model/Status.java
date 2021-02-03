package com.example.demo.model;

import java.io.Serializable;
import java.sql.Blob;
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
	private Blob image;

	@ManyToMany
	@JoinTable(name = "tourist_status", joinColumns = @JoinColumn(name = "idStatus"), inverseJoinColumns = @JoinColumn(name = "username"))
	private List<Tourist> tourists;

	public Status(String nameStatus, Date creationDate, int amountVisit, Blob image, List<Tourist> tourists) {
		this.nameStatus = nameStatus;
		this.creationDate = creationDate;
		this.amountVisit = amountVisit;
		this.image = image;
		this.tourists = tourists;
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

	public Blob getImage() {
		return image;
	}

	public void setImage(Blob image) {
		this.image = image;
	}

	public List<Tourist> getTourists() {
		return tourists;
	}

	public void addAllTourists(List<Tourist> tourists) {
		this.tourists.addAll(tourists);
	}

	public int getAmountVisit() {
		return amountVisit;
	}

	public void setAmountVisit(int amountVisit) {
		this.amountVisit = amountVisit;
	}
}
