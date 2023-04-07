package com.attornatus.test.attornatuspessoa.pessoa.application.api.controller;

import com.attornatus.test.attornatuspessoa.pessoa.application.api.requests.PessoaAlteracaoRequest;
import com.attornatus.test.attornatuspessoa.pessoa.application.api.requests.PessoaRequest;
import com.attornatus.test.attornatuspessoa.pessoa.application.api.responses.PessoaDetalhadoResponse;
import com.attornatus.test.attornatuspessoa.pessoa.application.api.responses.PessoaListResponse;
import com.attornatus.test.attornatuspessoa.pessoa.application.api.responses.PessoaResponse;
import com.attornatus.test.attornatuspessoa.pessoa.application.service.PessoaService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@Log4j2
public class PessoaController implements PessoaAPI {
    private final PessoaService pessoaService;

    @Override
    public PessoaResponse criaPessoa(PessoaRequest pessoaRequest) {
        log.info("[inicia] PessoaController - criaPessoa");
        var pessoaResponse = pessoaService.criaPessoa(pessoaRequest);
        log.info("[finaliza] PessoaController - criaPessoa");
        return pessoaResponse;
    }

    @Override
    public List<PessoaListResponse> buscaTodasPessoas() {
        log.info("[inicia] PessoaController - buscaTodos");
        var pessoas = pessoaService.buscaTodasPessoas();
        log.info("[finaliza] PessoaController - buscaTodos");
        return pessoas;
    }

    @Override
    public PessoaDetalhadoResponse buscaPessoaPeloId(UUID idPessoa) {
        log.info("[inicia] PessoaController - buscaPessoaPeloId");
        log.info("[idPessoa] {}", idPessoa);
        var pessoa = pessoaService.buscaPessoaPeloId(idPessoa);
        log.info("[finaliza] PessoaController - buscaPessoaPeloId");
        return pessoa;
    }

    @Override
    public void alteraPessoa(UUID idPessoa, PessoaAlteracaoRequest pessoaAlteracaoRequest) {
        log.info("[inicia] PessoaController - alteraPessoa");
        log.info("[idPessoa] {}", idPessoa);
        pessoaService.alteraPessoa(idPessoa,pessoaAlteracaoRequest);
        log.info("[finaliza] PessoaController - alteraPessoa");
    }
}
