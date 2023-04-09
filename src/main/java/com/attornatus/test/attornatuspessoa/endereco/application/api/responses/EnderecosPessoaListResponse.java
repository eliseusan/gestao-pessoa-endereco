package com.attornatus.test.attornatuspessoa.endereco.application.api.responses;

import com.attornatus.test.attornatuspessoa.endereco.domain.entities.Endereco;
import com.attornatus.test.attornatuspessoa.endereco.domain.enums.StatusEndereco;
import com.attornatus.test.attornatuspessoa.pessoa.domain.entities.Pessoa;
import lombok.Value;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
@Value
public class EnderecosPessoaListResponse {
    private UUID idEndereco ;
    private UUID referenceIdPessoa;
    private String nomePessoa;
    private String telefone;
    private String logradouro;
    private String cep;
    private Integer numero;
    private String cidade;
    private StatusEndereco statusEndereco;
    private LocalDateTime dataHoraDoCadastro;

    public EnderecosPessoaListResponse(Endereco endereco, Pessoa pessoa) {
        this.idEndereco = endereco.getIdEndereco();
        this.referenceIdPessoa = endereco.getReferenceIdPessoa();
        this.nomePessoa = pessoa.getNomePessoa();
        this.telefone = pessoa.getTelefone();
        this.logradouro = endereco.getLogradouro();
        this.cep = endereco.getCep();
        this.numero = endereco.getNumero();
        this.cidade = endereco.getCidade();
        this.statusEndereco = endereco.getStatusEndereco();
        this.dataHoraDoCadastro = endereco.getDataHoraDoCadastro();
    }

    public static List<EnderecosPessoaListResponse> converte(List<Endereco> enderecosPessoa, List<Pessoa> listaDePessoas) {

        List<EnderecosPessoaListResponse> listaEnderecosDoCliente = new ArrayList<>();
        enderecosPessoa.stream().forEach(endereco -> {
            Optional<Pessoa> pessoaDoEndereco = listaDePessoas.stream()
                    .filter(pessoa -> pessoa.getIdPessoa().equals(endereco.getReferenceIdPessoa()))
                    .findFirst();
            if (pessoaDoEndereco.isPresent()) {
                listaEnderecosDoCliente.add(new EnderecosPessoaListResponse(endereco, pessoaDoEndereco.get()));
            }
        });
        return listaEnderecosDoCliente;
    }
}

