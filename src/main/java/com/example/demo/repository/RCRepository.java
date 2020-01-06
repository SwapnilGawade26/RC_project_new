package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.RCRegistration;

public interface RCRepository extends JpaRepository<RCRegistration, Long> {

	public RCRegistration findByrCNoIgnoreCase(String rcNo);

	public RCRegistration findByOwnerNameIgnoreCase(String ownerName);
}
