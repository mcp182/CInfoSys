package br.com.cinfosys.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.cinfosys.dao.OrdemServicoDAO;
import br.com.cinfosys.modelo.OrdemServico;

@Transactional
@Controller
public class OrdemServicoController {
	
	@Autowired
	private OrdemServicoDAO osdao;
	
	@RequestMapping("/cadastroAtividade")
	public String cadastroAtividade(){
		return "cadastroAtividade";
	}
	
	@RequestMapping("/ordemAdicionada")
	public String adiciona(OrdemServico ordemservico){
		osdao.adiciona(ordemservico);
		return "ordemServicoMenu";
	}
	
	@RequestMapping("/ordemServicoMenu")
	public String ordemServicoMenu(){
		return "ordemServicoMenu";
	}
	
	@RequestMapping("/atividadesAbertas")
	public String atividadesAbertas(){
		return "atividadesAbertas";
	}
	
	@RequestMapping("/historicoAtividade")
	public String historicoAtividade(Model model){
		model.addAttribute("os", osdao.lista());
		return "historicoAtividade";
	}
	
	@ResponseBody
	@RequestMapping("finalizaServico")
	public void finaliza(int id) {
		osdao.finaliza(id); 
	}
	
}
