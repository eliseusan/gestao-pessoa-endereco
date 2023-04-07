package com.attornatus.test.attornatuspessoa.pessoa.application.repository;

import com.attornatus.test.attornatuspessoa.pessoa.domain.entities.Pessoa;

import java.util.List;

public interface PessoaRepository {
    Pessoa salvaCliente(Pessoa pessoa);

    List<Pessoa> buscaTodasPessoas();
}
