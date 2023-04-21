package cibertec.edu.pe.Proyecto.Virtual.Data.SWII.controlador;

import cibertec.edu.pe.Proyecto.Virtual.Data.SWII.business.DoctorService;
import cibertec.edu.pe.Proyecto.Virtual.Data.SWII.modelo.Doctor;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //es json
@RequestMapping("api/v1/doctor")
@AllArgsConstructor
public class DoctorController {

    private DoctorService doctorService;
    @GetMapping("/doctores")
    public ResponseEntity<?> listarDoctores(){
        List<Doctor> doctores = doctorService.listarDoctores();
        return new ResponseEntity<>(doctores, doctores.size() > 0 ? HttpStatus.OK : HttpStatus.NOT_FOUND);
    }

    @GetMapping("/doctores/id/{id}")
    public ResponseEntity<?> obtenerDoctor(@PathVariable Integer id){
        return new ResponseEntity<>(doctorService.obtenerDoctor(id), HttpStatus.OK);
    }

    @PostMapping("/registrarDoctor")
    public ResponseEntity<?> registrarDoctor(@Valid @RequestBody Doctor doctor){
        Doctor newDoctor = doctorService.registrarDoctor(doctor);
        return new ResponseEntity<Doctor>(newDoctor, HttpStatus.OK);
    }

    @PutMapping("/modificarDoctor")
    public ResponseEntity<?> modificarDoctor(@Valid @RequestBody Doctor doctor){
        Doctor newDoctor = doctorService.modificarDoctor(doctor);
        return new ResponseEntity<Doctor>(newDoctor, HttpStatus.OK);
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<?> eliminarDoctor(@PathVariable Integer id){
        return new ResponseEntity<>(doctorService.eliminarDoctor(id), HttpStatus.OK);
    }

    @GetMapping("/doctores/nombre")
    public ResponseEntity<?> listarDoctoresPorNombre(@RequestParam("nombre") String nombre) {
        List<Doctor> doctores = doctorService.listarDoctoresPorNombre(nombre);
        return new ResponseEntity<>(doctores, doctores.size() > 0 ? HttpStatus.OK : HttpStatus.NOT_FOUND);
    }

}
