package com.attornatus.test.attornatuspessoa.pessoa.application.api.responses;

import com.attornatus.test.attornatuspessoa.pessoa.domain.entities.Pessoa;
import lombok.Value;

import java.time.LocalDateTime;
import java.util.UUID;

@Value
public class PessoaDetalhadoResponse {
    private UUID idPessoa;
    private String nomePessoa;
    private String telefone;
    private LocalDateTime dataHoraDoCadastro;

    public PessoaDetalhadoResponse(Pessoa pessoa) {
        this.idPessoa = pessoa.getIdPessoa();
        this.nomePessoa = pessoa.getNomePessoa();
        this.telefone = pessoa.getTelefone();
        this.dataHoraDoCadastro = pessoa.getDataHoraDoCadastro();
    }
}
