package cibertec.edu.pe.Proyecto.Virtual.Data.SWII.modelo;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import java.io.Serializable;

@Entity
@Data
@Table(name="doctor")
public class Doctor implements Serializable {
	
    private static final long serialVersionUID = 5608334793073319306L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "doctorid")
    private int id;

    @Column(name = "doctornombre")
    @NotEmpty(message = "{NotEmpty.doctor.nombre}")
    @Pattern(regexp="[a-zA-Z\s]{3,100}", message = "{Pattern.doctor.nombre}")
    private String nombre;

    @Column(name = "doctorapepaterno")
    @NotEmpty(message = "{NotEmpty.doctor.apePaterno}")
    @Pattern(regexp="[a-zA-Z\s]{3,100}", message = "{Pattern.doctor.apePaterno}")
    private String apePaterno;

    @Column(name = "doctorapematerno")
    @NotEmpty(message = "{NotEmpty.doctor.apeMaterno}")
    @Pattern(regexp="[a-zA-Z\s]{3,100}", message = "{Pattern.doctor.apeMaterno}")
    private String apeMaterno;

    @Column(name = "doctordireccion")
    @NotEmpty(message = "{NotEmpty.consulta.direccion}")
    @Pattern(regexp="^.{3,300}$", message = "{Pattern.consulta.direccion}")
    private String direccion;

    @Column(name = "doctortelefono")
    @NotEmpty(message = "{NotEmpty.doctor.telefono}")
    @Pattern(regexp="[0-9]{9}", message = "{Pattern.doctor.telefono}")
    private String telefono;

    @Column(name = "doctoremail")
    @NotEmpty (message = "{NotEmpty.doctor.email}")
    @Email(message = "{Email.doctor.email}")
    private String email;


}
