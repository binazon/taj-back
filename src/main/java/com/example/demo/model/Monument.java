package com.example.demo.model;

import java.io.Serializable;
import java.sql.Blob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Monument implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idMonument")
	private Long idMonument;

	@Column
	private String entitledMonument;

	@Column
	private String adresseMonument;

	@Column
	private int capacityMonument;

	@Column
	private Blob image;

	public Monument() {
		// TODO Auto-generated constructor stub
	}

	public Monument(String entitledMonument, String adresseMonument, int capacityMonument, Blob image) {
		this.entitledMonument = entitledMonument;
		this.adresseMonument = adresseMonument;
		this.capacityMonument = capacityMonument;
		this.image = image;
	}

	public String getEntitledMonument() {
		return entitledMonument;
	}

	public void setEntitledMonument(String entitledMonument) {
		this.entitledMonument = entitledMonument;
	}

	public String getAdresseMonument() {
		return adresseMonument;
	}

	public void setAdresseMonument(String adresseMonument) {
		this.adresseMonument = adresseMonument;
	}

	public int getCapacityMonument() {
		return capacityMonument;
	}

	public void setCapacityMonument(int capacityMonument) {
		this.capacityMonument = capacityMonument;
	}

	public Blob getImage() {
		return image;
	}

	public void setImage(Blob image) {
		this.image = image;
	}

}
