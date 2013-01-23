package atividade04.br.ufpb.sistemapedidos;

import java.util.ArrayList;

/**
 * 
 * Interface que ajudará no CRUD - create, read, update e delete
 * Será implementada no sistema de controle
 * @author Hévellyn
 *
 */

public interface InterfaceSistemaDeControle{
	
	/**
	 * Método que adicionará um pedido em um Array de pedidos
	 * @param p - Recebe um objeto do tipo Pedido
	 */
	public void adicionaPedido(Pedido p);
	
	/**
	 * Método que varrerá um array de Pedido e removerá o pedido de acordo com o parâmetro que será passado no método
	 * @param numPedido - numero do pedido que será pesquisado no Array
	 */
	public void removePedido(long numPedido);
	
	/**
	 * Este método varrerá um Array de Pedido de forma que quando o código do produto no Array for comparado com o código do 
	 * produto passado como parâmetro possuirem valores iquais, o método retornará então um Array contendo os pedidos cujos os codigos de 
	 * produtos iquais
	 * @param codProduto
	 * @return
	 */
	public ArrayList<Pedido> pesquisaPedidosIncluindoProduto(long codProduto);

}
