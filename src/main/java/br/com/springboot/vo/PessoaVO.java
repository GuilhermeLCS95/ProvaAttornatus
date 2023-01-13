package br.com.springboot.vo;

import lombok.Data;

import java.util.List;

public class PessoaVO {
    private Integer id;
    private String nome;
    private String dataNascimento;
    private List<EnderecoVO> endereco;
}
