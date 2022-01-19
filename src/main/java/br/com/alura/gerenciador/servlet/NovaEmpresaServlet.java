package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Cadastrando nova empresa");
		
		String nomeEmpresa = request.getParameter("nome");
		String dataAbertura = request.getParameter("data");
		Date data = null;
		
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			data = sdf.parse(dataAbertura);
		} catch (ParseException e) {
			throw new ServletException(e);
		}
		Empresa empresa = new Empresa(nomeEmpresa, data);
		
		Banco banco = new Banco();
		banco.add(empresa);
		
		request.setAttribute("Empresa", empresa.getNome());
		
		response.sendRedirect("listaEmpresas");
		
//		//chamar jsp
//		RequestDispatcher rd = request.getRequestDispatcher("/listaEmpresas");
//		
//		rd.forward(request, response);
	}
}
