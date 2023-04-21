package cibertec.edu.pe.Proyecto.Virtual.Data.SWII.dao;

import cibertec.edu.pe.Proyecto.Virtual.Data.SWII.modelo.Dueno;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DuenoDao extends JpaRepository<Dueno, Integer> {
    List<Dueno> findByNombre(String nombre);

}
