package br.edu.horus.bancodadosII;

import java.sql.Connection;

import org.junit.Before;
import org.junit.Rule;

public class BaseTest {
	private static final String user = "root";
	private static final String password = "cafe";
//	private static final String url = "jdbc:hsqldb:file:target/sakila";
	private static final String url = "jdbc:mysql://localhost:3306/sakila";

//	@ClassRule
//	public static DataBaseRule databaseRule = new DataBaseRule(user, password, url);

	@Rule
	public ConnectionRule connectionRule = new ConnectionRule(user, password, url);

	protected Connection connection;

	@Before
	public void init() {
		connection = connectionRule.getConnection();
	}
}
