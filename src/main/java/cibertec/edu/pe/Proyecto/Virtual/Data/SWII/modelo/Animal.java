package cibertec.edu.pe.Proyecto.Virtual.Data.SWII.modelo;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@Table(name="animal")
public class Animal implements Serializable {

	private static final long serialVersionUID = -8771564813619859637L;

	@Id  //indica que es la llave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "animalid")
    private int id;

    @Column(name = "animaldescripcion")
    private String descripcion;
}
