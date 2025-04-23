package com.gaulab.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gaulab.demo.model.Box;

public interface BoxRepository extends JpaRepository<Box, Long> {
}
