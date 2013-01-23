package atividade05;

public class Contato {
	private String nome;
	private String telefone;
	
	public Contato(String nome, String telefone) {
		setNome(nome);
		settelefone(telefone);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String gettelefone() {
		return telefone;
	}

	public void settelefone(String telefone) {
		this.telefone = telefone;
	}

	
}
