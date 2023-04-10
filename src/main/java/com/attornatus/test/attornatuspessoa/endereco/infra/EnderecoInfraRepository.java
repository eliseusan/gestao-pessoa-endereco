package com.attornatus.test.attornatuspessoa.endereco.infra;

import com.attornatus.test.attornatuspessoa.endereco.application.repository.EnderecoRepository;
import com.attornatus.test.attornatuspessoa.endereco.domain.entities.Endereco;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
@RequiredArgsConstructor
@Log4j2
public class EnderecoInfraRepository implements EnderecoRepository {

    private final EnderecoSpringJPARepository enderecoSpringJPARepository;

    @Override
    public Endereco salvaEnderecoDaPessoa(Endereco endereco) {
        log.info("[inicia] EnderecoInfraRepository - salvaEnderecoDaPessoa");
        var enderecoPessoa = enderecoSpringJPARepository.save(endereco);
        log.info("[finaliza] EnderecoInfraRepository - salvaEnderecoDaPessoa");
        return enderecoPessoa;
    }

    @Override
    public List<Endereco> buscaEnderecosoDaPessoaPeloId(UUID idPessoa) {
        log.info("[inicia] EnderecoInfraRepository - buscaEnderecosoDaPessoaPeloId");
        var enderecos = enderecoSpringJPARepository.findByreferenceIdPessoa(idPessoa);
        log.info("[finaliza] EnderecoInfraRepository - buscaEnderecosoDaPessoaPeloId");
        return enderecos;
    }
}
