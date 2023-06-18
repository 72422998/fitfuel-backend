package pe.com.fitfuel.service;

import pe.com.fitfuel.models.Comentarios;

import java.util.List;

public interface ComentariosService {
List<Comentarios> findAll();
Comentarios findById(Integer id);
Comentarios add(Comentarios c);
Comentarios update(Comentarios c);
Comentarios delete(Comentarios c);
}
