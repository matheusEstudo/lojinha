package br.com.senac.dao.vendedor;

import br.com.senac.dao.BaseDaoImpl;
import br.com.senac.entidade.Vendedor;
import java.io.Serializable;
import org.hibernate.*;

public class VendedorDaoimpl extends BaseDaoImpl<Vendedor, Long> implements VendedorDao, Serializable {

    @Override
    public Vendedor pesquisarPorID(Long id, Session sessao) throws HibernateException {
        return sessao.get(Vendedor.class, id);
    }

}
