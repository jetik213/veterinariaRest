package cibertec.edu.pe.Proyecto.Virtual.Data.SWII.controlador;

import cibertec.edu.pe.Proyecto.Virtual.Data.SWII.business.MascotaService;
import cibertec.edu.pe.Proyecto.Virtual.Data.SWII.modelo.Mascota;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //es json
@RequestMapping("api/v1/mascota")
@AllArgsConstructor
public class MascotaController {

    private MascotaService mascotaService;

    @GetMapping("/mascotas")
    public ResponseEntity<?> listarMascotas(){
        List<Mascota> mascotas = mascotaService.listarMascotas();
        return new ResponseEntity<>(mascotas, mascotas.size() > 0 ? HttpStatus.OK : HttpStatus.NOT_FOUND);
    }

    @GetMapping("/mascotas/id/{id}")
    public ResponseEntity<?> obtenerMascota(@PathVariable Integer id){
        return new ResponseEntity<>(mascotaService.obtenerMascota(id), HttpStatus.OK);
    }

    @PostMapping("/registrarMascota")
    public ResponseEntity<?> registrarMascota(@Valid @RequestBody Mascota mascota){
        Mascota newMascota = mascotaService.registrarMascota(mascota);
        return new ResponseEntity<Mascota>(newMascota, HttpStatus.OK);
    }

    @PutMapping("/modificarMascota")
    public ResponseEntity<?> modificarMascota(@Valid @RequestBody Mascota mascota){
        Mascota newMascota = mascotaService.modificarMascota(mascota);
        return new ResponseEntity<Mascota>(newMascota, HttpStatus.OK);
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<?> eliminarMascota(@PathVariable Integer id){
        return new ResponseEntity<>(mascotaService.eliminarMascota(id), HttpStatus.OK);
    }

    @GetMapping("/mascotas/nombre")
    public ResponseEntity<?> listarMascotasPorNombre(@RequestParam("nombre") String nombre) {
        List<Mascota> mascotas = mascotaService.listarMascotasPorNombre(nombre);
        return new ResponseEntity<>(mascotas, mascotas.size() > 0 ? HttpStatus.OK : HttpStatus.NOT_FOUND);
    }

}
