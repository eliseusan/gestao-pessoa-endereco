package com.attornatus.test.attornatuspessoa.pessoa.infra;

import com.attornatus.test.attornatuspessoa.pessoa.application.repository.PessoaRepository;
import com.attornatus.test.attornatuspessoa.pessoa.domain.entities.Pessoa;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
@Log4j2
public class PessoaInfraRepository implements PessoaRepository {

    private final PessoaSpringJPARepository pessoaSpringJPARepository;

    @Override
    public Pessoa salvaCliente(Pessoa pessoa) {
        log.info("[inicia] PessoaInfraRepository - salvaCobranca");
        var pessoaSalva = pessoaSpringJPARepository.save(pessoa);
        log.info("[finaliza] PessoaInfraRepository - salvaCobranca");
        return pessoaSalva;
    }
}
