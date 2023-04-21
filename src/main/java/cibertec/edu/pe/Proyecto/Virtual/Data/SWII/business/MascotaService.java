package cibertec.edu.pe.Proyecto.Virtual.Data.SWII.business;

import cibertec.edu.pe.Proyecto.Virtual.Data.SWII.modelo.Mascota;

import java.util.List;

public interface MascotaService {
    public List<Mascota> listarMascotas();
    public Mascota obtenerMascota(Integer id);
    public Mascota registrarMascota(Mascota mascota);
    public Mascota modificarMascota(Mascota mascota);
    public String eliminarMascota(Integer id);
    public List<Mascota> listarMascotasPorNombre(String nombre);
}
