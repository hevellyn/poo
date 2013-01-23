package atividade08;

import java.util.*;
import java.io.*;

public class GravadorDeContatos {
	
		@SuppressWarnings("unchecked")
		public Collection<Contato> recuperaContato() throws IOException{
			ObjectInputStream aux = null;
			try{
				aux = new ObjectInputStream(new FileInputStream("contatos.txt"));
				return (Collection<Contato>)aux.readObject();
			}catch(FileNotFoundException exc){
				throw new IOException("O arquivo n�o foi encontrado",exc);
			}catch(ClassNotFoundException exc){
				throw new IOException("A classe n�o foi encontrada",exc);
			}catch(IOException exc){
				throw exc;
			}finally{
				if(aux != null){
					aux.close();
				}
			}
		}
		public void gravaContato(Collection<Contato> contatos)throws IOException{
			ObjectOutputStream aux = null;
			try{
				aux = new ObjectOutputStream(new FileOutputStream(new File("contatos.txt")));
				aux.writeObject(contatos);
			}catch(FileNotFoundException exc){
				throw new IOException("O arquivo n�o foi encontrado", exc);
			}catch(IOException exc){
				System.err.println();
				throw exc;
			}finally{
				if(aux != null){
					aux.close();
				}
			}
	}
}

