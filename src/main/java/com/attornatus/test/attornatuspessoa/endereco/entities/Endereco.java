package com.attornatus.test.attornatuspessoa.endereco.entities;

import com.attornatus.test.attornatuspessoa.endereco.enums.StatusEndereco;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
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
    @Column(columnDefinition = "uuid", name = "idPessoa", nullable = false)
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
    private LocalDateTime dataHoraDoCadastro;
    private LocalDateTime dataDaAlteracaoDoCadastro;

}
