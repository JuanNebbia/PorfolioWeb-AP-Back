package ar.gob.argentinaprograma.Porfolio.services;

import ar.gob.argentinaprograma.Porfolio.exception.UserNotFoundException;
import ar.gob.argentinaprograma.Porfolio.models.Informacion;
import ar.gob.argentinaprograma.Porfolio.repository.InformacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class InformacionService {
    private final InformacionRepository informacionRepository;

    @Autowired
    public InformacionService(InformacionRepository informacionRepository) {
        this.informacionRepository = informacionRepository;
    }
    
    public Informacion addInformacion(Informacion informacion){
        return informacionRepository.save(informacion);
    }
    
     public List<Informacion> getInformacion(){
        return informacionRepository.findAll();
    }
    
    public Informacion updateInformacion(Informacion informacion){
        return informacionRepository.save(informacion);
    }
    
    public void deleteInformacion(Long id){
        informacionRepository.deleteById(id);
    }
    
     public Informacion findInformacion(Long id){
        return informacionRepository.findById(id).orElseThrow(()->new UserNotFoundException("Usuario no encontrado"));
    }
    
}
