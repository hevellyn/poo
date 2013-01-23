package atividade04.br.ufpb.sistemapedidos;

import java.util.ArrayList;

/**
 * Classe que implementa a interface InterfaceSistemaDeControle
 * @author Hévellyn
 *
 */
public class ControleDePedidos implements InterfaceSistemaDeControle{

	private ArrayList<Pedido> pedidos;
	
	/**
	 * Construtor que instancia um Array de Pedido
	 */
	public ControleDePedidos(){
		pedidos = new ArrayList<Pedido>();
	}
	
	/**
	 * Método que calculará a quantidade de pedidos de um cliente
	 * @param nomeDoCliente
	 * @return um inteiro com a quantidade de pedidos de um cliente
	 */
	public int calculaQuantidadeDePedidosDoCliente(String nomeDoCliente){
		int cont = 0;
		for(Pedido p : pedidos){
			if(p.getCliente().getNome().equals(nomeDoCliente)){
				cont ++;
			}
		}
		return cont;
	}
	
	/**
	 * Método que adiciona um Pedido p
	 */
	public void adicionaPedido(Pedido p){
		pedidos.add(p);
	}
	
	/**
	 * Método que remove um Pedido de acordo com o numero do pedido que será passado como parâmetro
	 */
	public void removePedido(long numPedido){
		for(Pedido p : pedidos){
			if(p.getNumeroDoPedido() == numPedido){
				pedidos.remove(p);
			}
		}
	}
	
	/**
	 * Método que pesquisa pedidos e retorna um Array de pedidos que tenham um código de produto iqual ao que foi passado no parâmetro
	 */
	public ArrayList<Pedido> pesquisaPedidosIncluindoProduto(long codProduto){
		ArrayList<Pedido> retorno = new ArrayList<>();
		for(Pedido p : pedidos){
			for(ItemDePedido i : p.getItens()){
				if(i.getcodigoProduto() == codProduto){
					retorno.add(p);
				}
			}
		}
		return retorno;
	}
	
	/**
	 * Método get que retornará o Array de Pedido 
	 * @return
	 */
	public ArrayList<Pedido>  getPedidos(){
		return pedidos;
	}
	
}
	
	
	