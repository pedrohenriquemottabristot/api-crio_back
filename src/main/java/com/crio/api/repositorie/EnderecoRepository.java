package com.crio.api.repositorie;

import com.crio.api.domain.endereco.Endereco;
import com.crio.api.service.EnderecoService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import java.util.UUID;

public interface EnderecoRepository extends JpaRepository<Endereco, UUID> {
    //busca todos os endereços de uma determinada cidade
    @Query ("SELECT e FROM Endereco e WHERE e.city = :city" )
    Endereco findByCity(String city);

    //busca todos os endereços de uma determinada unidade federativa
    @Query ("SELECT e FROM Endereco e WHERE e.uf = :uf")
    Endereco findByUf(String uf);
}
