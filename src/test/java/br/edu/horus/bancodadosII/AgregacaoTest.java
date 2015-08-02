package br.edu.horus.bancodadosII;

import static org.junit.Assert.assertEquals;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;

public class AgregacaoTest extends BaseTest {

	@Test
	public void testCount() throws SQLException {
		ResultSet resultSet = connection.createStatement().executeQuery("SELECT COUNT(*) FROM customers");
		resultSet.next();
		assertEquals(50, resultSet.getInt(1));
	}
}
