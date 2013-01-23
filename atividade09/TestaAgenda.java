package atividade09;
import static org.junit.Assert.*;

import java.util.Iterator;

import org.junit.Test;

public class TestaAgenda {
	
		
		@SuppressWarnings("unchecked")
		@Test
		public void AgendaTest() {
			Agenda agenda = new Agenda();
			
			try{
				agenda.adicionarContato("andressa", "87676135");
			}catch (ContatoExistenteException exc){
				fail("O contato andressa não foi adicinado.");
			}
			
			try{
				assertEquals(agenda.pesquisarContato("andressa").getNome(), "andressa");
			} catch  (ContatoInexistenteException exc){
				fail("O contato andressa não foi encontrado.");
			}
						
			try{
				agenda.removerContato("andressa");
			} catch (ContatoInexistenteException excecao1){
				fail("O contato andressa não foi encontrado para ser removido.");
			
			}
			
			try{
				assertEquals(agenda.pesquisarContato("andressa").getNome(), "andressa");
				fail("Removeu um contato que não existe.");
			} catch  (ContatoInexistenteException excecao){		
			}
			
			try{
				agenda.adicionarContato("andressa", "87676135");
				agenda.adicionarContato("jefferson", "88133714");
			} catch (ContatoExistenteException excecao){
				fail("Erro ao adicionar os contatos jefferson e andressa");
			}
			
			Iterator <Contato> contOrdenados = agenda.getContatosOrdenados();
			assertTrue(contOrdenados.hasNext());
			
			Contato cont1 = contOrdenados.next();
			assertEquals("andressa", cont1.getNome());
			
			assertTrue(contOrdenados.hasNext());
			Contato cont2 = contOrdenados.next();
			assertEquals("jefferson", cont2.getNome());
		}
}

