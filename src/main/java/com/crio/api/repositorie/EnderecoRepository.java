package com.crio.api.repositorie;

import com.crio.api.domain.endereco.Endereco;
import com.crio.api.domain.usuario.Usuario;
import com.crio.api.service.EnderecoService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

import java.util.Optional;
import java.util.UUID;

public interface EnderecoRepository extends JpaRepository<Endereco, UUID> {
    @Query("SELECT e FROM Endereco e")
    List<Endereco> findAllEndereco();

    @Query("SELECT e FROM Endereco e WHERE e.id = :id")
    Optional<Endereco> findByIdEndereco(UUID id);

    @Query("DELETE FROM Endereco e WHERE e.id = :id")
    void deleteByIdEndereco(UUID id);

    //busca todos os endereços de uma determinada cidade
    @Query ("SELECT e FROM Endereco e WHERE e.city = :city" )
    Endereco findByCity(String city);

    //busca todos os endereços de uma determinada unidade federativa
    @Query ("SELECT e FROM Endereco e WHERE e.uf = :uf")
    Endereco findByUf(String uf);
}
