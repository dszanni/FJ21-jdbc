package br.caelum.jdbc.model.teste;

import java.text.SimpleDateFormat;
import java.util.List;

import br.caelum.jdbc.model.Contato;
import br.caelum.jdbc.model.dao.ContatoDao;

public class TestaLista {

	public static void main(String[] args) {
		ContatoDao dao = new ContatoDao();
		List<Contato> contatos = dao.getLista();

		for (Contato contato : contatos) {
			System.out.println("Nome: " + contato.getNome());
			System.out.println("Email " + contato.getEmail());
			System.out.println("Endereco " + contato.getEmail());
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			System.out.println("Data de Nascimento: " + sdf.format(contato.getDataNascimento().getTime()));
		}

	}

}
