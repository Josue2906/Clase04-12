package com.example.Clase04_12.repository;

import com.example.Clase04_12.model.Persona; 
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<Persona, Integer>{

}
