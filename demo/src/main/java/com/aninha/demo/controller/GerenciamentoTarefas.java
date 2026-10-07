package com.aninha.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/gerenciamento-tarefas")
public class GerenciamentoTarefas {

    @GetMapping
    public String paginaInicial(Model model) {

        String mensagemDoJava = "Olá! Este texto foi gerado puramente no Java!";
        model.addAttribute("mensagem", mensagemDoJava);

        return "index";
    }
}