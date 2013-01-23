package atividade01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class GravadorDePedido {

	@SuppressWarnings("unchecked")
	public ArrayList<Pedido> lePedidos() throws FileNotFoundException, IOException, ClassNotFoundException {
		try(FileInputStream fIn = new FileInputStream("C:/Users/Hevellyn/Desktop/atividade01/arquivo.ser")){
			try(ObjectInputStream oIn = new ObjectInputStream(fIn)){
				return (ArrayList<Pedido>) oIn.readObject();
			}
		}
	}
	
	public void gravaPedidos(ArrayList<Pedido> pedidos) throws FileNotFoundException, IOException{
		try(FileOutputStream fOut = new FileOutputStream("C:/Users/Hevellyn/Desktop/atividade/arquivo.ser")){
			try(ObjectOutputStream oOut = new ObjectOutputStream(fOut)){
				for (Pedido pedido : pedidos) {
					oOut.writeObject(pedido);
				}
			}
		}
	}
}
