package br.com.cinfosys.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.cinfosys.dao.ControleEstoqueDAO;
import br.com.cinfosys.modelo.ControleEstoque;

@Transactional
@Controller
public class ControleEstoqueController {
	
	@Autowired
	private ControleEstoqueDAO cedao;
	
	@RequestMapping("/cadastroMaterial")
	public String cadastroMaterial(){
		return "cadastroMaterial";
	}
	
	@RequestMapping("/materialAdicionado")
	public String adiciona(ControleEstoque controleestoque){
		cedao.adiciona(controleestoque);
		return "controleEstoqueMenu";
	}
	
	@RequestMapping("/controleEstoqueMenu")
	public String controleEstoqueMenu(){
		return "controleEstoqueMenu";
	}
	
	@RequestMapping("/estoqueDisponivel")
	public String estoqueDisponivel(){
		return "estoqueDisponivel";
	}
	
	@RequestMapping("/historicoMaterial")
	public String historicoMaterial(Model model){
		model.addAttribute("ce", cedao.lista());
		return "historicoMaterial";
	}
}
