package cibertec.edu.pe.Proyecto.Virtual.Data.SWII.business.impl;

import cibertec.edu.pe.Proyecto.Virtual.Data.SWII.business.ConsultaService;
import cibertec.edu.pe.Proyecto.Virtual.Data.SWII.modelo.Consulta;
import cibertec.edu.pe.Proyecto.Virtual.Data.SWII.dao.ConsultaDao;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor
public class ConsultaServiceImpl implements ConsultaService {

    private ConsultaDao consultaDao;

    public List<Consulta> listarConsultas() {
        return consultaDao.findAll();
    }

    public Consulta obtenerConsulta(Integer id) { return consultaDao.findById(id).get(); }

    public Consulta registrarConsulta(Consulta consulta) {
       return consultaDao.save(consulta);
    }

    public Consulta modificarConsulta(Consulta consulta) { return consultaDao.save(consulta); }

    @Override
    public String eliminarConsulta(Integer id) {
        consultaDao.deleteById(id);
        return "Consulta eliminada";
    }
}
