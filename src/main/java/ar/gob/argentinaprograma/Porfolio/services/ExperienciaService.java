package ar.gob.argentinaprograma.Porfolio.services;

import ar.gob.argentinaprograma.Porfolio.exception.UserNotFoundException;
import ar.gob.argentinaprograma.Porfolio.models.Experiencia;
import ar.gob.argentinaprograma.Porfolio.repository.ExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ExperienciaService {
    private final ExperienciaRepository experienciaRepository;

    @Autowired
    public ExperienciaService(ExperienciaRepository experienciaRepository) {
        this.experienciaRepository = experienciaRepository;
    }
    
    public Experiencia addExperiencia(Experiencia experiencia){
        return experienciaRepository.save(experiencia);
    }
    
     public List<Experiencia> getExperiencia(){
        return experienciaRepository.findAll();
    }
    
    public Experiencia updateExperiencia(Experiencia experiencia){
        return experienciaRepository.save(experiencia);
    }
    
    public void deleteExperiencia(Long id){
        experienciaRepository.deleteById(id);
    }
    
    public Experiencia findExperiencia(Long id){
        return experienciaRepository.findById(id).orElseThrow(()->new UserNotFoundException("Usuario no encontrado"));
    }
}
