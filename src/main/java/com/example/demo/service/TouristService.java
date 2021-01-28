package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Tourist;
import com.example.demo.repository.TouristRepository;

@Service
public class TouristService {

	@Autowired
	private TouristRepository touristRepository;

	// create
	public Tourist addTourist(String name, String surname, String email, String phoneNumber) {
		return touristRepository.save(new Tourist(name, surname, email, phoneNumber));
	}

	// retrieve
	public List<Tourist> getAllTourist() {
		return touristRepository.findAll();
	}

	// update
	public Tourist updateTourist(String username, String name, String surname) {
		Tourist touristSearch = touristRepository.findByUsername(username);
		touristSearch.setName(name);
		touristSearch.setSurname(surname);
		return touristSearch;
	}

	// delete
	public void deleteTourist(String username) {
		touristRepository.delete(touristRepository.findByUsername(username));
	}

}
