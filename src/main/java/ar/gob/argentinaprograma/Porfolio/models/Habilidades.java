package ar.gob.argentinaprograma.Porfolio.models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Habilidades implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idHabilidad;
    
    private String tecnologia;
    private String descripcion;
    private Integer nivel;
    private String color;
    private String ImgHabilidad;

    public Habilidades() {
    }

    public Habilidades(Long idHabilidad, String tecnologia, String descripcion, Integer nivel, String color, String ImgHabilidad) {
        this.idHabilidad = idHabilidad;
        this.tecnologia = tecnologia;
        this.descripcion = descripcion;
        this.nivel = nivel;
        this.color = color;
        this.ImgHabilidad = ImgHabilidad;
    }

    public Long getIdHabilidad() {
        return idHabilidad;
    }

    public void setIdHabilidad(Long idHabilidad) {
        this.idHabilidad = idHabilidad;
    }

    public String getTecnologia() {
        return tecnologia;
    }

    public void setTecnologia(String tecnologia) {
        this.tecnologia = tecnologia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getImgHabilidad() {
        return ImgHabilidad;
    }

    public void setImgHabilidad(String ImgHabilidad) {
        this.ImgHabilidad = ImgHabilidad;
    }
    
    
}

