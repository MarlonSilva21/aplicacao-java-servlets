package br.com.alura.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.acao.Acao;
import br.com.alura.gerenciador.acao.AlteraEmpresa;
import br.com.alura.gerenciador.acao.CadastrarEmpresa;
import br.com.alura.gerenciador.acao.FormCadastrarEmpresa;
import br.com.alura.gerenciador.acao.ListaEmpresas;
import br.com.alura.gerenciador.acao.MostraEmpresa;
import br.com.alura.gerenciador.acao.RemoveEmpresa;

@WebServlet("/controller")
public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String paramAcao = request.getParameter("acao");
		String nomeClasse = "br.com.alura.gerenciador.acao." + paramAcao;

		String nome;
		try {
			Class classe = Class.forName(nomeClasse);
			Acao acao = (Acao) classe.newInstance();
			nome = acao.executa(request, response);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | ServletException| IOException e) {
			throw new ServletException(e);
		}

		String[] prefixoEndereco = nome.split(":");

		if (prefixoEndereco[0].equals("forward")) {
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/" + prefixoEndereco[1]);
			rd.forward(request, response);
		} else {
			response.sendRedirect(prefixoEndereco[1]);
		}

//		if(paramAcao.equals("CadastrarEmpresa")) {
//			CadastrarEmpresa acao = new CadastrarEmpresa();
//			nome = acao.executa(request, response);
//		}
//		
//		else if(paramAcao.equals("ListaEmpresas")) {	
//			ListaEmpresas acao = new ListaEmpresas();
//			nome = acao.executa(request, response);
//		}
//		
//		else if(paramAcao.equals("RemoveEmpresa")) {
//			RemoveEmpresa acao = new RemoveEmpresa();
//			nome = acao.executa(request, response);
//		}
//		
//		else if(paramAcao.equals("MostraEmpresa")) {
//			MostraEmpresa acao = new MostraEmpresa();
//			nome = acao.executa(request, response);
//		}
//		
//		else if(paramAcao.equals("AlteraEmpresa")) {
//			AlteraEmpresa acao = new AlteraEmpresa();
//			nome = acao.executa(request, response);
//		}
//		
//		else if(paramAcao.equals("FormCadastrarEmpresa")) {
//			FormCadastrarEmpresa acao = new FormCadastrarEmpresa();
//			nome = acao.executa(request, response);
//		}

	}
}
