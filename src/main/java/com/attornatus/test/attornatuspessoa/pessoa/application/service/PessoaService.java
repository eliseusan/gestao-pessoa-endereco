package com.attornatus.test.attornatuspessoa.pessoa.application.service;

import com.attornatus.test.attornatuspessoa.pessoa.application.api.requests.PessoaRequest;
import com.attornatus.test.attornatuspessoa.pessoa.application.api.responses.PessoaResponse;

public interface PessoaService {
    PessoaResponse criaPessoa(PessoaRequest pessoaRequest);
}
