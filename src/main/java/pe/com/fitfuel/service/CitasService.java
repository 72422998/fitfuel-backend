package pe.com.fitfuel.service;

import pe.com.fitfuel.models.Citas;

import java.util.List;

public interface CitasService {
    List<Citas>findAll();
    Citas findById(Integer id);
    Citas add(Citas c);
    Citas update(Citas c);
    Citas delete(Citas c);


}
