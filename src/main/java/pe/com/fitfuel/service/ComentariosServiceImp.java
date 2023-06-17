package pe.com.fitfuel.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.fitfuel.models.Comentarios;
import pe.com.fitfuel.repository.ComentariosRepositorio;

import java.util.List;

@Service
public class ComentariosServiceImp implements ComentariosService{
    @Autowired
    private ComentariosRepositorio comentariosRepositorio;


    @Override
    public List<Comentarios> findAll() {
        return comentariosRepositorio.findAll();
    }

    @Override
    public Comentarios findById(Integer id) {
        return comentariosRepositorio.findById(id).get();
    }

    @Override
    public Comentarios add(Comentarios c) {
        return comentariosRepositorio.save(c);
    }

    @Override
    public Comentarios update(Comentarios c) {
        Comentarios comentarios = comentariosRepositorio.getReferenceById(c.getId());
        BeanUtils.copyProperties(c,comentarios);
        return comentariosRepositorio.save(comentarios);
    }

    @Override
    public Comentarios delete(Comentarios c) {
       comentariosRepositorio.deleteById(c.getId());
       return null;
    }
}
