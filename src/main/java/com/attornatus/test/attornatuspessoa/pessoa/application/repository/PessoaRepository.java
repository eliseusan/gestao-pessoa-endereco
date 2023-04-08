package com.attornatus.test.attornatuspessoa.pessoa.application.repository;

import com.attornatus.test.attornatuspessoa.pessoa.domain.entities.Pessoa;

import java.util.List;
import java.util.UUID;

public interface PessoaRepository {
    Pessoa salvaPessoa(Pessoa pessoa);

    List<Pessoa> buscaTodasPessoas();

    Pessoa buscaPessoaPeloId(UUID idPessoa);
}
