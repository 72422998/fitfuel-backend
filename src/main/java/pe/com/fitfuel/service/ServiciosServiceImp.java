package pe.com.fitfuel.service;


import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.fitfuel.models.Servicios;
import pe.com.fitfuel.repository.ServiciosRepositorio;

import java.util.List;

@Service
public class ServiciosServiceImp implements ServiciosService{
    @Autowired
    private ServiciosRepositorio serviciosRepositorio;

    @Override
    public List<Servicios> findAll() {
        return serviciosRepositorio.findAll();
    }

    @Override
    public Servicios findById(Integer id) {
        return serviciosRepositorio.findById(id).get();
    }


    @Override
    public Servicios add(Servicios s) {
        return serviciosRepositorio.save(s);
    }

    @Override
    public Servicios update(Servicios s) {
        Servicios servicios = serviciosRepositorio.getReferenceById(s.getId());
        BeanUtils.copyProperties(s,servicios);
        return serviciosRepositorio.save(servicios);
    }

    @Override
    public Servicios delete(Servicios s) {
        serviciosRepositorio.deleteById(s.getId());
        return null;
    }
}
