package cibertec.edu.pe.Proyecto.Virtual.Data.SWII.controlador;

import cibertec.edu.pe.Proyecto.Virtual.Data.SWII.business.DuenoService;
import cibertec.edu.pe.Proyecto.Virtual.Data.SWII.modelo.Dueno;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/dueno")
@AllArgsConstructor
public class DuenoController {

    private DuenoService duenoService;

    @GetMapping("/duenos")
    public ResponseEntity<?> listarDuenos(){
        List<Dueno> duenos = duenoService.listarDuenos();
        return new ResponseEntity<>(duenos, duenos.size() > 0 ? HttpStatus.OK : HttpStatus.NOT_FOUND);
    }

    @GetMapping("/duenos/id/{id}")
    public ResponseEntity<?> obtenerDueno(@PathVariable Integer id){
        return new ResponseEntity<>(duenoService.obtenerDueno(id), HttpStatus.OK);
    }

    @PostMapping("/registrarDueno")
    public ResponseEntity<?> registrarDueno(@Valid @RequestBody Dueno dueno){
        Dueno newDueno = duenoService.registrarDueno(dueno);
        return new ResponseEntity<Dueno>(newDueno, HttpStatus.OK);
    }

    @PutMapping("/modificarDueno")
    public ResponseEntity<?> modificarDueno(@Valid @RequestBody Dueno dueno){
        Dueno newDueno = duenoService.modificarDueno(dueno);
        return new ResponseEntity<Dueno>(newDueno, HttpStatus.OK);
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<?> eliminarDueno(@PathVariable Integer id){
        return new ResponseEntity<>(duenoService.eliminarDueno(id), HttpStatus.OK);
    }

    @GetMapping("/duenos/nombre")
    public ResponseEntity<?> listarDuenosPorNombre(@RequestParam("nombre") String nombre) {
        List<Dueno> duenos = duenoService.listarDuenosPorNombre(nombre);
        return new ResponseEntity<>(duenos, duenos.size() > 0 ? HttpStatus.OK : HttpStatus.NOT_FOUND);
    }


}
