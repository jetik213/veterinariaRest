package cibertec.edu.pe.Proyecto.Virtual.Data.SWII.modelo;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import java.io.Serializable;

@Entity
@Data
@Table(name="mascota")
public class Mascota implements Serializable {
    private static final long serialVersionUID = 8212246633770892034L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mascotaid")
    private int id;

    @Column(name = "mascotanombre")
    @NotEmpty(message = "{NotEmpty.mascota.nombre}")
    @Pattern(regexp="[a-zA-Z\s]{3,100}", message = "{Pattern.mascota.nombre}")
    private String nombre;

    @Column(name = "mascotaanios")
    @NotNull(message = "{NotNull.mascota.anios}")
    @Min(value = 0, message = "{Min.mascota.anios}")
    private int anios;

    @Column(name = "animalid")
    @NotNull(message = "{NotNull.mascota.animalId}")
    @Min(value = 0, message = "{Min.mascota.animalId}")
    private int animalId;

    @Column(name = "mascotaraza")
    @NotEmpty(message = "{NotEmpty.mascota.raza}")
    @Pattern(regexp="[a-zA-Z\s]{3,100}", message = "{Pattern.mascota.raza}")
    private String raza;

    @Column(name = "duenoid")
    @NotNull(message = "{NotNull.mascota.duenoId}")
    @Min(value = 0, message = "{Min.mascota.duenoId}")
    private int duenoId;

}
