package pe.com.fitfuel.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Citas {
    @Id
    @Column(name = "cit_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;
    @Column(name="celular")
    private String celular;
    @Column(name = "email")
    private String email;
    @Column(name = "calendar")
    private String calendar;
    @Column(name="hora")
    private String hora;
    @Column(name="notas")
    private String notas;
    @ManyToOne
    @JoinColumn(name="nut_id")
    private Nutricionista nutricionista;

}
