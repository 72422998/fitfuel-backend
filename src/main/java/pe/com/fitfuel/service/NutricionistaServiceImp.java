package pe.com.fitfuel.service;

import jakarta.transaction.Transactional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.fitfuel.models.Nutricionista;
import pe.com.fitfuel.repository.NutricionistaRepositorio;

import java.util.List;


@Service
@Transactional
public class NutricionistaServiceImp implements NutricionistaService{
    @Autowired
    private NutricionistaRepositorio nutricionistaRepositorio;

    @Override
    public List<Nutricionista> findAll() {
        return nutricionistaRepositorio.findAll();
    }

    @Override
    public Nutricionista findById(Integer id) {
        return nutricionistaRepositorio.findById(id).orElse(null);
    }

    @Override
    public Nutricionista add(Nutricionista n) {
        return nutricionistaRepositorio.save(n);
    }

    @Override
    public Nutricionista update(Nutricionista n) {
        Nutricionista nutricionista = nutricionistaRepositorio.getReferenceById(n.getId());
        BeanUtils.copyProperties(n,nutricionista);
        return nutricionistaRepositorio.save(nutricionista);
    }

    @Override
    public Nutricionista delete(Nutricionista n) {
        nutricionistaRepositorio.deleteById(n.getId());
        return null;
    }


}
