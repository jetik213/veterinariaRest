package cibertec.edu.pe.Proyecto.Virtual.Data.SWII.controlador;

import cibertec.edu.pe.Proyecto.Virtual.Data.SWII.business.ConsultaService;
import cibertec.edu.pe.Proyecto.Virtual.Data.SWII.modelo.Consulta;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/consulta")
@AllArgsConstructor
public class ConsultaController {

    private ConsultaService consultaService;

    @GetMapping("/consultas")
    public ResponseEntity<?> listarConsultas(){
        List<Consulta> consultas = consultaService.listarConsultas();
        return new ResponseEntity<>(consultas, consultas.size() > 0 ? HttpStatus.OK : HttpStatus.NOT_FOUND);
    }

    @GetMapping("/consultas/id/{id}")
    public ResponseEntity<?> obtenerConsulta(@PathVariable Integer id){
        return new ResponseEntity<>(consultaService.obtenerConsulta(id), HttpStatus.OK);
    }

    @PostMapping("/registrarConsulta")
    public ResponseEntity<?> registrarConsulta(@Valid @RequestBody Consulta consulta){
        Consulta newConsulta = consultaService.registrarConsulta(consulta);
        return new ResponseEntity<Consulta>(newConsulta, HttpStatus.OK);
    }

    @PutMapping("/modificarConsulta")
    public ResponseEntity<?> modificarConsulta(@Valid @RequestBody Consulta consulta){
        Consulta newConsulta = consultaService.modificarConsulta(consulta);
        return new ResponseEntity<Consulta>(newConsulta, HttpStatus.OK);
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<?> eliminarConsulta(@PathVariable Integer id){
        return new ResponseEntity<>(consultaService.eliminarConsulta(id), HttpStatus.OK);
    }

}