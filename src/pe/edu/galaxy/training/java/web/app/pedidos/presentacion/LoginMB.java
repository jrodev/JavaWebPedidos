package pe.edu.galaxy.training.java.web.app.pedidos.presentacion;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;

import pe.edu.galaxy.training.java.web.app.pedidos.entidad.Usuario;

@Controller("loginMB")
public class LoginMB {
	
	private Usuario usuario;

	public LoginMB() {
		
	}
	
	@PostConstruct
	public void init(){
		this.setUsuario(new Usuario());
	}

	public String validarAcceso(){
		return "panel";
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
}
