package com.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.model.Pessoa;

public interface Repository extends JpaRepository<Pessoa, Long> {

}


