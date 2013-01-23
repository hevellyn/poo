package atividade04.br.ufpb.sistemapedidos;

import java.util.ArrayList;

/**
 * Classe que implementa a interface InterfaceSistemaDeControle
 * @author H�vellyn
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
	 * M�todo que calcular� a quantidade de pedidos de um cliente
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
	 * M�todo que adiciona um Pedido p
	 */
	public void adicionaPedido(Pedido p){
		pedidos.add(p);
	}
	
	/**
	 * M�todo que remove um Pedido de acordo com o numero do pedido que ser� passado como par�metro
	 */
	public void removePedido(long numPedido){
		for(Pedido p : pedidos){
			if(p.getNumeroDoPedido() == numPedido){
				pedidos.remove(p);
			}
		}
	}
	
	/**
	 * M�todo que pesquisa pedidos e retorna um Array de pedidos que tenham um c�digo de produto iqual ao que foi passado no par�metro
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
	 * M�todo get que retornar� o Array de Pedido 
	 * @return
	 */
	public ArrayList<Pedido>  getPedidos(){
		return pedidos;
	}
	
}
	
	
	