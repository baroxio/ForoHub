package com.alura.foro.api.dto.topico;

import com.alura.foro.api.modelo.Topico;

public record DatosRespuestaTopico(String titulo, String mensaje, String autor, String curso, String estado, String fechaCreacion) {

    public DatosRespuestaTopico(Topico topico) {
        this(topico.getTitulo(), topico.getMensaje(), topico.getAutor().getNombre(), topico.getCurso().getNombre(), topico.getEstado().toString(), topico.getFechaCreacion().toString());
    }
}
