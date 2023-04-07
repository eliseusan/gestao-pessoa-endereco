package com.attornatus.test.attornatuspessoa.pessoa.application.api;

import com.attornatus.test.attornatuspessoa.pessoa.application.api.requests.PessoaRequest;
import com.attornatus.test.attornatuspessoa.pessoa.application.api.responses.PessoaListResponse;
import com.attornatus.test.attornatuspessoa.pessoa.application.api.responses.PessoaResponse;
import com.attornatus.test.attornatuspessoa.pessoa.application.service.PessoaService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@Log4j2
public class PessoaController implements PessoaAPI{
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
}
