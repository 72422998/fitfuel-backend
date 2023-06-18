package pe.com.fitfuel.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Comentarios {
    @Id
    @Column(name="com_id")
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="nombre")
    private String nombre;
    @Column (name="apellido")
    private String apellido;
    @Column(name="perfil")
    private String perfil;
    @Column(name="calificacion")
    private Integer calificacion;
    @Column(name="opinion")
    private String opinion;
    @Column(name="fecha_actual")
    private Date fecha_actual;
    @ManyToOne
    @JoinColumn(name="ser_id")
    private Servicios servicios;
}
