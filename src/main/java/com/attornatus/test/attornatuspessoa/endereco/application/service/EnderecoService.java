package com.attornatus.test.attornatuspessoa.endereco.application.service;

import com.attornatus.test.attornatuspessoa.endereco.application.api.requests.EnderecoRequest;
import com.attornatus.test.attornatuspessoa.endereco.application.api.responses.EnderecoResponse;
import com.attornatus.test.attornatuspessoa.endereco.application.api.responses.EnderecosPessoaListResponse;

import java.util.List;
import java.util.UUID;

public interface EnderecoService {
    EnderecoResponse criaEndereco(EnderecoRequest enderecoRequest);

    List<EnderecosPessoaListResponse> buscaEnderecosPessoaPeloId(UUID idPessoa);
}
