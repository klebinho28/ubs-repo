package br.sp.gov.fatec.ubs.backend.model;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Long> {

        public List<Paciente> findByNomeContainsIgnoreCase(String nome);

        // Filtrar por código
        @Query(value = "SELECT * FROM paciente WHERE codigo = :codigo", nativeQuery = true)
        List<Paciente> findByCodigo(@Param("codigo") Long codigo);

        @Query(value = "select * from paciente where nome like %:nomeCompleto%", nativeQuery = true)
        List<Paciente> findByNome(@Param("nomeCompleto") String nomeCompleto);

        @Query(value = "select * from paciente where nacionalidade like %:nacionalidade%", nativeQuery = true)
        List<Paciente> findByNacionalidade(@Param("nacionalidade") String nacionlidade);

        @Query(value = "select from paciente where nome=:nome and dataNascimento = : dataNascimento ")
        public List<Paciente> buscarPorNomeEDataNascimento(@Param("nome") String nome,
                        @Param("dataNascimento") String dataNascimento);

        @Query(value = "select * from paciente where email like %:email%", nativeQuery = true)
        public List<Paciente> findByEmail(@Param("email") String emil);

}
