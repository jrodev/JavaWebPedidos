package pe.edu.galaxy.training.java.web.app.pedidos.persistencia.especifico.impl;

import java.util.List;

import pe.edu.galaxy.training.java.web.app.pedidos.entidad.Usuario;
import pe.edu.galaxy.training.java.web.app.pedidos.persistencia.especifico.inf.UsuarioDAO;
import pe.edu.galaxy.training.java.web.app.pedidos.persistencia.excepcion.PersistenciaExcepcion;

public class UsuarioDAOImpl implements UsuarioDAO{

	public UsuarioDAOImpl() {

	}

	@Override
	public boolean insert(Usuario t) throws PersistenciaExcepcion {

		return false;
	}

	@Override
	public boolean update(Usuario t) throws PersistenciaExcepcion {

		return false;
	}

	@Override
	public boolean delete(Usuario t) throws PersistenciaExcepcion {

		return false;
	}

	@Override
	public Usuario findByObject(Usuario t) throws PersistenciaExcepcion {

		return null;
	}

	@Override
	public List<Usuario> findByLikeObject(Usuario t)
			throws PersistenciaExcepcion {
		return null;
	}

}
