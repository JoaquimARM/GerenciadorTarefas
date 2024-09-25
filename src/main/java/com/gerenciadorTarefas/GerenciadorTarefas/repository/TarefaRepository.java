package com.gerenciadorTarefas.GerenciadorTarefas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gerenciadorTarefas.GerenciadorTarefas.model.Tarefa;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
}