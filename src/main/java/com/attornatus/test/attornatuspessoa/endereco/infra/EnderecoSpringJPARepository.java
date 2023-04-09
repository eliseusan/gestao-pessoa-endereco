package com.attornatus.test.attornatuspessoa.endereco.infra;

import com.attornatus.test.attornatuspessoa.endereco.domain.entities.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface EnderecoSpringJPARepository extends JpaRepository<Endereco, UUID> {
    List<Endereco> findByidPessoaEndereco(UUID idPessoa);
}
