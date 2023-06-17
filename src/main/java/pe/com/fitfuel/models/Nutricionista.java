package pe.com.fitfuel.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.NotBlank;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Nutricionista {
    @Id
    @Column(name="nut_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="dni")
    private Integer dni;
    @Column(name="nombre")
    private String nombre;
    @Column(name="apellido")
    private String apellido;
    @Column(name="profesion")
    private String profesion;
    @Column(name="descripcion")
    private String descripcion;
    @Column(name="foto")
    private String foto;
    @Column(name="video")
    private String video;
    @Column(name="categoria")
    private String categoria;
    @Column(name="estado")
    private boolean estado;
    @Column(name="whatsapp")
    private String whatsapp;
    @Column(name="instagram")
    private String instagram;
    @Column(name="facebook")
    private String facebook;
    @Column(name="linkedin")
    private String linkedin;
}
