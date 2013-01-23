package atividade01;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main{
	
	public static void main(String[] args){
		
		ControleDePedidos controle = new ControleDePedidos();
		GravadorDePedido gravador = new GravadorDePedido();
		
		Pedido p1 = new Pedido(001);
		p1.setCliente(new Cliente("andressa"));
		Pedido p2 = new Pedido(002);
		p2.setCliente(new Cliente("andressa"));
		controle.adicionaPedido(p1);
		controle.adicionaPedido(p2);
		
		int resultado = controle.calculaQuantidadeDePedidosDoCliente("andressa");
		if (resultado == 2){
			System.out.println("O programa está correto!");
		} else {
			System.out.println("O programa está incorreto!");
		}
		
		try{
			gravador.gravaPedidos(controle.getPedidos());
			System.out.println("Está funcionando!");
		} catch (FileNotFoundException e1) {
			System.out.println("Erro 01");
		} catch (IOException e2) {
			System.out.println("Erro 02");
		}
	}
	
}
		