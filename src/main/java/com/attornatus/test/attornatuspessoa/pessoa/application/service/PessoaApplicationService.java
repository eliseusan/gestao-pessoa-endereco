package com.attornatus.test.attornatuspessoa.pessoa.application.service;

import com.attornatus.test.attornatuspessoa.pessoa.application.api.requests.PessoaRequest;
import com.attornatus.test.attornatuspessoa.pessoa.application.api.responses.PessoaResponse;
import com.attornatus.test.attornatuspessoa.pessoa.application.repository.PessoaRepository;
import com.attornatus.test.attornatuspessoa.pessoa.domain.entities.Pessoa;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Log4j2
public class PessoaApplicationService implements PessoaService {
    private final PessoaRepository pessoaRepository;

    @Override
    public PessoaResponse criaPessoa(PessoaRequest pessoaRequest) {
        log.info("[inicia] ClienteApplicationService - criaPessoa");
        Pessoa pessoa = pessoaRepository.salvaCliente(new Pessoa(pessoaRequest));
        log.info("[finaliza] ClienteApplicationService - criaPessoa");
        return new PessoaResponse(pessoa.getIdPessoa());
    }
}
