package ar.gob.argentinaprograma.Porfolio.services;

import ar.gob.argentinaprograma.Porfolio.exception.UserNotFoundException;
import ar.gob.argentinaprograma.Porfolio.models.Educacion;
import ar.gob.argentinaprograma.Porfolio.repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class EducacionService {
    
    private final EducacionRepository educacionRepository;

    @Autowired
    public EducacionService(EducacionRepository educacionRepository) {
        this.educacionRepository = educacionRepository;
    }
    
    public Educacion addEducacion(Educacion educacion){
        return educacionRepository.save(educacion);
    }
    
    public List<Educacion> getEducacion(){
        return educacionRepository.findAll();
    }
    
    public Educacion updateEducacion(Educacion educacion){
        return educacionRepository.save(educacion);
    }
    
    public void deleteEducacion(Long id){
        educacionRepository.deleteById(id);
    }
    
    public Educacion findEducacion(Long id){
        return educacionRepository.findById(id).orElseThrow(()->new UserNotFoundException("Usuario no encontrado"));
    }
}
