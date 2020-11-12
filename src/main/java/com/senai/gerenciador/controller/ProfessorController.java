package com.senai.gerenciador.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProfessorController {
    
    @RequestMapping("/professor/novo")
    public String novo(){
        return "CadastroProfessor"; // nome do arquivo html
    }
}
