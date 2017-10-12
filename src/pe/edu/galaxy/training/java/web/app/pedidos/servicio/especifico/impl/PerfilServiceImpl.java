package pe.edu.galaxy.training.java.web.app.pedidos.servicio.especifico.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.galaxy.training.java.web.app.pedidos.entidad.Perfil;
import pe.edu.galaxy.training.java.web.app.pedidos.persistencia.especifico.inf.PerfilDAO;
import pe.edu.galaxy.training.java.web.app.pedidos.persistencia.excepcion.PersistenciaExcepcion;
import pe.edu.galaxy.training.java.web.app.pedidos.servicio.especifico.inf.PerfilService;
import pe.edu.galaxy.training.java.web.app.pedidos.servicio.excepcion.ServicioException;

@Service("perfilService")
public class PerfilServiceImpl implements PerfilService {

	@Autowired
	private PerfilDAO perfilDAO; // IoC y DDI

	public PerfilServiceImpl() {

	}

	@Override
	public boolean insert(Perfil perfil) throws ServicioException {
		try {

			return this.getPerfilDAO().insert(perfil);

		} catch (PersistenciaExcepcion e) {
			throw new ServicioException(e);
		}
	}

	@Override
	public boolean update(Perfil perfil) throws ServicioException {
		try {
			return this.getPerfilDAO().update(perfil);

		} catch (PersistenciaExcepcion e) {
			throw new ServicioException(e);
		}
	}

	@Override
	public boolean delete(Perfil perfil) throws ServicioException {

		try {
			return this.getPerfilDAO().delete(perfil);

		} catch (PersistenciaExcepcion e) {
			throw new ServicioException(e);
		}
	}

	@Override
	public Perfil findByObject(Perfil perfil) throws ServicioException {
		try {
			return this.getPerfilDAO().findByObject(perfil);

		} catch (PersistenciaExcepcion e) {
			throw new ServicioException(e);
		}
	}

	@Override
	public List<Perfil> findByLikeObject(Perfil perfil)
			throws ServicioException {

		try {

			return this.getPerfilDAO().findByLikeObject(perfil);

		} catch (PersistenciaExcepcion e) {
			throw new ServicioException(e);
		}

	}

	public PerfilDAO getPerfilDAO() {
		return perfilDAO;
	}

	public void setPerfilDAO(PerfilDAO perfilDAO) {
		this.perfilDAO = perfilDAO;
	}

}
