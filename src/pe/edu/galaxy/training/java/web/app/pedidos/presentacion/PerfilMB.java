package pe.edu.galaxy.training.java.web.app.pedidos.presentacion;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import pe.edu.galaxy.training.java.web.app.pedidos.entidad.Perfil;
import pe.edu.galaxy.training.java.web.app.pedidos.servicio.especifico.inf.PerfilService;
import pe.edu.galaxy.training.java.web.app.pedidos.servicio.excepcion.ServicioException;

@Controller("perfilMB")
public class PerfilMB {
	
	private Perfil perfil;
	private List<Perfil> lstPerfil;
	
	@Autowired
	private PerfilService perfilService;
	
	public PerfilMB() {
		
	}
	
	public void buscar(){
		try {
			System.out.println(this.getPerfil());
			lstPerfil= this.getPerfilService().findByLikeObject(this.getPerfil());
			
		/*	for (Perfil perfil : lstPerfil) {
				System.out.println(perfil);
			}*/
			
		} catch (ServicioException e) {
			e.printStackTrace();
		}
	}
	
	public String nuevo(){
		this.setPerfil(new Perfil());
		return "perfil_registro";
	}
		
	public void grabar(){
		boolean sw;
		if (this.getPerfil().getIdPerfil()>0) {
			try {
				sw=this.getPerfilService().update(this.getPerfil());
				if (sw) {
					System.out.println("Exito de actualización");
				} else {
					System.out.println("Error de actualización");
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}else{
			try {
				sw=this.getPerfilService().insert(this.getPerfil());
				if (sw) {
					System.out.println("Exito de inserción");
				} else {
					System.out.println("Error de inserción");
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
	}
	
	public String modificar(Perfil perfil){
		try {
			Perfil oPerfil= this.getPerfilService().findByObject(perfil);
			this.setPerfil(oPerfil);
		} catch (Exception e) {
			
		}
		return "perfil_registro";
	}
	
	public void eliminar(Perfil perfil){
		try {
			boolean sw=this.getPerfilService().delete(perfil);
			if (sw) {
				System.out.println("Exito de eliminación");
			} else {
				System.out.println("Error de eliminación");
			}
			
		} catch (Exception e) {
			
		}
	}

	@PostConstruct
	public void inti(){
		this.setPerfil(new Perfil());
		this.setLstPerfil(new ArrayList<Perfil>());
	}
	
	public PerfilService getPerfilService() {
		return perfilService;
	}

	public void setPerfilService(PerfilService perfilService) {
		this.perfilService = perfilService;
	}

	public Perfil getPerfil() {
		return perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}

	public List<Perfil> getLstPerfil() {
		return lstPerfil;
	}

	public void setLstPerfil(List<Perfil> lstPerfil) {
		this.lstPerfil = lstPerfil;
	}

	
	
}
