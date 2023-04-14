package com.attornatus.test.attornatuspessoa.endereco.domain.entities;

import com.attornatus.test.attornatuspessoa.endereco.application.api.requests.EnderecoRequest;
import com.attornatus.test.attornatuspessoa.endereco.domain.enums.StatusEndereco;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.UUID;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "uuid", name = "idEndereco", updatable = false, unique = true, nullable = false)
    private UUID idEndereco ;
    @NotNull
    @Column(columnDefinition = "uuid", name = "referenceIdPessoa", nullable = false)
    private UUID referenceIdPessoa;
    @NotBlank
    @Size(min = 3, max = 30)
    private String logradouro;
    @NotBlank
    @Pattern(regexp = "\\d{5}-\\d{3}", message = "CEP inválido")
    private String cep;
    @NotNull
    private Integer numero;
    @NotBlank
    @Size(min = 3, max = 30)
    private String cidade;
    @Enumerated(EnumType.STRING)
    private StatusEndereco statusEndereco;
    private LocalDateTime dataHoraDoCadastro;

    public Endereco(EnderecoRequest enderecoRequest) {
        this.idEndereco = UUID.randomUUID();
        this.referenceIdPessoa = enderecoRequest.getReferenceIdPessoa();
        this.logradouro = enderecoRequest.getLogradouro();
        this.cep = enderecoRequest.getCep();
        this.numero = enderecoRequest.getNumero();
        this.cidade = enderecoRequest.getCidade();
        this.statusEndereco = enderecoRequest.getStatusEndereco();
        this.dataHoraDoCadastro = LocalDateTime.now();
    }
}
