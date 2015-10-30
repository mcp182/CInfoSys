package br.com.cinfosys.dao;



import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.cinfosys.modelo.Usuario;

public class UsuarioDAO {
	
	EntityManager manager;
	private boolean listando = manager.contains(1);
	
	public boolean existeUsuario(Usuario usuario){
		Query listUsers = manager.createQuery("from Usuario u where u.login");
		return listUsers != null ? true : false;
	}
	
	public Usuario buscaPorLogin(String login) {
		return manager.find(Usuario.class, login);
	}
	
	public boolean teste(Usuario usuario) {
		boolean b = manager.createQuery("from Usuario").getResultList() != null;
		return b;
	}
	
	public Boolean buscaPorLogin(Usuario usuario) {
		Usuario u = new Usuario();
		
		u = manager.find(Usuario.class, usuario);
		if(u != null){
		return true;
		}else
			return false;
		
	}
	
	public boolean existeUser() {
		//List<Usuario> listUser = manager.createQuery("from Usuario").getResultList();
		return false;
	}
	
	//public boolean novo() {
		 
		//if(isListando() != null){
		//return true;
		//}else
		//return false;
	//	}

	public boolean isListando() {
		return listando;
	}

	public void setListando(boolean listando) {
		this.listando = listando;
	}
	
}
