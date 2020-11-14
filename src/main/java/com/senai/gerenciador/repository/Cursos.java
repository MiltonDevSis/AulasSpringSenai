package com.senai.gerenciador.repository;

import com.senai.gerenciador.model.Curso;

import org.springframework.data.jpa.repository.JpaRepository;


public interface Cursos extends JpaRepository<Curso, Long>{
    
} 
