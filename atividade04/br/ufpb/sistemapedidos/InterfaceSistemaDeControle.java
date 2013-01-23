package atividade04.br.ufpb.sistemapedidos;

import java.util.ArrayList;

/**
 * 
 * Interface que ajudar� no CRUD - create, read, update e delete
 * Ser� implementada no sistema de controle
 * @author H�vellyn
 *
 */

public interface InterfaceSistemaDeControle{
	
	/**
	 * M�todo que adicionar� um pedido em um Array de pedidos
	 * @param p - Recebe um objeto do tipo Pedido
	 */
	public void adicionaPedido(Pedido p);
	
	/**
	 * M�todo que varrer� um array de Pedido e remover� o pedido de acordo com o par�metro que ser� passado no m�todo
	 * @param numPedido - numero do pedido que ser� pesquisado no Array
	 */
	public void removePedido(long numPedido);
	
	/**
	 * Este m�todo varrer� um Array de Pedido de forma que quando o c�digo do produto no Array for comparado com o c�digo do 
	 * produto passado como par�metro possuirem valores iquais, o m�todo retornar� ent�o um Array contendo os pedidos cujos os codigos de 
	 * produtos iquais
	 * @param codProduto
	 * @return
	 */
	public ArrayList<Pedido> pesquisaPedidosIncluindoProduto(long codProduto);

}
