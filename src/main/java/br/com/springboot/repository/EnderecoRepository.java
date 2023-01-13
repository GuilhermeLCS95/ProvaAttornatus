package br.com.springboot.repository;

import br.com.springboot.entity.EnderecoEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository {
    EnderecoEntity findAllByIdPessoa(Integer idPessoa);

}
