/**
 * Esta interface dever� ser utilizada na cria��o de agendas telef�nicas.
 * 
 * @author H�vellyn
 *
 */
package atividade07;
import java.util.*;

public interface AgendaIF {
	
	/**
	 * Adicionar� um objeto do tipo Contato.
	 * 
	 * @param nome Receber� o nome do contato a ser adicionado.
	 * @param telefone Receber� o n�mero de telefone do contato a ser adicionado.
	 */

	public void adicionarContato(String nome, String telefone)throws ContatoExistenteException; 
	
	/**
	 * Remover� um objeto do tipo Contato.
	 * 
	 * @param nomeContato Receber� o nome do contato a ser removido.
	 * @throws ContatoInexistenteException Lan�ar� a exce��o ContatoInexistenteException caso n�o encontre o contato a ser removido.
	 */
	
	public void removerContato(String nomeContato) throws ContatoInexistenteException;
	
	/**
	 * Pesquisar� um contato atrav�s do nome fornecido.
	 * 
	 * @param nomeContato R
	 * Receber� o nome do contato a ser pesquisado.
	 * @return Retornar� o contato encontrado.
	 * @throws ContatoInexistenteException Lan�ar� a exce��o ContatoInexistenteException caso n�o encontre o contato pesquisado.
	 */
	public Contato pesquisarContato(String nomeContato) throws ContatoInexistenteException;
	
	/**
	 * Retornar� todos os contatos atrav�s de uma Lista.
	 */
	public Collection<Contato> getContatos();
}
