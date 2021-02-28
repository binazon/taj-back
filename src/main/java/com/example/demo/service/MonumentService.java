package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Monument;
import com.example.demo.repository.MonumentRepository;

@Service
public class MonumentService {

	@Autowired
	private MonumentRepository monumentRepository;

	public List<Monument> getAllMonument() {
		return monumentRepository.findAll();
	}

}
