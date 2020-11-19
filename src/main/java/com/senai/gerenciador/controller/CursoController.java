package com.senai.gerenciador.controller;

import com.senai.gerenciador.model.Curso;
import com.senai.gerenciador.repository.Cursos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/curso")
public class CursoController{

    //auto injetor de dados
    @Autowired
    private Cursos cursos;

@RequestMapping(method=RequestMethod.POST)
public ModelAndView salvar(Curso curso){
    cursos.save(curso);
    ModelAndView mv = new ModelAndView("CadastroCurso");
    mv.addObject("mensagem","Curso salvo com sucesso");
    return mv;
}

@RequestMapping("/curso/novo")
public String novo(){
    // chama a página Html CadastroProfessor
    //o texto do return deve estar exatamente igual ao nome do arquivo html
    return "CadastroCurso"; 
    
}
}