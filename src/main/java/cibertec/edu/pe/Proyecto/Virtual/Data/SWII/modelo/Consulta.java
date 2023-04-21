package cibertec.edu.pe.Proyecto.Virtual.Data.SWII.modelo;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Entity
@Data
@Table(name="consulta")
public class Consulta implements Serializable {
    private static final long serialVersionUID = 2278933318095633917L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "consultaid")
    private int id;

    @Column(name = "historiaid")
    @NotNull(message = "{NotNull.consulta.historiaId}")
    @Min(value = 0, message = "{Min.consulta.historiaId}")
    private int historiaId;

    @Column(name = "doctorid")
    @NotNull(message = "{NotNull.consulta.doctorId}")
    @Min(value = 0, message = "{Min.consulta.doctorId}")
    private int doctorId;

    @Column(name = "consultadesc")
    @NotEmpty(message = "{NotEmpty.consulta.descripcion}")
    @Pattern(regexp="^.{3,500}$", message = "{Pattern.consulta.descripcion}")
    private String descripcion;

    @Column(name = "consultafa")
    @NotNull(message = "{NotNull.consulta.fechaAtencion}")
    private Date fechaAtencion;

}
