package com.attornatus.test.attornatuspessoa.pessoa.infra;

import com.attornatus.test.attornatuspessoa.handler.APIException;
import com.attornatus.test.attornatuspessoa.pessoa.application.repository.PessoaRepository;
import com.attornatus.test.attornatuspessoa.pessoa.domain.entities.Pessoa;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
@RequiredArgsConstructor
@Log4j2
public class PessoaInfraRepository implements PessoaRepository {

    private final PessoaSpringJPARepository pessoaSpringJPARepository;

    @Override
    public Pessoa salvaPessoa(Pessoa pessoa) {
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

    @Override
    public Pessoa buscaPessoaPeloId(UUID idPessoa) {
        log.info("[inicia] PessoaInfraRepository - buscaPessoaPeloId");
        var pessoa = pessoaSpringJPARepository.findById(idPessoa)
                .orElseThrow(() -> APIException.build(HttpStatus.NOT_FOUND, "Pessoa não encontrada!"));
        log.info("[finaliza] PessoaInfraRepository - buscaPessoaPeloId");
        return pessoa;
    }
}
