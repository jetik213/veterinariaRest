package cibertec.edu.pe.Proyecto.Virtual.Data.SWII.business;

import cibertec.edu.pe.Proyecto.Virtual.Data.SWII.modelo.Doctor;

import java.util.List;

public interface DoctorService {

    public List<Doctor> listarDoctores();
    public Doctor obtenerDoctor(Integer id);
    public Doctor registrarDoctor(Doctor doctor);
    public Doctor modificarDoctor(Doctor Doctor);
    public String eliminarDoctor(Integer id);
    public List<Doctor> listarDoctoresPorNombre(String nombre);
}
