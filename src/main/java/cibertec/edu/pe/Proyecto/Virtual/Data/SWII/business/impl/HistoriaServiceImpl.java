package cibertec.edu.pe.Proyecto.Virtual.Data.SWII.business.impl;

import cibertec.edu.pe.Proyecto.Virtual.Data.SWII.business.HistoriaService;
import cibertec.edu.pe.Proyecto.Virtual.Data.SWII.modelo.Historia;
import cibertec.edu.pe.Proyecto.Virtual.Data.SWII.dao.HistoriaDao;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class HistoriaServiceImpl implements HistoriaService {

    private HistoriaDao historiaDao;

    public List<Historia> listarHistorias() {
        return historiaDao.findAll();
    }

    public Historia obtenerHistoria(Integer id) { return historiaDao.findById(id).get(); }

    public Historia registrarHistoria(Historia historia) {
        return historiaDao.save(historia);
    }

    public Historia modificarHistoria(Historia historia) {
        return historiaDao.save(historia);
    }

    public String eliminarHistoria(Integer id) {
        historiaDao.deleteById(id);
        return "Historia eliminada";
    }
}
