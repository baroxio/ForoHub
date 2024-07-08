package com.alura.foro.api.repositorios;

import com.alura.foro.api.modelo.Topico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicoRepository extends JpaRepository<Topico, Long> {
}
