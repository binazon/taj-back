package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Status;
import com.example.demo.repository.StatusRepository;

@Service
public class StatusService {

	@Autowired
	private StatusRepository statusRepository;

	// retrieve
	public List<Status> getAllStatus() {
		return statusRepository.findAll();
	}

}
