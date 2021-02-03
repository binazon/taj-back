package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Status;
import com.example.demo.service.StatusService;

@RestController
public class StatusController {

	@Autowired
	private StatusService statusService;

	@RequestMapping("/listStatus")
	public List<Status> listStatus() {
		return statusService.getAllStatus();
	}

}
