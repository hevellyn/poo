package atividade09;
import java.util.*;

/**
 * Interface utilizada para CRUD de uma agenda
 * @author Hévellyn
 *
 */
public interface AgendaIF {
	
	/**
	 * Método que adicionará um Contato.
	 * 
	 * @param nome receberá uma string com o nome do contato
	 * @param telefone receberá uma string com o numero do contato
	 */
	public void adicionarContato(String nome, String tel)throws ContatoExistenteException; 
	
	/**
	 * Método que removerá um Contato.
	 * 
	 * @param string com o nome do contato a ser pesquisado para então ser removido
	 * @throws ContatoInexistenteException
	 */
	public void removerContato(String nomeContato) throws ContatoInexistenteException;
	
	/**
	 * Método pesquisará um Contato através de uma chave de busca passada como parâmetro
	 * 
	 * @param nomeContato - string com o nome do contato a ser pesquisado
	 * @return Retornará o contato encontrado
	 * @throws ContatoInexistenteException
	 */
	public Contato pesquisarContato(String nomeContato) throws ContatoInexistenteException;
	
	/**
	 * Método que retornará uma coleção de contatos
	 */
	public Collection<Contato> getContatos();
	
	/**
	 * Método que retornará um Iterator de contatos ordenados
	 */
	@SuppressWarnings("rawtypes")
	public Iterator getContatosOrdenados();
}
