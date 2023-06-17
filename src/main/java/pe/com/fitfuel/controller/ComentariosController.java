package pe.com.fitfuel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import pe.com.fitfuel.models.Comentarios;
import pe.com.fitfuel.service.ComentariosService;

import java.util.List;

@RestController
@RequestMapping("/comentarios")
public class ComentariosController {
    @Autowired
    private ComentariosService comentariosService;
    @GetMapping("/listar")
    public List<Comentarios>findAll(){
        return comentariosService.findAll();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Comentarios>findById(@PathVariable Integer id){
        Comentarios comentarios = comentariosService.findById(id);
        if(comentarios == null){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Comentario no encontrado");
        }
        return ResponseEntity.ok(comentarios);
    }
    @PostMapping("/save")
    public Comentarios add(@RequestBody Comentarios c){
        return comentariosService.add(c);
    }
    @PutMapping("/{id}")
    public Comentarios update(@PathVariable Integer id,@RequestBody Comentarios c){
        c.setId(id);
        return comentariosService.update(c);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id){
        Comentarios c= comentariosService.findById(id);
        comentariosService.delete(c);
    }
}
