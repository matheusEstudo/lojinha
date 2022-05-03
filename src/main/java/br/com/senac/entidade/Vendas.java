package br.com.senac.entidade;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
import lombok.*;

@Entity
@Table(name = "vendas")
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Vendas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "fk_vendedor")
    private Vendedor vendedor;

    @OneToMany
    @JoinColumn(name = "fk_prouto")
    private List<Produto> produtos;

    @ManyToOne
    @JoinColumn(name = "fk_cliente")
    private Cliente cliente;

    public Vendas() {
    }

    public Vendas(Long id, Vendedor vendedor, List<Produto> produtos, Cliente cliente) {
        this.id = id;
        this.vendedor = vendedor;
        this.produtos = produtos;
        this.cliente = cliente;
    }

}
