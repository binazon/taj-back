package com.example.demo.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class History implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idHistory")
	private Long idHistory;

	@ManyToOne
	@JoinColumn(name = "username")
	private Tourist tourist;

	private Set<Reservation> reservations;

	public History(Tourist tourist, Set<Reservation> reservations) {
		this.tourist = tourist;
		this.reservations = reservations;
	}

	public Tourist getTourist() {
		return tourist;
	}

	public void setTourist(Tourist tourist) {
		this.tourist = tourist;
	}

	public Set<Reservation> getReservations() {
		return reservations;
	}

	public void addAllReservations(Set<Reservation> reservations) {
		this.reservations.addAll(reservations);
	}

	public void addReservation(Reservation reservation) {
		this.reservations.add(reservation);
	}
}
