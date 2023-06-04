package pe.com.fitfuel.service;

import pe.com.fitfuel.models.Nutricionista;

import java.util.List;

public interface NutricionistaService {
    List<Nutricionista> findAll();
    Nutricionista findById(Integer id);
    Nutricionista add(Nutricionista n);
    Nutricionista update(Nutricionista n);
    Nutricionista delete(Nutricionista n);
}
