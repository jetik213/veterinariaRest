package cibertec.edu.pe.Proyecto.Virtual.Data.SWII.business;

import cibertec.edu.pe.Proyecto.Virtual.Data.SWII.modelo.Dueno;

import java.util.List;

public interface DuenoService {

    public List<Dueno> listarDuenos();
    public Dueno obtenerDueno(Integer id);
    public Dueno registrarDueno(Dueno dueno);
    public Dueno modificarDueno(Dueno dueno);
    public String eliminarDueno(Integer id);
    public List<Dueno> listarDuenosPorNombre(String nombre);
}
