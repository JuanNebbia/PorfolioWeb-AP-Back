package ar.gob.argentinaprograma.Porfolio.models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Proyectos{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idProyectos;
     
    private String titulo;
    private String descripcion;
    private String imgProyectos;
    private String linkProyectos;

    public Proyectos() {
    }

    
    
    public Proyectos(Long idProyectos, String titulo, String descripcion, String imgProyectos, String linkProyectos) {
        this.idProyectos = idProyectos;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.imgProyectos = imgProyectos;
        this.linkProyectos = linkProyectos;
    }

    public Long getIdProyectos() {
        return idProyectos;
    }

    public void setIdProyectos(Long idProyectos) {
        this.idProyectos = idProyectos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImgProyectos() {
        return imgProyectos;
    }

    public void setImgProyectos(String imgProyectos) {
        this.imgProyectos = imgProyectos;
    }

    public String getLinkProyectos() {
        return linkProyectos;
    }

    public void setLinkProyectos(String linkProyectos) {
        this.linkProyectos = linkProyectos;
    }
    
    
}

