package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLConnection {
	private String url  = "jdbc:sqlserver://DESKTOP-G9EPVUI:1433;"
	        + "databaseName=QuanLyDatVeXe_New;user=sa;password=123123";
		private static Connection sqlCon = null;


		public Connection getConnect() {
		    try {
		        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		        sqlCon = DriverManager.getConnection(url);
		    } catch (SQLException e) {
		        e.printStackTrace();
		    } catch (ClassNotFoundException e) {
		        e.printStackTrace();
		    }
		    return sqlCon;
		}
}
