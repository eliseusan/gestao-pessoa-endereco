package com.attornatus.test.attornatuspessoa.pessoa.application.repository;

import com.attornatus.test.attornatuspessoa.pessoa.domain.entities.Pessoa;

public interface PessoaRepository {
    Pessoa salvaCliente(Pessoa pessoa);
}
