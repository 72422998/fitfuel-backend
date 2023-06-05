package pe.com.fitfuel.models;

import jakarta.persistence.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.NotBlank;

@Entity
public class Nutricionista {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="dni")
    private Integer dni;
    @NotBlank
    @Column(name="profesion")
    private String profesion;
    @NotBlank
    @Column(name="descripcion")
    private String descripcion;
    @Column(name="foto")
    private String foto;
    @Column(name="video")
    private String video;
    @Column(name="estado")
    private boolean estado;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Nutricionista(Integer id, Integer dni, String profesion, String descripcion, String foto, String video, boolean estado) {
        this.id = id;
        this.dni = dni;
        this.profesion = profesion;
        this.descripcion = descripcion;
        this.foto = foto;
        this.video = video;
        this.estado = estado;
    }

    public Nutricionista() {

    }
}
