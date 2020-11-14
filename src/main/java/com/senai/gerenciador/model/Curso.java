package com.senai.gerenciador.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Curso {
    
    @Id
    @GeneratedValue
    private int ID_CURSO;

    @Column(nullable = false)
    private String CURSO;


    public Curso() {
    }

    public Curso(String CURSO) {
        this.CURSO = CURSO;
    }
   
    public int getID_CURSO() {
        return this.ID_CURSO;
    }

    public void setID_CURSO(int ID_CURSO) {
        this.ID_CURSO = ID_CURSO;
    }

    public String getCURSO() {
        return this.CURSO;
    }

    public void setCURSO(String CURSO) {
        this.CURSO = CURSO;
    }
}
