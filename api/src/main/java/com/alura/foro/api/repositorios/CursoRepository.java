package com.alura.foro.api.repositorios;

import com.alura.foro.api.modelo.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Long> {
}
