package br.edu.horus.bancodadosII;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

public class ConnectionRule implements TestRule {
	private final String user;
	private final String password;
	private final String url;
	private Connection connection;

	public ConnectionRule(final String user, final String password, final String url) {
		super();
		this.user = user;
		this.password = password;
		this.url = url;
	}

	@Override
	public Statement apply(final Statement base, final Description description) {
		try {
			connection = DriverManager.getConnection(url, user, password);
		} catch (final SQLException e) {
			throw new RuntimeException(e);
		}
		return base;
	}

	public Connection getConnection() {
		return connection;
	}

}
