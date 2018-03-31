package br.caelum.jdbc.model.teste;

import java.util.Calendar;

import br.caelum.jdbc.model.Contato;
import br.caelum.jdbc.model.dao.ContatoDao;

public class TestaInsere {

	public static void main(String[] args) {
		Contato contato = new Contato();
		contato.setNome("Caelum9");
		contato.setEmail("caelum@caelum.com.br");
		contato.setEndereco("R. Vergueiro");

		// getInstance é um metodo static para formatar a data e por ser
		// estatico nao precisa ser instanciado
		contato.setDataNascimento(Calendar.getInstance());

		ContatoDao dao = new ContatoDao();
		dao.adiciona(contato);


			System.out.println("Contato gravado");

		dao.close();

	}

}
