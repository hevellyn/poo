package atividade03;

import java.util.Scanner;

public class Main{
	
	public static void main(String[] args){
		ItemDePedido itens;
		Pedido p = new Pedido(001);
		Scanner input = new Scanner(System.in);
		while(true){
			long codigoProduto = input.nextLong();
			if(codigoProduto == 0){
				break;
			}
			int quantidade = input.nextInt();
			double valorUnitario = input.nextDouble();
			itens = new ItemDePedido(quantidade, codigoProduto, valorUnitario);
			p.adicionaItem(itens);
		}
		double valorTotal = 0;
		for (ItemDePedido i : p.getItens()) {
			valorTotal += i.getValorUnitario();
		}
		System.out.println("O Valor total é: " + valorTotal + " R$");
		input.close();
	}
	
}
		