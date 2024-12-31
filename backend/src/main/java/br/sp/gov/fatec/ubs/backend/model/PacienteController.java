package br.sp.gov.fatec.ubs.backend.model;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.RequestResponseBodyMethodProcessor;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping({ "/pacientes" })
public class PacienteController {
    @Autowired
    PacienteRepository bd;

    @PostMapping("/api/paciente")
    public Paciente gravar(@RequestBody Paciente obj) {
        bd.save(obj);
        return obj;
    }

    @GetMapping("/api/paciente/{codigo}")
    public Paciente ler(@PathVariable long codigo) {
        Optional<Paciente> obj = bd.findById(codigo);
        if (obj.isPresent()) {
            return obj.get();
        } else {
            return null;
        }

    }

    @DeleteMapping("/api/paciente/{codigo}")
    public String remover(@PathVariable long codigo) {
        bd.deleteById(codigo);
        return "paciente" + codigo + "removido com sucesso";
    }

    @PutMapping("/api/paciente")
    public String alterar(@RequestBody Paciente obj) {
        bd.save(obj);
        return "Paciente alterado com sucesso";
    }

    @GetMapping("/api/paciente")
    public Iterable<Paciente> listar() {
        return bd.findAll();
    }

}
