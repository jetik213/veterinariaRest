package cibertec.edu.pe.Proyecto.Virtual.Data.SWII.business;

import cibertec.edu.pe.Proyecto.Virtual.Data.SWII.modelo.Historia;

import java.util.List;

public interface HistoriaService {

    public List<Historia> listarHistorias();
    public Historia obtenerHistoria(Integer id);
    public Historia registrarHistoria(Historia historia);
    public Historia modificarHistoria(Historia historia);
    public String eliminarHistoria(Integer id);

}
