package br.com.springboot.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@Table(name = "ENDERECOS")
public class EnderecoEntity {
    @Id
    @Column(name="ID", nullable = false)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "IDPESSOA", referencedColumnName = "ID")
    private PessoaEntity pessoa;
    @Column(name="LOGRADOURO", nullable = false)
    private String logradouro;
    @Column(name="CEP", nullable = false)
    private String cep;
    @Column(name="NUMERO", nullable = false)
    private Integer numero;
    @Column(name="CIDADE", nullable = false)
    private String cidade;
    @Column(name="PRINCIPAL", nullable = false)
    private boolean principal;
}
