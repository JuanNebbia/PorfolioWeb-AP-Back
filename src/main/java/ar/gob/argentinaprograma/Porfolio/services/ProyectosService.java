/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.gob.argentinaprograma.Porfolio.services;

import ar.gob.argentinaprograma.Porfolio.exception.UserNotFoundException;
import ar.gob.argentinaprograma.Porfolio.models.Proyectos;
import ar.gob.argentinaprograma.Porfolio.repository.ProyectosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProyectosService {
  private final ProyectosRepository proyectosRepository;

    @Autowired
    public ProyectosService(ProyectosRepository proyectosRepository) {
        this.proyectosRepository = proyectosRepository;
    }
    
    public Proyectos addProyectos(Proyectos proyectos){
        return proyectosRepository.save(proyectos);
    }
    
     public List<Proyectos> getProyectos(){
        return proyectosRepository.findAll();
    }
    
    public Proyectos updateProyectos(Proyectos proyectos){
        return proyectosRepository.save(proyectos);
    }
    
    public void deleteProyectos(Long id){
        proyectosRepository.deleteById(id);
    }  
    
    public Proyectos findProyectos(Long id){
        return proyectosRepository.findById(id).orElseThrow(()->new UserNotFoundException("Usuario no encontrado"));
    }
}

