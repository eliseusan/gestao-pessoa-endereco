package com.attornatus.test.attornatuspessoa.endereco.application.api.controller;

import com.attornatus.test.attornatuspessoa.endereco.application.api.requests.EnderecoRequest;
import com.attornatus.test.attornatuspessoa.endereco.application.api.responses.EnderecoResponse;
import com.attornatus.test.attornatuspessoa.endereco.application.api.responses.EnderecosPessoaListResponse;
import com.attornatus.test.attornatuspessoa.endereco.application.service.EnderecoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@Log4j2
public class EnderecoController implements EnderecoAPI{
    private final EnderecoService enderecoService;

    @Override
    public EnderecoResponse criaEndereco(EnderecoRequest enderecoRequest) {
        log.info("[inicia] EnderecoController - criaEndereco");
        var enderecoResponse = enderecoService.criaEndereco(enderecoRequest);
        log.info("[finaliza] EnderecoController - criaEndereco");
        return enderecoResponse;
    }

    @Override
    public List<EnderecosPessoaListResponse> buscaTodasPessoas(UUID idPessoa) {
        log.info("[inicia] PessoaController - buscaPessoaPeloId");
        log.info("[idPessoa] {}", idPessoa);
        var enderecosPessoa = enderecoService.buscaEnderecosPessoaPeloId(idPessoa);
        log.info("[finaliza] PessoaController - buscaPessoaPeloId");
        return enderecosPessoa;
    }
}
