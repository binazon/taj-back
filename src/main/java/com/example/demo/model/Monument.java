package com.example.demo.model;

import java.io.Serializable;

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

	public Monument(String entitledMonument, String adresseMonument, int capacityMonument) {
		this.entitledMonument = entitledMonument;
		this.adresseMonument = adresseMonument;
		this.capacityMonument = capacityMonument;
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
}
