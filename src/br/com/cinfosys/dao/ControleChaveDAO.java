package br.com.cinfosys.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.cinfosys.modelo.ControleChave;


@Repository
public class ControleChaveDAO {
	
	@PersistenceContext
	private EntityManager manager;
	
	public void adiciona(ControleChave cc) {
		manager.persist(cc);
	}
	
	public void altera(ControleChave cc) {
		manager.merge(cc);
	}
	
	public List<ControleChave> lista() {
		return manager.createQuery("from ControleChave").getResultList();
	}
	
	public ControleChave buscaPorCarteirinha(int carteirinha) {
		return manager.find(ControleChave.class, carteirinha);
	}
	
	public void remove(ControleChave cc) {
		ControleChave LinhaARemover = buscaPorCarteirinha(cc.getCarteirinha());
		manager.remove(LinhaARemover);
	}
	
	public void finaliza(int carteirinha) {
			ControleChave cc = buscaPorCarteirinha(carteirinha);
			cc.setFinalizado(true);
		}
	
}
