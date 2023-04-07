package com.attornatus.test.attornatuspessoa.pessoa.application.api.requests;

import lombok.Value;

import javax.validation.constraints.NotBlank;
@Value
public class PessoaRequest {
    @NotBlank(message = "Insira seu nome")
    private String nomePessoa;
    @NotBlank(message = "Insira um telefone")
    private String telefone;
}
