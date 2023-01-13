package br.com.springboot.service.impl;

import br.com.springboot.repository.PessoaRepository;
import br.com.springboot.vo.PessoaVO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class PessoaServiceImpl {
    private final PessoaRepository repository;

    public void Salvar(PessoaVO pessoa) {
        //Todo: Fazer salvamento entidade
        repository.save(pessoa);
    }
}
