package ar.gob.argentinaprograma.Porfolio.controller;

import ar.gob.argentinaprograma.Porfolio.models.Habilidades;
import ar.gob.argentinaprograma.Porfolio.services.HabilidadesService;
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
@RequestMapping("/habilidades")
public class HabilidadesController {
    private final HabilidadesService habilidadesService;

    public HabilidadesController(HabilidadesService habilidadesService) {
        this.habilidadesService = habilidadesService;
    }
    
    @GetMapping("/all")
    public ResponseEntity<List<Habilidades>> getHabilidades(){
        List<Habilidades> habilidades = habilidadesService.getHabilidades();
        return new ResponseEntity<>(habilidades, HttpStatus.OK);
    }
    
    @GetMapping("/id/{id}")
    public ResponseEntity<Habilidades> findHabilidades(@PathVariable("id")Long id){
        Habilidades habilidades = habilidadesService.findHabilidades(id);
        return new ResponseEntity<>(habilidades, HttpStatus.OK);
    }
    
     @PutMapping("/update")
    public ResponseEntity<Habilidades> updateHabilidades(@RequestBody Habilidades habilidades){
        Habilidades updateHabilidades=habilidadesService.updateHabilidades(habilidades);
        return new ResponseEntity<>(updateHabilidades, HttpStatus.OK);
    }
    
    @PostMapping("/add")
    public ResponseEntity<Habilidades> addHabilidades(@RequestBody Habilidades habilidades){
        Habilidades newHabilidades = habilidadesService.addHabilidades(habilidades);
        return new ResponseEntity<>(newHabilidades, HttpStatus.CREATED);    
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Habilidades> deleteHabilidades(@PathVariable("id")Long id){
        habilidadesService.deleteHabilidades(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}

