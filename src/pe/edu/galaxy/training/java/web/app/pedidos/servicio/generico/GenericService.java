package pe.edu.galaxy.training.java.web.app.pedidos.servicio.generico;

import java.util.List;
import pe.edu.galaxy.training.java.web.app.pedidos.servicio.excepcion.ServicioException;

public interface GenericService<T> {

	public boolean insert(T t) throws ServicioException;
	
	public boolean update(T t) throws ServicioException;
	
	public boolean delete(T t) throws ServicioException;
	
	public T findByObject(T t) throws ServicioException;
	
	public List<T> findByLikeObject(T t) throws ServicioException;
	
}
