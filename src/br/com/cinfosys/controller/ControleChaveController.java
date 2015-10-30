package br.com.cinfosys.controller;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.cinfosys.dao.ControleChaveDAO;
import br.com.cinfosys.modelo.ControleChave;

@Transactional
@Controller
public class ControleChaveController {
	
	@Autowired
	private ControleChaveDAO ccdao;
	
	@RequestMapping("/retiradaChave")
	public String retiradaChave(){
		return "retiradaChave";
	}
	
	@RequestMapping("/controleChaveMenu")
	public String controleChaveMenu(){
		return "controleChaveMenu";
	}
	
	@RequestMapping("/adicionada")
	public String adiciona(ControleChave controlechave) {
		ccdao.adiciona(controlechave);
		return "controleChaveMenu";
	}
	
	@RequestMapping("/historicoRetirada")
	public String historicoRetirada(Model model){
		model.addAttribute("cc", ccdao.lista());
		return "historicoRetirada";
	}
	
	@ResponseBody
	@RequestMapping("finalizaRetirada")
	public void finaliza(int carteirinha) {
		ccdao.finaliza(carteirinha); 
	}

}
