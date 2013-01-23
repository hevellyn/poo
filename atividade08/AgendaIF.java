package atividade08;
import java.util.*;

/**
 * Esta interface dever� ser utilizada na cria��o de agendas telef�nicas.
 * 
 * @author H�vellyn
 *
 */
public interface AgendaIF {
	
	/**
	 * Adicionar� um objeto do tipo Contato.
	 * 
	 * @param nome Receber� o nome do contato a ser adicionado.
	 * @param telefone Receber� o n�mero de telefone do contato a ser adicionado.
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
	 * M�todo pesquisa um Contato atrav�s de uma chave de busca passada como par�metro
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
