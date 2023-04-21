package cibertec.edu.pe.Proyecto.Virtual.Data.SWII.business;

import cibertec.edu.pe.Proyecto.Virtual.Data.SWII.modelo.Consulta;

import java.util.List;

public interface ConsultaService {
    public List<Consulta> listarConsultas();
    public Consulta obtenerConsulta(Integer id);
    public Consulta registrarConsulta(Consulta consulta);
    public Consulta modificarConsulta(Consulta consulta);
    public String eliminarConsulta(Integer id);
}
