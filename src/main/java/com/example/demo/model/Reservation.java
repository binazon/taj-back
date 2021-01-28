package com.example.demo.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Reservation implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idReservation")
	private Long idReservation;

	@Column
	private Date dateReservation;

	@Column
	private double amountReservation;

	@Column
	private int numberPerson;

	@ManyToOne
	@JoinColumn(name = "username")
	private Tourist tourist;

	public Reservation(Date dateReservation, double amountReservation, int numberPerson, Tourist tourist) {
		this.dateReservation = dateReservation;
		this.amountReservation = amountReservation;
		this.numberPerson = numberPerson;
		this.tourist = tourist;
	}
}
