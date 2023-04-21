package cibertec.edu.pe.Proyecto.Virtual.Data.SWII.controlador;

import cibertec.edu.pe.Proyecto.Virtual.Data.SWII.business.HistoriaService;
import cibertec.edu.pe.Proyecto.Virtual.Data.SWII.modelo.Historia;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/historia")
@AllArgsConstructor
public class HistoriaController {

    private HistoriaService historiaService;

    @GetMapping("/historias")
    public ResponseEntity<?> listarHistorias(){
        List<Historia> historias = historiaService.listarHistorias();
        return new ResponseEntity<>(historias, historias.size() > 0 ? HttpStatus.OK : HttpStatus.NOT_FOUND);
    }

    @GetMapping("/historias/id/{id}")
    public ResponseEntity<?> obtenerHistoria(@PathVariable Integer id){
        return new ResponseEntity<>(historiaService.obtenerHistoria(id), HttpStatus.OK);
    }

    @PostMapping("/registrarHistoria")
    public ResponseEntity<?> registrarHistoria(@Valid @RequestBody Historia historia){
        Historia newHistoria = historiaService.registrarHistoria(historia);
        return new ResponseEntity<Historia>(newHistoria, HttpStatus.OK);
    }

    @PutMapping("/modificarHistoria")
    public ResponseEntity<?> modificarHistoria(@Valid @RequestBody Historia historia){
        Historia newHistoria = historiaService.modificarHistoria(historia);
        return new ResponseEntity<Historia>(newHistoria, HttpStatus.OK);
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<?> eliminarHistoria(@PathVariable Integer id){
        return new ResponseEntity<>(historiaService.eliminarHistoria(id), HttpStatus.OK);
    }

}
