package com.senai.gerenciador.controller;

import com.senai.gerenciador.model.Professor;
import com.senai.gerenciador.repository.Professores;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/professor")
public class ProfessorController{

    //auto injetor de dados
    @Autowired
    private Professores professores;

@RequestMapping(method=RequestMethod.POST)
public ModelAndView salvar(Professor professor){
    professores.save(professor);
    ModelAndView mv = new ModelAndView("CadastroProfessor");
    mv.addObject("mensagem","professor salvo com sucesso");
    return mv;
}

@RequestMapping("/professor/novo")
public String novo(){
    // chama a página Html CadastroProfessor
    //o texto do return deve estar exatamente igual ao nome do arquivo html
    return "CadastroProfessor"; 
    
}
}
