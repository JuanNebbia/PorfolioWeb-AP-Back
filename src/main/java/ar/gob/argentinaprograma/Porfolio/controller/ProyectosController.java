package ar.gob.argentinaprograma.Porfolio.controller;

import ar.gob.argentinaprograma.Porfolio.models.Proyectos;
import ar.gob.argentinaprograma.Porfolio.services.ProyectosService;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/proyectos")
public class ProyectosController {
    private final ProyectosService proyectosService;

    public ProyectosController(ProyectosService proyectosService) {
        this.proyectosService = proyectosService;
    }
    
    @GetMapping("/all")
    public ResponseEntity<List<Proyectos>> getProyectos(){
        List<Proyectos> proyectos = proyectosService.getProyectos();
        return new ResponseEntity<>(proyectos, HttpStatus.OK);
    }
    
    @GetMapping("/id/{id}")
    public ResponseEntity<Proyectos> findProyectos(@PathVariable("id")Long id){
        Proyectos proyectos = proyectosService.findProyectos(id);
        return new ResponseEntity<>(proyectos, HttpStatus.OK);
    }
    
     @PutMapping("/update")
    public ResponseEntity<Proyectos> updateProyectos(@RequestBody Proyectos proyectos){
        Proyectos updateProyectos=proyectosService.updateProyectos(proyectos);
        return new ResponseEntity<>(updateProyectos, HttpStatus.OK);
    }
    
    @PostMapping("/add")
    public ResponseEntity<Proyectos> addProyectos(@RequestBody Proyectos proyectos){
        Proyectos newProyectos = proyectosService.addProyectos(proyectos);
        return new ResponseEntity<>(newProyectos, HttpStatus.CREATED);    
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Proyectos> deleteProyectos(@PathVariable("id")Long id){
        proyectosService.deleteProyectos(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}

