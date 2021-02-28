package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Monument;

public interface MonumentRepository extends JpaRepository<Monument, String> {
	public List<Monument> findAll();
}
