package com.attornatus.test.attornatuspessoa.pessoa.infra;

import com.attornatus.test.attornatuspessoa.pessoa.application.repository.PessoaRepository;
import com.attornatus.test.attornatuspessoa.pessoa.domain.entities.Pessoa;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

import java.util.List;

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

    @Override
    public List<Pessoa> buscaTodasPessoas() {
        log.info("[inicia] PessoaInfraRepository - buscaTodasPessoas");
        var pessoas = pessoaSpringJPARepository.findAll();
        log.info("[finaliza] PessoaInfraRepository - buscaTodasPessoas");
        return pessoas;
    }
}
