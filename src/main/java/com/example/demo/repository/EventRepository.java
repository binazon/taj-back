package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Event;

public interface EventRepository extends JpaRepository<Event, String> {
	
	//@SqlResultSetMapping
	@Query(value="SELECT id_event, amount_event, date_end_event, date_start_event, image, name_event FROM event", nativeQuery = true)
	public List<Event> findAll();
}
