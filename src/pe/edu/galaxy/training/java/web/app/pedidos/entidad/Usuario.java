package pe.edu.galaxy.training.java.web.app.pedidos.entidad;

public class Usuario extends GenericEntidad {
	
	private int 	idUsuario;
	private String 	usuario;
	private String 	clave;
	
	private Perfil  perfil;	// Relación de 1
	
	public Usuario() {
		super();
		this.init(); // Llamada 1
	}

	public Usuario(String usuario, String clave) {
		super();
		this.usuario = usuario;
		this.clave = clave;
		this.init();// Llamada 2
	}
	
	
	private void init(){
		this.setPerfil(new Perfil());
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public Perfil getPerfil() {
		return perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}	
}
