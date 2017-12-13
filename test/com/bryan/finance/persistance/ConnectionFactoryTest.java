package com.bryan.finance.persistance;

import java.sql.Connection;
import java.sql.SQLException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class ConnectionFactoryTest {

	private Connection con;

	@Test
	public void connectedToDatabase() {
		con = ConnectionFactory.connect();
		Assert.assertNotNull(con);
	}

	@AfterTest
	public void cleanup() {
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
