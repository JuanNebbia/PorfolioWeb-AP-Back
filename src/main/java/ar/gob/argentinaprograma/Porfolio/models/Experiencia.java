package ar.gob.argentinaprograma.Porfolio.models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Experiencia implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idExperiencia;
    
    private String empresa;
    private String cargo;
    private Integer fechaInicio;
    private Integer fechaFin;
    private String ImgExperiencia;

    public Experiencia() {
    }

    public Experiencia(Long idExperiencia, String empresa, String cargo, Integer fechaInicio, Integer fechaFin, String ImgExperiencia) {
        this.idExperiencia = idExperiencia;
        this.empresa = empresa;
        this.cargo = cargo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.ImgExperiencia = ImgExperiencia;
    }

    public Long getIdExperiencia() {
        return idExperiencia;
    }

    public void setIdExperiencia(Long idExperiencia) {
        this.idExperiencia = idExperiencia;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
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

    public String getImgExperiencia() {
        return ImgExperiencia;
    }

    public void setImgExperiencia(String ImgExperiencia) {
        this.ImgExperiencia = ImgExperiencia;
    }
    
    
           
}
