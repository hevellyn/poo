package atividade03;

import java.util.ArrayList;

public interface InterfaceSistemaDeControle{
	
	public void adicionaPedido(Pedido p);
	public void removePedido(long numPedido);
	public ArrayList<Pedido> pesquisaPedidosIncluindoProduto(long codProduto);

}
