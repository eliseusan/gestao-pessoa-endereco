package com.attornatus.test.attornatuspessoa.endereco.application.repository;

import com.attornatus.test.attornatuspessoa.endereco.domain.entities.Endereco;

import java.util.List;
import java.util.UUID;

public interface EnderecoRepository {
    Endereco salvaEnderecoDaPessoa(Endereco endereco);

    List<Endereco> buscaEnderecosoDaPessoaPeloId(UUID idPessoa);
}
