package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Event;

public interface EventRepository extends JpaRepository<Event, String> {
	public List<Event> findAll();
}
