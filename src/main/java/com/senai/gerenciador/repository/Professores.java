package com.senai.gerenciador.repository;

import com.senai.gerenciador.model.Professor;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Professores extends JpaRepository<Professor, Long> {
    //o próprio Spring faz a implementação da interface pra nós.
    //basta que a gente informe o modelo de dados
}
