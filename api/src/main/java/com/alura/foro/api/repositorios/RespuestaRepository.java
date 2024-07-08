package com.alura.foro.api.repositorios;

import com.alura.foro.api.modelo.Respuesta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RespuestaRepository extends JpaRepository<Respuesta, Long> {
}
