package cibertec.edu.pe.Proyecto.Virtual.Data.SWII.business.impl;

import cibertec.edu.pe.Proyecto.Virtual.Data.SWII.business.DoctorService;
import cibertec.edu.pe.Proyecto.Virtual.Data.SWII.modelo.Doctor;
import cibertec.edu.pe.Proyecto.Virtual.Data.SWII.dao.DoctorDao;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class DoctorServiceImpl implements DoctorService {

    private DoctorDao doctorDao;

    public List<Doctor> listarDoctores(){
        return doctorDao.findAll();
    }

    public Doctor obtenerDoctor(Integer id){ return doctorDao.findById(id).get(); }

    //si no le mando el id o este no existe inserta
    public Doctor registrarDoctor(Doctor doctor){
        return doctorDao.save(doctor);
    }

    //si le mando el id modifica
    public Doctor modificarDoctor(Doctor doctor){ return doctorDao.save(doctor); }

    public String eliminarDoctor(Integer id){
        doctorDao.deleteById(id);
        return "Doctor eliminado";
    }

    public List<Doctor> listarDoctoresPorNombre(String nombre) {
        return doctorDao.findByNombre(nombre);
    }

}
