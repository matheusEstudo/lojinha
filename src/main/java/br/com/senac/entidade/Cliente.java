package br.com.senac.entidade;

import java.io.Serializable;
import javax.persistence.*;
import lombok.*;

@Entity
@Table(name = "cliente")
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 130)
    private String nome;

    @Column(length = 16)
    private String cpf;

    @Column(length = 130, nullable = false)
    private String usuario;

    @Column(length = 130, nullable = false)
    private String senha;

    public Cliente() {
    }

    public Cliente(Long id, String nome, String cpf, String usuario, String senha) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.usuario = usuario;
        this.senha = senha;
    }

}
