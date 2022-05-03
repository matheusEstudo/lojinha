package br.com.senac.dao.produto;

import br.com.senac.dao.BaseDaoImpl;
import br.com.senac.entidade.Produto;
import java.io.Serializable;
import org.hibernate.HibernateException;
import org.hibernate.Session;

public class ProdutoDaoImpl extends BaseDaoImpl<Produto, Long> implements ProdutoDao, Serializable {

    @Override
    public Produto pesquisarPorID(Long id, Session sessao) throws HibernateException {
        return sessao.get(Produto.class, id);
    }

}
