package atividade05;

import java.util.ArrayList;

public class Agenda implements AgendaIF{
	private ArrayList<Contato> contatos;
	
	public Agenda() {
		 contatos = new ArrayList<>();
	}

	public void adicionarContato(String nome, String telefone) {
		contatos.add(new Contato(nome, telefone));
	}

	public void removerContato(String nomeContato) throws ContatoInexistenteException{
		for (Contato c : this.contatos) {
			if(c.getNome().equals(nomeContato)){
				this.contatos.remove(c);
			}
		}
		throw new ContatoInexistenteException();
	}

	public Contato pesquisarContato(String nomeContato) throws ContatoInexistenteException{
		for (Contato c : this.contatos) {
			if(c.getNome().equals(nomeContato)){
				return c;
			}
		}
		throw new ContatoInexistenteException();
	}

}
