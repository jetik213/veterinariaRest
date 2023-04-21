package cibertec.edu.pe.Proyecto.Virtual.Data.SWII.dao;

import cibertec.edu.pe.Proyecto.Virtual.Data.SWII.modelo.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DoctorDao extends JpaRepository<Doctor, Integer> {
    List<Doctor> findByNombre(String nombre);

}
