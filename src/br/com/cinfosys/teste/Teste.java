package br.com.cinfosys.teste;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.cinfosys.dao.ControleChaveDAO;
import br.com.cinfosys.dao.ControleEstoqueDAO;
import br.com.cinfosys.dao.UsuarioDAO;
import br.com.cinfosys.modelo.*;

public class Teste{
	public static void main(String[] args) {
		//EntityManagerFactory factory = Persistence.createEntityManagerFactory("CInfoSys");
		//EntityManager es = factory.createEntityManager();
		
		//UsuarioDAO dao = new UsuarioDAO();
		//UsuarioDAO dao2 = new UsuarioDAO();

		//Usuario usuario = new Usuario();
		//Usuario usuario2 = new Usuario();
		//Boolean u;
		ControleChave cc = new ControleChave();
		ControleChaveDAO des = new ControleChaveDAO();
		//usuario.setId(1);
		//usuario.setLogin("derp");
		//usuario.setSenha("123");
		//usuario2 = usuario;
		//cc = des.buscaPorCarteirinha(1);
		//u = dao.novo(usuario2);
		//usuario = dao.buscaPorLogin("derp");
		//des.buscaPorCarteirinha(12102433);
		
		cc.setNome("Joao");
		des.altera(cc);
		
	
		
		System.out.println(des);
		
		//ControleEstoque ce = es.find(ControleEstoque.class, 1);
		//System.out.println(encontrada.getId());
		

		//ControleChave ch = new ControleChave();
		//ControleEstoque ce = new ControleEstoque();
		//OrdemServico os = new OrdemServico();
		
		
		//ch.setNome("teste");
		//ch.setCarteirinha(123);
		//ch.setSalaLab(1);
		//ch.setRetirada(null);
		//ch.setDevolucao(null);


		//es.getTransaction().begin();
		//es.persist(ch);
		//es.getTransaction().commit();

		//es.getTransaction().begin();
		//es.remove(ce);
		//es.getTransaction().commit();
		
		//es.getTransaction().begin();
		//es.persist(os);
		//es.getTransaction().commit();

}
}