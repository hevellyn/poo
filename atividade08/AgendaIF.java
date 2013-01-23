package atividade08;
import java.util.*;

/**
 * Esta interface deverá ser utilizada na criação de agendas telefônicas.
 * 
 * @author Hévellyn
 *
 */
public interface AgendaIF {
	
	/**
	 * Adicionará um objeto do tipo Contato.
	 * 
	 * @param nome Receberá o nome do contato a ser adicionado.
	 * @param telefone Receberá o número de telefone do contato a ser adicionado.
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
	 * Método pesquisa um Contato através de uma chave de busca passada como parâmetro
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
