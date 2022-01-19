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


@WebServlet("/alteraEmpresa")
public class AlteraEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nomeEmpresa =  request.getParameter("nome");
		String dataAbertura = request.getParameter("data");
		String idEmpresa = request.getParameter("id");
		Integer id = Integer.valueOf(idEmpresa);
		
		Banco banco = new Banco();
		
		final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Date data =  null;
		
		try {
			data = sdf.parse(dataAbertura);
		} catch (ParseException e) {
			throw new ServletException(e);
		}
		
		System.out.println(id);
		
		Empresa empresa = banco.buscaEmpresaPorId(id);	
		empresa.setNome(nomeEmpresa);
		empresa.setDataAbertura(data);
		
		response.sendRedirect("listaEmpresas");
		
		
	}

}
