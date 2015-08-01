package br.edu.horus.bancodadosII;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

public class DataBaseRule implements TestRule {
	private final String user;
	private final String password;
	private final String url;

	public DataBaseRule(final String user, final String password, final String url) {
		super();
		this.user = user;
		this.password = password;
		this.url = url;
	}

	@Override
	public Statement apply(final Statement base, final Description description) {
		try {
			final Connection connection = DriverManager.getConnection(url, user, password);
			final java.sql.Statement statement = connection.createStatement();
			final String sql = read();
			statement.executeQuery(sql);
		} catch (final SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		return base;
	}

	
	private String read(){
		final Path path = new File("src/test/resources/sakila-schema.sql").toPath();
		final byte[] bytes;
		try {
			bytes = Files.readAllBytes(path);
		} catch (final IOException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		final String sql = new String(bytes);
		return sql;
	}
}
