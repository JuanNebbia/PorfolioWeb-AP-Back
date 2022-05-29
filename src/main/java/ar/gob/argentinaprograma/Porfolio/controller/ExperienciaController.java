package ar.gob.argentinaprograma.Porfolio.controller;

import ar.gob.argentinaprograma.Porfolio.models.Experiencia;
import ar.gob.argentinaprograma.Porfolio.services.ExperienciaService;
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
@RequestMapping("/experiencia")
public class ExperienciaController {
    private final ExperienciaService experienciaService;

    public ExperienciaController(ExperienciaService experienciaService) {
        this.experienciaService = experienciaService;
    }
    
    @GetMapping("/all")
    public ResponseEntity<List<Experiencia>> getExperiencia(){
        List<Experiencia> experiencias = experienciaService.getExperiencia();
        return new ResponseEntity<>(experiencias, HttpStatus.OK);
    }
    
    @GetMapping("/id/{id}")
    public ResponseEntity<Experiencia> findExperiencia(@PathVariable("id")Long id){
        Experiencia experiencia = experienciaService.findExperiencia(id);
        return new ResponseEntity<>(experiencia, HttpStatus.OK);
    }
    
     @PutMapping("/update")
    public ResponseEntity<Experiencia> updateExperiencia(@RequestBody Experiencia experiencia){
        Experiencia updateExperiencia=experienciaService.updateExperiencia(experiencia);
        return new ResponseEntity<>(updateExperiencia, HttpStatus.OK);
    }
    
    @PostMapping("/add")
    public ResponseEntity<Experiencia> addExperiencia(@RequestBody Experiencia experiencia){
        Experiencia newExperiencia = experienciaService.addExperiencia(experiencia);
        return new ResponseEntity<>(newExperiencia, HttpStatus.CREATED);    
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Experiencia> deleteExperiencia(@PathVariable("id")Long id){
        experienciaService.deleteExperiencia(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
