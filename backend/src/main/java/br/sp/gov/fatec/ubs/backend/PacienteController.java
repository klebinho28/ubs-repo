package br.sp.gov.fatec.ubs.backend;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PacienteController {
    @Autowired
    PacienteRepository bd;

    @PostMapping("/api/paciente")
    public String gravar(@RequestBody PacienteEntity obj) {
        bd.save(obj);
        return "Paciente gravado com sucesso!";
    }

    @GetMapping("/api/paciente/{codigo}")
    public PacienteEntity ler(@PathVariable int codigo) {
        Optional<PacienteEntity> retorno = bd.findById(codigo);
        if (retorno.isPresent()) {
            return retorno.get();
        } else {
            return null;
        }
    }

    @DeleteMapping("/api/paciente/{codigo}")
    public String remover(@PathVariable int codigo) {
        bd.deleteById(codigo);
        return "Paciente " + codigo + " removido com sucesso !!";
    }

    @PutMapping("/api/paciente")
    public String alterar(@RequestBody PacienteEntity obj) {
        bd.save(obj);
        return "Paciente alterado com sucesso !";
    }

    @GetMapping("/api/paciente")
    public List<PacienteEntity> listar() {
        List<PacienteEntity> lista = bd.findAll();
        return lista;
    }

}
