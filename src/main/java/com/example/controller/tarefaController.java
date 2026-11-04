package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.entity.Tarefa;

@Controller
@RequestMapping("/tarefas")
public class tarefaController {
	@GetMapping("/cadastro")
	public String cadastro(Tarefa tarefa) {
		return "/tarefa/cadastro";
	}
}
