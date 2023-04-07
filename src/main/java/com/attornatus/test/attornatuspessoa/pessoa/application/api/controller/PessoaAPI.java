package com.attornatus.test.attornatuspessoa.pessoa.application.api.controller;

import com.attornatus.test.attornatuspessoa.pessoa.application.api.requests.PessoaRequest;
import com.attornatus.test.attornatuspessoa.pessoa.application.api.responses.PessoaDetalhadoResponse;
import com.attornatus.test.attornatuspessoa.pessoa.application.api.responses.PessoaListResponse;
import com.attornatus.test.attornatuspessoa.pessoa.application.api.responses.PessoaResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/v1/pessoa")
public interface PessoaAPI {
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    PessoaResponse criaPessoa(@Valid @RequestBody PessoaRequest pessoaRequest);

    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    List<PessoaListResponse> buscaTodasPessoas();

    @GetMapping(value = "/{idPessoa}")
    @ResponseStatus(code = HttpStatus.OK)
    PessoaDetalhadoResponse buscaPessoaPeloId(@PathVariable UUID idPessoa);

}
