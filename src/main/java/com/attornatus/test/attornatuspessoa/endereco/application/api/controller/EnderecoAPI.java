package com.attornatus.test.attornatuspessoa.endereco.application.api.controller;

import com.attornatus.test.attornatuspessoa.endereco.application.api.requests.EnderecoRequest;
import com.attornatus.test.attornatuspessoa.endereco.application.api.responses.EnderecoResponse;
import com.attornatus.test.attornatuspessoa.endereco.application.api.responses.EnderecosPessoaListResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/v1/endereco")
public interface EnderecoAPI {

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    EnderecoResponse criaEndereco(@Valid @RequestBody EnderecoRequest enderecoRequest);

    @GetMapping(value = "findEnderecoPessoa/{idPessoa}")
    @ResponseStatus(code = HttpStatus.OK)
    List<EnderecosPessoaListResponse> buscaTodasPessoas(@PathVariable UUID idPessoa);
}
