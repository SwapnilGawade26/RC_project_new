package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.RCRegistration;

public interface RCRepository extends JpaRepository<RCRegistration, Long> {

}
