package br.com.springboot.entity;

import javax.persistence.*;

import br.com.springboot.vo.EnderecoVO;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@NoArgsConstructor
@Table(name = "PESSOAS")
public class PessoaEntity {
    @Id
    @Column(name="ID", nullable = false)
    private Integer id;
    @Column(name="NOME", nullable = false)
    private String nome;
    @Column(name="DATANASCIMENTO", nullable = false)
    private String dataNascimento;
    @OneToMany(mappedBy = "pessoa", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<EnderecoEntity> endereco;
}
