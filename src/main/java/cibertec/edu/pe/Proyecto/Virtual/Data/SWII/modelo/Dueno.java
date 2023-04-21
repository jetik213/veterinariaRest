package cibertec.edu.pe.Proyecto.Virtual.Data.SWII.modelo;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import java.io.Serializable;

@Entity
@Data
@Table(name="dueno")
public class Dueno implements Serializable {

	private static final long serialVersionUID = -1105804877436297927L;


	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "duenoid")
    private int idDueno;


    @Column(name = "duenonombre")
    @NotEmpty(message = "{NotEmpty.dueno.nombre}")
    @Pattern(regexp="[a-zA-Z\s]{3,100}", message = "{Pattern.dueno.nombre}")
    private String nombre;


    @Column(name = "duenoapepaterno")
    @NotEmpty(message = "{NotEmpty.dueno.apePaterno}")
    @Pattern(regexp="[a-zA-Z\s]{3,100}", message = "{Pattern.dueno.apePaterno}")
    private String apePaterno;


    @Column(name = "duenoapematerno")
    @NotEmpty(message = "{NotEmpty.dueno.apeMaterno}")
    @Pattern(regexp="[a-zA-Z\s]{3,100}", message = "{Pattern.dueno.apeMaterno}")
    private String apeMaterno;


    @Column(name = "duenodireccion")
    @NotEmpty(message = "{NotEmpty.consulta.direccion}")
    @Pattern(regexp="^.{3,300}$", message = "{Pattern.consulta.direccion}")
    private String direccion;

    @Column(name = "duenotelefono")
    @NotEmpty(message = "{NotEmpty.dueno.telefono}")
    @Pattern(regexp="[0-9]{9}", message = "{Pattern.dueno.telefono}")
    private String telefono;

    @Column(name = "duenoemail")
    @NotEmpty (message = "{NotEmpty.dueno.email}")
    @Email(message = "{Email.dueno.email}")
    private String email;

}
