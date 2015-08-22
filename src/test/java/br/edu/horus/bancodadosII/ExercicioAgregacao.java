package br.edu.horus.bancodadosII;

import java.sql.ResultSet;

import org.junit.Test;

public class ExercicioAgregacao  extends BaseTest{
	
	/*
	 * Lista id e nome dos produtos, ordenando de quantidade total vendida em ordem decrescente
	 */
	@Test
	public void testProdutosMaisVendidos() throws Exception{
		ResultSet r = connection.createStatement().executeQuery(
			"SELECT products.id, products.name, SUM(items.quantity) AS total" + 
		    " FROM products " +
			" INNER JOIN items ON items.product_id = products.id " +
		    " GROUP BY products.id " +
		    " ORDER BY total DESC "
		);
		
		while (r.next()) {
			System.out.println(r.getInt(1) +  " " +r.getString(2)+  " " +r.getDouble(3));
			
		}
	}


	/*
	 * Lista id e nome dos produtos, ordenando de quantidade total vendida em ordem decrescente sem "JOIN"
	 */
	@Test
	public void testProdutosMaisVendidosSemJoin() throws Exception{
		ResultSet r = connection.createStatement().executeQuery(
			"SELECT products.id, products.name, SUM(items.quantity) AS total" + 
		    " FROM products, items " +
			" WHERE items.product_id = products.id " +
		    " GROUP BY products.id " +
		    " ORDER BY total DESC "
		);
		
		while (r.next()) {
			System.out.println(r.getInt(1) +  " " +r.getString(2)+  " " +r.getDouble(3));
			
		}
	}

	/*
	 * Lista nome do cliente e quantidade dos pedidos.
	 */
	@Test
	public void testMelhoresClientes() throws Exception{
		ResultSet r = connection.createStatement().executeQuery(
			"SELECT customers.id, customers.first_name ||' '|| customers.last_name AS name, " +
			" COUNT(invoices.customer_id) " + 
		    " FROM customers " +
			" INNER JOIN invoices ON customers.id = invoices.customer_id " +
		    " GROUP BY customers.id"
		);
		while (r.next()) {
			System.out.println(r.getInt(1) + " " +r.getString(2) + " " + r.getInt(3));				
		}
	}
	
	/*
	 * Lista a média de pedidos por cidade.
	 */
	@Test
	public void testPedidoPorCidade() throws Exception{
		ResultSet r = connection.createStatement().executeQuery(
			" SELECT city, AVG(total) AS media FROM customers " + 
			" INNER JOIN invoices ON invoices.customer_id = customers.id " +
			" GROUP BY city"
		);
		while (r.next()) {
			System.out.println(r.getString(1) + " " + r.getDouble(2));				
		}
	}
}
