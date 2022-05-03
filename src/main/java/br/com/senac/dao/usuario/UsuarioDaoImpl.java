package br.com.senac.dao.usuario;

import br.com.senac.dao.BaseDaoImpl;
import br.com.senac.entidade.Usuario;
import java.io.Serializable;
import org.hibernate.*;

public class UsuarioDaoImpl extends BaseDaoImpl<Usuario, Long> implements UsuarioDao, Serializable {

    @Override
    public Usuario pesquisarPorID(Long id, Session sessao) throws HibernateException {
        return sessao.get(Usuario.class, id);
    }

}
