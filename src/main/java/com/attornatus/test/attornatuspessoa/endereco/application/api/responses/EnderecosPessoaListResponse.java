package com.attornatus.test.attornatuspessoa.endereco.application.api.responses;

import com.attornatus.test.attornatuspessoa.endereco.domain.entities.Endereco;
import com.attornatus.test.attornatuspessoa.endereco.domain.enums.StatusEndereco;
import lombok.Value;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
@Value
public class EnderecosPessoaListResponse {
    private UUID idEndereco ;
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
    private StatusEndereco statusEndereco;
    private LocalDateTime dataHoraDoCadastro;
    private LocalDateTime dataDaAlteracaoDoCadastro;

    public EnderecosPessoaListResponse(Endereco endereco) {
        this.idEndereco = endereco.getIdEndereco();
        this.idPessoaEndereco = endereco.getIdPessoaEndereco();
        this.logradouro = endereco.getLogradouro();
        this.cep = endereco.getCep();
        this.numero = endereco.getNumero();
        this.cidade = endereco.getCidade();
        this.statusEndereco = endereco.getStatusEndereco();
        this.dataHoraDoCadastro = endereco.getDataHoraDoCadastro();
        this.dataDaAlteracaoDoCadastro = endereco.getDataDaAlteracaoDoCadastro();
    }

    public static List<EnderecosPessoaListResponse> converte(List<Endereco> enderecosPessoa) {
        return enderecosPessoa.stream()
                .map(EnderecosPessoaListResponse:: new)
                .collect(Collectors.toList());
    }
}
