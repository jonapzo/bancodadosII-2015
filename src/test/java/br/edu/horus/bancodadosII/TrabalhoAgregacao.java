package br.edu.horus.bancodadosII;

import java.sql.ResultSet;

import org.junit.Test;

public class TrabalhoAgregacao extends BaseTest{

	/*
	 * 1- Listar id, primeiro nome, e quantidade de pedidos efetuados pelos clientes
	 * que tem o nome iniciando pela letra A em ordem alfabética.
	 */
	@Test
	public void testListarQuantidadeDePedidosClienteIniciamComA() throws Exception{
		ResultSet r = connection.createStatement().executeQuery(
			""
		);
		while (r.next()) {
			System.out.println();			
		}
	}


	/*
	 * 2 - Listar id cliente, nome cliente, id pedido, total do pedido para os 3 pedidos com os maiores 
	 * valores totais efetuados para a cidade chamada Seattle.
	 */
	@Test
	public void test3MaioresPedidosEmSeatle() throws Exception{
		ResultSet r = connection.createStatement().executeQuery(
			""
		);
		
		while (r.next()) {
			System.out.println();			
		}
	}


	/*
	 * 3 - Listar o id do produto, nome do produto, e valor total(item.quantidade X produto.preço) 
	 * em todos os pedidos em que ele foi mencionado.
	 */
	@Test
	public void testValorTotalDePedidosDeCadaProduto() throws Exception{
		ResultSet r = connection.createStatement().executeQuery(
			""
		);
		
		while (r.next()) {
			System.out.println();			
		}
	}
	
	/*
	 * 4 - Listar nome do cliente, quantidade dos pedidos, e média do valor dos pedidos por cliente.
	 */
	@Test
	public void testQuantidadePedidosComValorMedio() throws Exception{
		ResultSet r = connection.createStatement().executeQuery(
			""
		);
		while (r.next()) {
			System.out.println();				
		}
	}
	
	/*
	 * 5- Listar nome do produto e a média da quantidade vendida por pedido.
	 */
	@Test
	public void testQuantidadeMediaProdutoPorPedido() throws Exception{
		ResultSet r = connection.createStatement().executeQuery(
			""
		);
		while (r.next()) {
			System.out.println();				
		}
	}

	/*
	 * 6 - Listar produtos com quantidade total vendida maior que 10, para a rua que contenha "Seventh Av." no nome.
	 */
	@Test
	public void testProdutosComMaisDe10ParaSetimaAvenida() throws Exception{
		ResultSet r = connection.createStatement().executeQuery(
			""
		);
		
		while (r.next()) {
			System.out.println();			
		}
	}	
	
	/*
	 * 7 - Listar os somente os produtos que ainda não estão relacionados a nenhum pedidos.
	 */
	@Test
	public void testProdutosSemPedido() throws Exception{
		ResultSet r = connection.createStatement().executeQuery(
			""
		);
		
		while (r.next()) {
			System.out.println();			
		}
	}	
	
	/*
	 * 8 - Listar somente os clientes que já estão relacionados a algum pedido.
	 */
	@Test
	public void testClientesSemPedido() throws Exception{
		ResultSet r = connection.createStatement().executeQuery(
			""
		);
		
		while (r.next()) {
			System.out.println();			
		}
	}	
	
	/*
	 * 9 - Listar nome do cliente e rua quando a cidade for 'New York'.
	 */
	@Test
	public void testClientesDeNewYork() throws Exception{
		ResultSet r = connection.createStatement().executeQuery(
			""
		);		
		while (r.next()) {
			System.out.println();			
		}
	}
	
	/*
	 * 10 - Listar distintamente o nome dos produtos comprados por 'Laura'.
	 */
	@Test
	public void testProdutosCompradosPorLaura() throws Exception{
		ResultSet r = connection.createStatement().executeQuery(
			""
		);		
		while (r.next()) {
			System.out.println();			
		}
	}
}
