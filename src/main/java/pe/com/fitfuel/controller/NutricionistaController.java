package pe.com.fitfuel.controller;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import pe.com.fitfuel.models.Nutricionista;
import pe.com.fitfuel.service.NutricionistaService;

import java.util.List;

@RestController
@RequestMapping("/nutricionista")
public class NutricionistaController {
    private static final Logger logger = LoggerFactory.getLogger(NutricionistaController.class);
    @Autowired
    private NutricionistaService nutricionistaService;

    @GetMapping("/listar")
    public ResponseEntity<List<Nutricionista>> findAll(){
        logger.info("Metodo findAll() invocado");
        List<Nutricionista> nutricionista = nutricionistaService.findAll();
        logger.debug("Se encontraron {} nutricionistas",nutricionista.size());
        return  ResponseEntity.ok(nutricionista);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Nutricionista> findById(@PathVariable Integer id){
        Nutricionista nutricionista = nutricionistaService.findById(id);
        if(nutricionista == null){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Nutricionista no encontrado");
        }
        return ResponseEntity.ok(nutricionista);
    }
    @PostMapping("/save")
    public ResponseEntity<Nutricionista> add(@RequestBody Nutricionista n){
        logger.info("Metodo add() invocado");
        Nutricionista newNutricionista = nutricionistaService.add(n);
        logger.debug("Se agrego un nuevo nutricionista con ID: {}", newNutricionista.getId());
        return ResponseEntity.status(HttpStatus.CREATED).body(newNutricionista);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Nutricionista> update(@PathVariable Integer id,@RequestBody Nutricionista n){
        logger.info("Metodo update() invocado para el nutricionista con ID:{}",id);
        Nutricionista existingNutricionista = nutricionistaService.findById(id);
        if(existingNutricionista == null){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Nutricionista no encontrado");
        }
        n.setId(id);
        Nutricionista updateNutricionista = nutricionistaService.update(n);
        logger.info("Se actualizo el nutricionista con ID:{}",id);
        return ResponseEntity.ok(updateNutricionista);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id){
        logger.info("Metodo delete invocado para el nutricionista con ID:{}",id);
        Nutricionista existingNutricionista = nutricionistaService.findById(id);
        if(existingNutricionista == null){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Nutricionista no encontrado");
        }
        nutricionistaService.delete(existingNutricionista);
        logger.info("Se elimino el nutricionista con ID:{}",id);
        return ResponseEntity.noContent().build();
    }
}
