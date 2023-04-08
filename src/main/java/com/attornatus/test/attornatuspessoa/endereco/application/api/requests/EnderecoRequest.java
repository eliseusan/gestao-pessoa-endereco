package com.attornatus.test.attornatuspessoa.endereco.application.api.requests;

import com.attornatus.test.attornatuspessoa.endereco.domain.enums.StatusEndereco;
import lombok.Value;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.UUID;
@Value
public class EnderecoRequest {
    @NotNull
    private UUID idPessoaEndereco ;
    @NotBlank
    private String logradouro;
    @NotBlank
    private String cep;
    @NotBlank
    private Integer numero;
    @NotBlank
    private String cidade;
    @Enumerated(EnumType.STRING)
    private StatusEndereco statusEndereco;
}
