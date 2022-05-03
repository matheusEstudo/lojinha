package br.com.senac.dao.cliente;

import br.com.senac.dao.BaseDaoImpl;
import br.com.senac.entidade.Cliente;
import java.io.Serializable;
import org.hibernate.*;

public class ClienteDaoImpl extends BaseDaoImpl<Cliente, Long> implements ClienteDao, Serializable {

    @Override
    public Cliente pesquisarPorID(Long id, Session sessao) throws HibernateException {
        return sessao.get(Cliente.class, id);
    }

}
