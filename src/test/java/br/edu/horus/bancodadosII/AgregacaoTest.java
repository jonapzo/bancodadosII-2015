package br.edu.horus.bancodadosII;

import static org.junit.Assert.assertEquals;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;

public class AgregacaoTest extends BaseTest {

	@Test
	public void testCount() throws SQLException {
		ResultSet resultSet = connection.createStatement()
				.executeQuery("SELECT COUNT(*) FROM items");
		resultSet.next();
		assertEquals(650, resultSet.getInt(1));
	}
	
	
	@Test
	public void testCountWhere() throws SQLException{
		ResultSet r = connection.createStatement().executeQuery(
			"SELECT COUNT(*) FROM items WHERE product_id = 0"
		);
		r.next();
		
		System.err.println(r.getInt(1));
	}
	
	@Test
	public void testCountInnerJoin() throws Exception{
		ResultSet result = connection.createStatement().executeQuery(
			"SELECT COUNT(*) FROM items "
			+ " INNER JOIN products ON products.id = items.product_id"
			+ " WHERE name='Iron Iron'"
		);		
		result.next();		
		System.out.println(result.getInt(1));
	}
	

	
	@Test
	public void testCountInnerJoinLike() throws Exception{
		ResultSet result = connection.createStatement().executeQuery(
			"SELECT products.id, name, COUNT(products.id) "
			+ " FROM items "
			+ " INNER JOIN products ON products.id = items.product_id"
			+ " WHERE name LIKE '%Ir%' "
			+ " GROUP BY products.id"
			+ " ORDER BY name "
		);
		
		while(result.next()){
			System.out.println(result.getInt(1) + 
					" " + result.getString(2) +
					" " + result.getInt(3)
					);
		}
	}
	
	
	//Fazer a soma da quantidade de todas 
	// as vendas do produto chamado 'Ice Tea Iron'
	@Test
	public void testSomaIceTeaIron() throws Exception{
		ResultSet r = connection.createStatement().executeQuery(
			"SELECT "
			+ "	products.id, products.name, SUM(items.quantity) AS total "
			+ " FROM items "
			+ " INNER JOIN products ON items.product_id = products.id"
			+ " WHERE products.name = 'Ice Tea Iron'"
			+ " GROUP BY products.id"
		);
		
		while (r.next()) {
			System.out.println(
				r.getInt("id") + " " +
				r.getString("name") + " " +
				r.getDouble("total")
			);
		}
	}
	
	
	//Fazer a media de preço de venda dos produtos iniciados com 'Chair'
	@Test
	public void testMedia() throws Exception{
		ResultSet r = connection.createStatement().executeQuery(
			"SELECT products.id, products.name, "
			+ " AVG(items.cost) AS nao_quero_sabe"
			+ " FROM items"
			+ " INNER JOIN products ON products.id = items.product_id "
			+ " WHERE products.name LIKE 'chair%'"
			+ " GROUP BY products.id"
		);
		
		while (r.next()) {
			System.err.println(
				r.getInt("id") + " " +
				r.getString("name") + " " +
				r.getDouble("nao_quero_sabe")
			);
		}
	}
	
	
	
	
	
}
