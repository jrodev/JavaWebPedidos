package pe.edu.galaxy.training.java.web.app.pedidos.servicio.excepcion;

public class ServicioException extends Exception{

	private static final long serialVersionUID = 1L;

	public ServicioException() {
		
	}

	public ServicioException(Throwable cause) {
		super(cause);

	}
	
	public ServicioException(String message) {
		super(message);
	}

	public ServicioException(String message, Throwable cause) {
		super(message, cause);
	}

	public ServicioException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
