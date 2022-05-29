package ar.gob.argentinaprograma.Porfolio.models;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Informacion implements Serializable{
    
    @Id
    private Long idInformacion;
    
    private String nombre;
    private String apellido;
    private String titulo;
    private String email;
    private String facebook;
    private String instagram;
    private String github;
    private String telefono;
    
   @Column(length = 1000)
    private String descripcion;
    private String locacion;
    private String imgPerfil;
    private String imgBanner;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idEducacion")
    private List<Educacion> educacionList;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idExperiencia")
    private List<Experiencia> experienciaList;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idProyectos")
    private List<Proyectos> proyectosList;

    public Informacion() {
    }

    public Informacion(Long idInformacion, String nombre, String apellido, String titulo, String email, String facebook, String instagram, String github, String telefono, String descripcion, String locacion, String imgPerfil, String imgBanner, List<Educacion> educacionList, List<Experiencia> experienciaList, List<Proyectos> proyectosList) {
        this.idInformacion = idInformacion;
        this.nombre = nombre;
        this.apellido = apellido;
        this.titulo = titulo;
        this.email = email;
        this.facebook = facebook;
        this.instagram = instagram;
        this.github = github;
        this.telefono = telefono;
        this.descripcion = descripcion;
        this.locacion = locacion;
        this.imgPerfil = imgPerfil;
        this.imgBanner = imgBanner;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getInstagram() {
        return instagram;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }

    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    

    public String getLocacion() {
        return locacion;
    }

    public void setLocacion(String locacion) {
        this.locacion = locacion;
    }

    public Long getId() {
        return idInformacion;
    }

    public void setId(Long Id) {
        this.idInformacion = Id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
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

    public String getImgPerfil() {
        return imgPerfil;
    }

    public void setImgPerfil(String imgPerfil) {
        this.imgPerfil = imgPerfil;
    }

    public String getImgBanner() {
        return imgBanner;
    }

    public void setImgBanner(String imgBanner) {
        this.imgBanner = imgBanner;
    }
    
    
}
