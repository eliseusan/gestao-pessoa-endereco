package com.attornatus.test.attornatuspessoa.pessoa.domain.entities;

import com.attornatus.test.attornatuspessoa.pessoa.application.api.requests.PessoaRequest;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;
import java.util.UUID;

    @Entity
    @Getter
    @NoArgsConstructor(access = AccessLevel.PRIVATE)
    @AllArgsConstructor(access = AccessLevel.PRIVATE)
    @Table(name = "pessoa")
    public class Pessoa {

        @Id
        @Column(columnDefinition = "uuid", name = "idPessoa", updatable = false, unique = true, nullable = false)
        private UUID idPessoa;
        @NotBlank(message = "Insira seu nome")
        private String nomePessoa;
        @NotBlank(message = "Insira um telefone")
        private String telefone;
        private LocalDateTime dataHoraDoCadastro;
        private LocalDateTime dataDaAlteracaoDoCadastro;

        public Pessoa(PessoaRequest pessoaRequest) {
            this.idPessoa = UUID.randomUUID();
            this.nomePessoa = pessoaRequest.getNomePessoa();
            this.telefone= pessoaRequest.getTelefone();
            this.dataHoraDoCadastro = LocalDateTime.now();
        }
    }
