package cibertec.edu.pe.Proyecto.Virtual.Data.SWII.business.impl;

import cibertec.edu.pe.Proyecto.Virtual.Data.SWII.business.MascotaService;
import cibertec.edu.pe.Proyecto.Virtual.Data.SWII.modelo.Mascota;
import cibertec.edu.pe.Proyecto.Virtual.Data.SWII.dao.MascotaDao;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class MascotaServiceImpl implements MascotaService {
    private MascotaDao mascotaDao;

    public List<Mascota> listarMascotas(){
        return mascotaDao.findAll();
    }

    public Mascota obtenerMascota(Integer id){ return mascotaDao.findById(id).get(); }

    public Mascota registrarMascota(Mascota mascota){
        return mascotaDao.save(mascota);
    }

    public Mascota modificarMascota(Mascota mascota){
        return mascotaDao.save(mascota);
    }

    public String eliminarMascota(Integer id){
        mascotaDao.deleteById(id);
        return "Mascota eliminada";
    }

    public List<Mascota> listarMascotasPorNombre(String nombre) {
        return mascotaDao.findByNombre(nombre);
    }
}
