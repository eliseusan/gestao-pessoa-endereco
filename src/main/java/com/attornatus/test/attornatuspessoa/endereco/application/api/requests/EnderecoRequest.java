package com.attornatus.test.attornatuspessoa.endereco.application.api.requests;

import com.attornatus.test.attornatuspessoa.endereco.domain.enums.StatusEndereco;
import lombok.Value;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.UUID;
@Value
public class EnderecoRequest {
    @NotNull
    private UUID idPessoaEndereco ;
    @NotBlank
    private String logradouro;
    @NotBlank
    @Pattern(regexp = "\\d{5}-\\d{3}", message = "CEP inválido")
    private String cep;
    @NotNull
    private Integer numero;
    @NotBlank
    private String cidade;
    @Enumerated(EnumType.STRING)
    private StatusEndereco statusEndereco;
}
