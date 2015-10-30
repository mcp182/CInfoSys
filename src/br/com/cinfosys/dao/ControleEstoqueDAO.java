package br.com.cinfosys.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.cinfosys.modelo.ControleEstoque;

@Repository
public class ControleEstoqueDAO {
	
	@PersistenceContext
	private EntityManager manager;
	
	public void adiciona(ControleEstoque ce) {
		manager.persist(ce);
	}
	
	public void altera(ControleEstoque ce) {
		manager.merge(ce);
	}
	
	public List<ControleEstoque> lista() {
		return manager.createQuery("from ControleEstoque").getResultList();
	}
	
	public ControleEstoque buscaPorId(int id) {
		return manager.find(ControleEstoque.class, id);
	}
	
	public void remove(ControleEstoque ce) {
		ControleEstoque LinhaARemover = buscaPorId(ce.getId());
		manager.remove(LinhaARemover);
	}
}
