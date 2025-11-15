package master.ucaldas.LibraryApi.models.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="autor")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="nombre")
    private String nombre;

    @Column(name="nacionalidad")
    private String nacionalidad;
}
