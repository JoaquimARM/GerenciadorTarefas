package com.gerenciadorTarefas.GerenciadorTarefas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.gerenciadorTarefas.GerenciadorTarefas.model.Tarefa;
import com.gerenciadorTarefas.GerenciadorTarefas.repository.TarefaRepository;

import java.util.List;

@Controller
public class TarefaController {

    @Autowired
    private TarefaRepository tarefaRepository;

    @GetMapping("/tarefas")
    public String listarTarefas(Model model) {
        List<Tarefa> tarefas = tarefaRepository.findAll();
        model.addAttribute("tarefas", tarefas);
        return "listarTarefas";
    }

    @GetMapping("/tarefas/nova")
    public String novaTarefaForm(Model model) {
        model.addAttribute("tarefa", new Tarefa());
        return "formTarefa";
    }

    @PostMapping("/tarefas")
    public String criarTarefa(@ModelAttribute Tarefa tarefa) {
        tarefaRepository.save(tarefa);
        return "redirect:/tarefas";
    }
}