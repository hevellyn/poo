package atividade09;
import java.util.*;

/**
 * Interface utilizada para CRUD de uma agenda
 * @author H�vellyn
 *
 */
public interface AgendaIF {
	
	/**
	 * M�todo que adicionar� um Contato.
	 * 
	 * @param nome receber� uma string com o nome do contato
	 * @param telefone receber� uma string com o numero do contato
	 */
	public void adicionarContato(String nome, String tel)throws ContatoExistenteException; 
	
	/**
	 * M�todo que remover� um Contato.
	 * 
	 * @param string com o nome do contato a ser pesquisado para ent�o ser removido
	 * @throws ContatoInexistenteException
	 */
	public void removerContato(String nomeContato) throws ContatoInexistenteException;
	
	/**
	 * M�todo pesquisar� um Contato atrav�s de uma chave de busca passada como par�metro
	 * 
	 * @param nomeContato - string com o nome do contato a ser pesquisado
	 * @return Retornar� o contato encontrado
	 * @throws ContatoInexistenteException
	 */
	public Contato pesquisarContato(String nomeContato) throws ContatoInexistenteException;
	
	/**
	 * M�todo que retornar� uma cole��o de contatos
	 */
	public Collection<Contato> getContatos();
	
	/**
	 * M�todo que retornar� um Iterator de contatos ordenados
	 */
	@SuppressWarnings("rawtypes")
	public Iterator getContatosOrdenados();
}
