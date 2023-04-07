package com.attornatus.test.attornatuspessoa.pessoa.application.service;

import com.attornatus.test.attornatuspessoa.pessoa.application.api.requests.PessoaAlteracaoRequest;
import com.attornatus.test.attornatuspessoa.pessoa.application.api.requests.PessoaRequest;
import com.attornatus.test.attornatuspessoa.pessoa.application.api.responses.PessoaDetalhadoResponse;
import com.attornatus.test.attornatuspessoa.pessoa.application.api.responses.PessoaListResponse;
import com.attornatus.test.attornatuspessoa.pessoa.application.api.responses.PessoaResponse;

import java.util.List;
import java.util.UUID;

public interface PessoaService {
    PessoaResponse criaPessoa(PessoaRequest pessoaRequest);

    List<PessoaListResponse> buscaTodasPessoas();

    PessoaDetalhadoResponse buscaPessoaPeloId(UUID idPessoa);

    void alteraPessoa(UUID idPessoa, PessoaAlteracaoRequest pessoaAlteracaoRequest);
}
