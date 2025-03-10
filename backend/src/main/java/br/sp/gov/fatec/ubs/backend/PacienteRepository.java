package br.sp.gov.fatec.ubs.backend;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PacienteRepository extends JpaRepository<PacienteEntity, Integer> {

    // Filtrar por código
    @Query(value = "SELECT * FROM paciente WHERE codigo = :codigo", nativeQuery = true)
    List<PacienteEntity> findByCodigo(@Param("codigo") Integer codigo);

    // Filtrar por nome (usando LIKE para buscas parciais)
    @Query(value = "SELECT * FROM paciente WHERE nome LIKE %:nome%", nativeQuery = true)
    List<PacienteEntity> findByNome(@Param("nome") String nome);

    // Filtrar por documento
    @Query(value = "SELECT * FROM paciente WHERE documento = :documento", nativeQuery = true)
    List<PacienteEntity> findByDocumento(@Param("documento") String documento);

    @Query(value = "SELECT * FROM paciente WHERE cpf = :cpf", nativeQuery =  true)
    List<PacienteEntity> findByCpf(@Param("cpf")String cpf);

    @Query(value = "SELECT * FROM paciente WHERE  = :nacionalidade", nativeQuery =  true)
    List<PacienteEntity> findBynacionalidade(@Param("nacionalidade")String nacionalidade);

    @Query(value = "SELECT * FROM paciente WHERE telefoneCelular = :telefoneCelular", nativeQuery =  true)
    List<PacienteEntity> findBtelefoneCelular(@Param("telefoneCelular")String telefoneCelular);

    // PacienteRepository.java
@Query(value = "SELECT * FROM paciente WHERE email = :email", nativeQuery = true)
List<PacienteEntity> findByEmail(@Param("email") String email);


}
