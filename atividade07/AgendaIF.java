/**
 * Esta interface deverá ser utilizada na criação de agendas telefônicas.
 * 
 * @author Hévellyn
 *
 */
package atividade07;
import java.util.*;

public interface AgendaIF {
	
	/**
	 * Adicionará um objeto do tipo Contato.
	 * 
	 * @param nome Receberá o nome do contato a ser adicionado.
	 * @param telefone Receberá o número de telefone do contato a ser adicionado.
	 */

	public void adicionarContato(String nome, String telefone)throws ContatoExistenteException; 
	
	/**
	 * Removerá um objeto do tipo Contato.
	 * 
	 * @param nomeContato Receberá o nome do contato a ser removido.
	 * @throws ContatoInexistenteException Lançará a exceção ContatoInexistenteException caso não encontre o contato a ser removido.
	 */
	
	public void removerContato(String nomeContato) throws ContatoInexistenteException;
	
	/**
	 * Pesquisará um contato através do nome fornecido.
	 * 
	 * @param nomeContato R
	 * Receberá o nome do contato a ser pesquisado.
	 * @return Retornará o contato encontrado.
	 * @throws ContatoInexistenteException Lançará a exceção ContatoInexistenteException caso não encontre o contato pesquisado.
	 */
	public Contato pesquisarContato(String nomeContato) throws ContatoInexistenteException;
	
	/**
	 * Retornará todos os contatos através de uma Lista.
	 */
	public Collection<Contato> getContatos();
}
