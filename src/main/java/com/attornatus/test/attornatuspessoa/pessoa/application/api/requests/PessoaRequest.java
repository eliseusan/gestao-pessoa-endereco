package com.attornatus.test.attornatuspessoa.pessoa.application.api.requests;

import lombok.Value;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Value
public class PessoaRequest {
    @NotBlank(message = "Insira seu nome")
    @Size(min = 3, max = 30)
    private String nomePessoa;
    @NotBlank(message = "Insira um telefone")
    @Pattern(regexp = "\\(\\d{2}\\)\\s\\d{5}-\\d{4}", message = "O número de telefone deve estar no formato (xx) 9xxxx-xxxx")
    private String telefone;
}
