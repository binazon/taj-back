package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Tourist;

@Repository
public interface TouristRepository extends JpaRepository<Tourist, String> {

	public Tourist findByUsername(String userName);
	public List<Tourist> findByName(String name);
}
