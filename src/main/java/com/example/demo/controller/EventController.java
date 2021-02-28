package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Event;
import com.example.demo.service.EventService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping
public class EventController {

	@Autowired
	private EventService eventService;

	@RequestMapping("/events")
	public List<Event> listEvents() {
		return eventService.getAllEvent();
	}

}
