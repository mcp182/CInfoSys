package br.com.cinfosys.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.cinfosys.modelo.ControleChave;
import br.com.cinfosys.modelo.OrdemServico;

@Repository
public class OrdemServicoDAO {
	@PersistenceContext
	private EntityManager manager;
	
	public void adiciona(OrdemServico os) {
		manager.persist(os);
	}
	
	public void altera(OrdemServico os) {
		manager.merge(os);
	}
	
	public List<OrdemServico> lista() {
		return manager.createQuery("from OrdemServico order by prioridade").getResultList();
	}
	
	public OrdemServico buscaPorId(int id) {
		return manager.find(OrdemServico.class, id);
	}
	
	public void remove(OrdemServico os) {
		OrdemServico LinhaARemover = buscaPorId(os.getId());
		manager.remove(LinhaARemover);
	}
	
	public void finaliza(int id) {
		OrdemServico os = buscaPorId(id);
		os.setFinalizado(true);
	}
	
}
