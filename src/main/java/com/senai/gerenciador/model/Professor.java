package com.senai.gerenciador.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity //
public class Professor implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID_PROFESSOR;

    @Column(nullable = false)
    private String NOME;

    protected Professor() {

    }

    public Professor(String nome) {
        this.NOME = nome;
    }

    public int getID_PROFESSOR() {
        return this.ID_PROFESSOR;
    }

    public void setID_PROFESSOR(int ID_PROFESSOR) {
        this.ID_PROFESSOR = ID_PROFESSOR;
    }

    public String getNOME() {
        return this.NOME;
    }

    public void setNOME(String NOME) {
        this.NOME = NOME;
    }
}
