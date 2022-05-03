package br.com.senac.entidade;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.*;
import lombok.*;

@Entity
@Table(name = "produto")
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Produto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 130)
    private String nome;
    @Column
    private String descricao;

    @Column
    private Double valor;

    @Column
    private Date data_de_validade;

    public Produto() {
    }

    public Produto(Long id, String nome, String descricao, Double valor, Date data_de_validade) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.data_de_validade = data_de_validade;
    }

}
