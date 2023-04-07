package com.attornatus.test.attornatuspessoa.pessoa.application.service;

import com.attornatus.test.attornatuspessoa.pessoa.application.api.requests.PessoaRequest;
import com.attornatus.test.attornatuspessoa.pessoa.application.api.responses.PessoaListResponse;
import com.attornatus.test.attornatuspessoa.pessoa.application.api.responses.PessoaResponse;

import java.util.List;

public interface PessoaService {
    PessoaResponse criaPessoa(PessoaRequest pessoaRequest);

    List<PessoaListResponse> buscaTodasPessoas();
}
