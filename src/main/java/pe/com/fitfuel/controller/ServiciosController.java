package pe.com.fitfuel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import pe.com.fitfuel.models.Servicios;
import pe.com.fitfuel.service.ServiciosService;

import java.util.List;

@RestController
@RequestMapping("/servicios")
public class ServiciosController {
    @Autowired
    private ServiciosService serviciosService;
    @GetMapping("/listar")
    public List<Servicios>findAll(){
        return serviciosService.findAll();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Servicios> findById(@PathVariable Integer id){
        Servicios servicios = serviciosService.findById(id);
        if(servicios == null){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Nutricionista no encontrado");
        }
        return ResponseEntity.ok(servicios);
    }
    @PostMapping("/save")
    public Servicios add(@RequestBody Servicios s){
        return serviciosService.add(s);
    }
    @PutMapping("/{id}")
    public Servicios update(@PathVariable Integer id,@RequestBody Servicios s){
        s.setId(id);
        return serviciosService.update(s);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id){
        Servicios s = serviciosService.findById(id);
        serviciosService.delete(s);
    }
}
