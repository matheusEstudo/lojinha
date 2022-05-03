/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senac.entidade;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
import lombok.*;

@Entity
@Table(name = "vendedor")
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Vendedor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 130)
    private String nome;

    @Column(length = 16)
    private String cpf;

    @Column(length = 20)
    private String tipoUsuario;

    @Column(length = 130, nullable = false)
    private String usuario;

    @Column(length = 130, nullable = false)
    private String senha;

    public Vendedor() {
    }

    public Vendedor(Long id, String nome, String cpf, String tipoUsuario, String usuario, String senha) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.tipoUsuario = tipoUsuario;
        this.usuario = usuario;
        this.senha = senha;
    }

}
