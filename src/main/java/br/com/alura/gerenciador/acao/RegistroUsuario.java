package br.com.alura.gerenciador.acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.model.Banco;
import br.com.alura.gerenciador.model.Usuario;

public class RegistroUsuario implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		System.out.println("Usuario salvo no banco");

		Usuario user = new Usuario();
		Banco banco = new Banco();
		
		String login = request.getParameter("login");
		String senha =  request.getParameter("senha");
		
		user.setLogin(login);
		user.setSenha(senha);
		
		banco.addUsuario(user);
		
		return "redirect:controller?acao=FormLogin";
	}

}
