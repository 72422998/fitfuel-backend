package pe.com.fitfuel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.com.fitfuel.models.Nutricionista;
import pe.com.fitfuel.service.NutricionistaService;

import java.util.List;

@RestController
@RequestMapping("/nutricionista")
public class NutricionistaController {
    @Autowired
    private NutricionistaService nutricionistaService;

    @GetMapping("/listar")
    public List<Nutricionista> findAll(){
        return nutricionistaService.findAll();
    }
    @PostMapping
    public Nutricionista add(@RequestBody Nutricionista n){
        return nutricionistaService.add(n);
    }
    @PutMapping("/{id}")
    public Nutricionista update(@PathVariable Integer id,@RequestBody Nutricionista n){
        n.setId(id);
        return nutricionistaService.update(n);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id){
        Nutricionista n = nutricionistaService.findById(id);
        nutricionistaService.delete(n);
    }
}
