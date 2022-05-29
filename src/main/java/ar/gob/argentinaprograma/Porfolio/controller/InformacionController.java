package ar.gob.argentinaprograma.Porfolio.controller;

import ar.gob.argentinaprograma.Porfolio.models.Informacion;
import ar.gob.argentinaprograma.Porfolio.services.InformacionService;
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
@RequestMapping("/informacion")
public class InformacionController {
    private final InformacionService informacionService;

    public InformacionController(InformacionService informacionService) {
        this.informacionService = informacionService;
    }
    
     @GetMapping("/all")
    public ResponseEntity<List<Informacion>> getInformacion(){
        List<Informacion> informaciones = informacionService.getInformacion();
        return new ResponseEntity<>(informaciones, HttpStatus.OK);
    }
    
    @GetMapping("/id/{id}")
    public ResponseEntity<Informacion> findInformacion(@PathVariable("id")Long id){
        Informacion informacion = informacionService.findInformacion(id);
        return new ResponseEntity<>(informacion, HttpStatus.OK);
    }
    
     @PutMapping("/update")
    public ResponseEntity<Informacion> updateInformacion(@RequestBody Informacion informacion){
        Informacion updateInformacion=informacionService.updateInformacion(informacion);
        return new ResponseEntity<>(updateInformacion, HttpStatus.OK);
    }
    
    @PostMapping("/add")
    public ResponseEntity<Informacion> addInformacion(@RequestBody Informacion informacion){
        Informacion newInformacion = informacionService.addInformacion(informacion);
        return new ResponseEntity<>(newInformacion, HttpStatus.CREATED);    
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Informacion> deleteInformacion(@PathVariable("id")Long id){
        informacionService.deleteInformacion(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}

