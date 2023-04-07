package com.attornatus.test.attornatuspessoa.pessoa.application.api.responses;

import com.attornatus.test.attornatuspessoa.pessoa.domain.entities.Pessoa;
import lombok.Value;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Value
public class PessoaListResponse {
    private UUID idPessoa;
    private String nomePessoa;
    private String telefone;
    private LocalDateTime dataHoraDoCadastro;

    public static List<PessoaListResponse> converte(List<Pessoa> pessoas) {

        return pessoas.stream()
                .map(PessoaListResponse:: new)
                .collect(Collectors.toList());
    }

    public PessoaListResponse(Pessoa pessoa) {
        this.idPessoa = pessoa.getIdPessoa();
        this.nomePessoa = pessoa.getNomePessoa();
        this.telefone = pessoa.getTelefone();
        this.dataHoraDoCadastro = pessoa.getDataHoraDoCadastro();
    }
}
