package br.com.cinfosys.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.cinfosys.dao.UsuarioDAO;
import br.com.cinfosys.modelo.Usuario;

@Controller
public class LoginController {
	
	@RequestMapping("/loginForm")
	public String loginForm() {
		return "formulario-login";
	}
	
	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:loginForm";
	}
	
	@RequestMapping("/efetuaLogin")
	public String efetuaLogin(Usuario usuario, HttpSession session) {
		//UsuarioDAO dao = new UsuarioDAO();
		//boolean usuarioOK = dao.existeUser();
		
		//if(usuarioOK) {
			session.setAttribute("usuarioLogado", usuario);
			return "menu";
		//}
		//return "redirect:loginForm";
	}
	
	
}
