package cibertec.edu.pe.Proyecto.Virtual.Data.SWII.modelo;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Data
@Table(name="historia")
public class Historia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "historiaid")
    private int id;

    @Column(name = "duenoid")
    @NotNull(message = "{NotNull.historia.duenoId}")
    @Min(value = 0, message = "{Min.historia.duenoId}")
    private int duenoId;

    @Column(name = "mascotaid")
    @NotNull(message = "{NotNull.historia.mascotaId}")
    @Min(value = 0, message = "{Min.historia.mascotaId}")
    private int mascotaId;

}
