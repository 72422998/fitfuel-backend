package pe.com.fitfuel.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.fitfuel.models.Citas;
import pe.com.fitfuel.repository.CitasRepositorio;

import java.util.List;
@Service
public class CitasServiceImp implements  CitasService{
    @Autowired
    private CitasRepositorio citasRepositorio;

    @Override
    public List<Citas> findAll() {
        return citasRepositorio.findAll();
    }

    @Override
    public Citas findById(Integer id) {
        return citasRepositorio.findById(id).get();
    }

    @Override
    public Citas add(Citas c) {
        return citasRepositorio.save(c);
    }

    @Override
    public Citas update(Citas c) {
        Citas citas = citasRepositorio.getReferenceById(c.getId());
        BeanUtils.copyProperties(c,citas);
        return citasRepositorio.save(citas);
    }

    @Override
    public Citas delete(Citas c) {
        citasRepositorio.deleteById(c.getId());
        return null;
    }
}
