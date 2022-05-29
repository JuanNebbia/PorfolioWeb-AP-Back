package ar.gob.argentinaprograma.Porfolio.services;

import ar.gob.argentinaprograma.Porfolio.exception.UserNotFoundException;
import ar.gob.argentinaprograma.Porfolio.models.Habilidades;
import ar.gob.argentinaprograma.Porfolio.repository.HabilidadesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class HabilidadesService {
    private final HabilidadesRepository habilidadesRepository;

    @Autowired
    public HabilidadesService(HabilidadesRepository habilidadesRepository) {
        this.habilidadesRepository = habilidadesRepository;
    }
    
    public Habilidades addHabilidades(Habilidades habilidades){
        return habilidadesRepository.save(habilidades);
    }
    
     public List<Habilidades> getHabilidades(){
        return habilidadesRepository.findAll();
    }
    
    public Habilidades updateHabilidades(Habilidades habilidades){
        return habilidadesRepository.save(habilidades);
    }
    
    public void deleteHabilidades(Long id){
        habilidadesRepository.deleteById(id);
    } 
    
    public Habilidades findHabilidades(Long id){
        return habilidadesRepository.findById(id).orElseThrow(()->new UserNotFoundException("Usuario no encontrado"));
    }
}
