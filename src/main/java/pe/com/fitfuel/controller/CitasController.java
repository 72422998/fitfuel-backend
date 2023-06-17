package pe.com.fitfuel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import pe.com.fitfuel.models.Citas;
import pe.com.fitfuel.service.CitasService;

import java.util.List;

@RestController
@RequestMapping("/citas")
public class CitasController {
    @Autowired
    private CitasService citasService;
    @GetMapping("/listar")
    public List<Citas>findAll(){
        return citasService.findAll();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Citas>findByid(@PathVariable Integer id){
        Citas citas = citasService.findById(id);
        if(citas == null){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Cita no encontrada");
        }
        return ResponseEntity.ok(citas);
    }
    @PostMapping("/save")
    public Citas add(@RequestBody Citas c){
        return citasService.add(c);
    }
    @PutMapping("/{id}")
    public Citas update(@PathVariable Integer id,@RequestBody Citas c){
        c.setId(id);
        return citasService.update(c);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id){
        Citas c = citasService.findById(id);
        citasService.delete(c);
    }
}
