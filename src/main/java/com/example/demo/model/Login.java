package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Login implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@OneToOne
	@Id
	@JoinColumn(name = "username")
	private Tourist tourist;

	@Id
	@Column
	private String passwd;

	public Login() {
		// TODO Auto-generated constructor stub
	}

}
