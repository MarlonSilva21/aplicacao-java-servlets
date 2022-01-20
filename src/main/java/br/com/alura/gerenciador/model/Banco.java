package br.com.alura.gerenciador.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {
	
	private static List<Empresa> listaEmpresas = new ArrayList<Empresa>();
	private static List<Usuario> listaUsuarios = new ArrayList<Usuario>();
	private static Integer pk = 1;
	
	
	static {
		Usuario u1 = new Usuario();
		u1.setLogin("marlon");
		u1.setSenha("123456");
		u1.setId(Banco.pk);
		
		Usuario u2 = new Usuario();
		u2.setLogin("nico");
		u2.setSenha("123456");
		u2.setId(Banco.pk);
		
		listaUsuarios.add(u1);
		listaUsuarios.add(u2);
	}
	
	public void add(Empresa empresa) {
		empresa.setId(Banco.pk++);
		Banco.listaEmpresas.add(empresa);
	}
	
	
	public List<Empresa> getEmpresas() {
		return Banco.listaEmpresas;
	}


	public void removeEmpresa(Integer id) {
		
		Iterator<Empresa> it = listaEmpresas.iterator();
		
		while(it.hasNext()) {
			Empresa emp = it.next();
			if(emp.getId() == id) {
				it.remove();
			}
		}
	}

	public Empresa buscaEmpresaPorId(Integer id) {
		
		for (Empresa empresa : listaEmpresas) {
			if (empresa.getId() == id) {
				return empresa;
			}
		}
		return null;
	}
	
	public void addUsuario(Usuario usuario) {
		usuario.setId(Banco.pk++);
		Banco.listaUsuarios.add(usuario);
	}


	public Usuario existeUsuario(String login, String senha) {
		
		for (Usuario usuario : listaUsuarios) {
			if(usuario.validaçãoLogin(login, senha)) {
				return usuario;
			}
		}
		return null;
	}
}
