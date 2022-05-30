package ar.gob.argentinaprograma.Porfolio.models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Educacion implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idEducacion;
    
    private String institucion;
    private String nivel;
    private String titulo;
    private Integer fechaInicio;
    private Integer fechaFin;
    private String ImgEducacion;

    public Educacion() {
    }

    public Educacion(Long idEducacion, String institucion, String nivel, String titulo, Integer fechaInicio, Integer fechaFin, String ImgEducacion) {
        this.idEducacion = idEducacion;
        this.institucion = institucion;
        this.nivel = nivel;
        this.titulo = titulo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.ImgEducacion = ImgEducacion;
    }

    public Long getIdEducacion() {
        return idEducacion;
    }

    public void setIdEducacion(Long idEducacion) {
        this.idEducacion = idEducacion;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Integer fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Integer getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Integer fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getImgEducacion() {
        return ImgEducacion;
    }

    public void setImgEducacion(String ImgEducacion) {
        this.ImgEducacion = ImgEducacion;
    }

    
    
}