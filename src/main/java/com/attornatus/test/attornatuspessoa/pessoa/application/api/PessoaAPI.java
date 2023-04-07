package com.attornatus.test.attornatuspessoa.pessoa.application.api;

import com.attornatus.test.attornatuspessoa.pessoa.application.api.requests.PessoaRequest;
import com.attornatus.test.attornatuspessoa.pessoa.application.api.responses.PessoaResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
    @RestController
    @RequestMapping("/v1/pessoa")
    public interface PessoaAPI {
        @PostMapping
        @ResponseStatus(code = HttpStatus.CREATED)
        PessoaResponse criaPessoa(@Valid @RequestBody PessoaRequest pessoaRequest);
    }
