package com.attornatus.test.attornatuspessoa.pessoa.application.api;

import com.attornatus.test.attornatuspessoa.pessoa.application.api.requests.PessoaRequest;
import com.attornatus.test.attornatuspessoa.pessoa.application.api.responses.PessoaListResponse;
import com.attornatus.test.attornatuspessoa.pessoa.application.api.responses.PessoaResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
    @RequestMapping("/v1/pessoa")
    public interface PessoaAPI {
        @PostMapping
        @ResponseStatus(code = HttpStatus.CREATED)
        PessoaResponse criaPessoa(@Valid @RequestBody PessoaRequest pessoaRequest);

        @GetMapping
        @ResponseStatus(code = HttpStatus.OK)
        List<PessoaListResponse> buscaTodasPessoas();
    }
