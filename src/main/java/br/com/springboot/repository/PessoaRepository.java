package br.com.springboot.repository;

import br.com.springboot.entity.PessoaEntity;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@Repository
public interface PessoaRepository extends JpaRepository<PessoaEntity, Integer> {

    PessoaEntity findAllById (Integer idPessoa);
    List<PessoaEntity> findAll();
}
