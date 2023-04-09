package com.attornatus.test.attornatuspessoa.endereco.application.service;

import com.attornatus.test.attornatuspessoa.endereco.application.api.requests.EnderecoRequest;
import com.attornatus.test.attornatuspessoa.endereco.application.api.responses.EnderecoResponse;
import com.attornatus.test.attornatuspessoa.endereco.application.api.responses.EnderecosPessoaListResponse;
import com.attornatus.test.attornatuspessoa.endereco.application.repository.EnderecoRepository;
import com.attornatus.test.attornatuspessoa.endereco.domain.entities.Endereco;
import com.attornatus.test.attornatuspessoa.pessoa.application.service.PessoaService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
@Log4j2
public class EnderecoApplicationService implements EnderecoService{
    private final PessoaService pessoaService;
    private final EnderecoRepository enderecoRepository;

    @Override
    public EnderecoResponse criaEndereco(EnderecoRequest enderecoRequest) {
        log.info("[start] EnderecoApplicationService - criaEndereco");
        pessoaService.buscaPessoaPeloId(enderecoRequest.getReferenceIdPessoa());
        Endereco endereco = enderecoRepository.salvaEnderecoDaPessoa(new Endereco(enderecoRequest));
        log.info("[finish] EnderecoApplicationService - criaEndereco");
        return new EnderecoResponse(endereco.getIdEndereco());
    }

    @Override
    public List<EnderecosPessoaListResponse> buscaEnderecosPessoaPeloId(UUID idPessoa) {
        log.info("[inicia] EnderecoApplicationService - buscaEnderecosPessoaPeloId");
        pessoaService.buscaPessoaPeloId(idPessoa);
        List<Endereco> enderecosPessoa = enderecoRepository.buscaEnderecosoDaPessoaPeloId(idPessoa) ;
        log.info("[finaliza] EnderecoApplicationService - buscaEnderecosPessoaPeloId");
        return EnderecosPessoaListResponse.converte(enderecosPessoa);
    }
}
