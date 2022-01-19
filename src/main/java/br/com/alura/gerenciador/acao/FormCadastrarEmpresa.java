package br.com.alura.gerenciador.acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FormCadastrarEmpresa implements Acao{
	
	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("cadastrando empresa");
		
		return "forward:formNovaEmpresa.jsp";

	}
}
