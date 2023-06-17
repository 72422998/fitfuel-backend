package pe.com.fitfuel.service;

import pe.com.fitfuel.models.Servicios;

import java.util.List;

public interface ServiciosService {
    List<Servicios>findAll();
    Servicios findById(Integer id);
    Servicios add(Servicios s);
    Servicios update(Servicios s);
    Servicios delete(Servicios s);
}
