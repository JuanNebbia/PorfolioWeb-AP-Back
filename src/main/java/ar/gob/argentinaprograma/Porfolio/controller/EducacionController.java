package ar.gob.argentinaprograma.Porfolio.controller;

import ar.gob.argentinaprograma.Porfolio.models.Educacion;
import ar.gob.argentinaprograma.Porfolio.services.EducacionService;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/educacion")
@CrossOrigin(origins = "*")
public class EducacionController {
    private final EducacionService educacionService;

    public EducacionController(EducacionService educacionService) {
        this.educacionService = educacionService;
    }
    
    @GetMapping("/all")
    public ResponseEntity<List<Educacion>> getEducacion(){
        List<Educacion> educaciones = educacionService.getEducacion();
        return new ResponseEntity<>(educaciones, HttpStatus.OK);
    }
    
    @GetMapping("/id/{id}")
    public ResponseEntity<Educacion> findEducacion(@PathVariable("id")Long id){
        Educacion educacion = educacionService.findEducacion(id);
        return new ResponseEntity<>(educacion, HttpStatus.OK);
    }
    
    @PutMapping("/update")
    public ResponseEntity<Educacion> updateEducacion(@RequestBody Educacion educacion){
        Educacion updateEducacion=educacionService.updateEducacion(educacion);
        return new ResponseEntity<>(updateEducacion, HttpStatus.OK);
    }
    
    @PostMapping("/add")
    public ResponseEntity<Educacion> addEducacion(@RequestBody Educacion educacion){
        Educacion newEducacion = educacionService.addEducacion(educacion);
        return new ResponseEntity<>(newEducacion, HttpStatus.CREATED);    
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Educacion> deleteEducacion(@PathVariable("id")Long id){
        educacionService.deleteEducacion(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
