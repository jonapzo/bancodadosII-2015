package br.edu.horus.bancodadosII;

import java.sql.Connection;

import org.junit.Before;
import org.junit.ClassRule;
import org.junit.Rule;

public class BaseTest {
	private static final String user = "sa";
	private static final String password = "";
	private static final String url = "jdbc:hsqldb:file:target/sample";

	@ClassRule
	public static DataBaseRule databaseRule = new DataBaseRule(user, password, url);

	@Rule
	public ConnectionRule connectionRule = new ConnectionRule(user, password, url);

	protected Connection connection;

	@Before
	public void init() {
		connection = connectionRule.getConnection();
	}
}
