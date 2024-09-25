package com.gerenciadorTarefas.GerenciadorTarefas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.gerenciadorTarefas.GerenciadorTarefas.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}