package cibertec.edu.pe.Proyecto.Virtual.Data.SWII.business.impl;

import cibertec.edu.pe.Proyecto.Virtual.Data.SWII.business.DuenoService;
import cibertec.edu.pe.Proyecto.Virtual.Data.SWII.modelo.Dueno;
import cibertec.edu.pe.Proyecto.Virtual.Data.SWII.dao.DuenoDao;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class DuenoServiceImpl implements DuenoService {

    private DuenoDao duenoDao;

    public List<Dueno> listarDuenos(){
        return duenoDao.findAll();
    }

    public Dueno obtenerDueno(Integer id){ return duenoDao.findById(id).get(); }

    public Dueno registrarDueno(Dueno dueno){
        return duenoDao.save(dueno);
    }

    public Dueno modificarDueno(Dueno dueno){
        return duenoDao.save(dueno);
    }

    public String eliminarDueno(Integer id){
        duenoDao.deleteById(id);
        return "Dueño eliminado";
    }

    public List<Dueno> listarDuenosPorNombre(String nombre) {
        return duenoDao.findByNombre(nombre);
    }

}
