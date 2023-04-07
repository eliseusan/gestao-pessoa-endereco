package com.attornatus.test.attornatuspessoa.pessoa.infra;

import com.attornatus.test.attornatuspessoa.pessoa.domain.entities.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PessoaSpringJPARepository extends JpaRepository<Pessoa, UUID> {
}
