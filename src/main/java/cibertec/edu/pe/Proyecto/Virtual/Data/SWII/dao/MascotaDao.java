package cibertec.edu.pe.Proyecto.Virtual.Data.SWII.dao;

import cibertec.edu.pe.Proyecto.Virtual.Data.SWII.modelo.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MascotaDao extends JpaRepository<Mascota, Integer> {
    List<Mascota> findByNombre(String nombre);
}
