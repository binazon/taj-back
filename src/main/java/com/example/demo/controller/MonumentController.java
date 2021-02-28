package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Monument;
import com.example.demo.service.MonumentService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping
public class MonumentController {

	@Autowired
	private MonumentService monumentService;

	@RequestMapping("/infos")
	public Monument monumentInfos() {
		return monumentService.getAllMonument().get(0);
	}

}
