package atividade01;

public class ItemDePedido{

	private int quantidade;
	private long codigoProduto;
	private double valorUnitario;
	
	public ItemDePedido(int quant, long cod, double valor){
		setQuantidade(quant);
		setcodigoProduto(cod);
		setValorUnitario(valor);
	}
	
	public int getQuantidade(){
		return quantidade;
	}
	
	public void setQuantidade(int quantidade){
		this.quantidade = quantidade;
	}
	
	public long getcodigoProduto(){
		return codigoProduto;
	}
	
	public void setcodigoProduto(long codigoProduto){
		this.codigoProduto = codigoProduto;
	}
	
	public double getValorUnitario(){
		return valorUnitario;
	}
	
	public void setValorUnitario(double valorUnitario){
		this.valorUnitario = valorUnitario;
	}
}