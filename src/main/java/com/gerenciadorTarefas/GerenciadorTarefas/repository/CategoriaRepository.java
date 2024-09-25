package com.gerenciadorTarefas.GerenciadorTarefas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gerenciadorTarefas.GerenciadorTarefas.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}