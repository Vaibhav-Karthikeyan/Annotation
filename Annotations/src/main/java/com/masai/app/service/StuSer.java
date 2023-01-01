package com.masai.app.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class StuSer {
	@Value("${appName}")
	private String appName;
	@Value("${db.user}")
	private String user;
	@Value("${db.pass}")
	private String pass;
	@Value("${db.driver}")
	private String driver;
	@Value("${db.url}")
	private String url;

	public void addStudent() {
		try {
			String query = "insert into Student values(?,?,?)";
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, pass);
			PreparedStatement st = con.prepareStatement(query);
			st.setInt(0, 1);
			st.setString(1, "100");
			st.setInt(2, 100);
			st.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
