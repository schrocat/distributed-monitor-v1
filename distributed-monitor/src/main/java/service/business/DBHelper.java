package service.business;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBHelper {
	
	public static final String url="jdbc:mysql://10.2.17.209:3306/testdb_1";
	public static final String name = "com.mysql.jdbc.Driver";
	public static final String user = "root";
	public static final String password = "root";
	
	public Connection conn = null;
	public PreparedStatement pst = null;
	public DBHelper(String sql) {
		// TODO Auto-generated constructor stub
		try{
			Class.forName(name);
			conn = DriverManager.getConnection(url,user,password);
			pst = conn.prepareStatement(sql);
		}catch(Exception e){
			e.printStackTrace();
		}
	
	}


	public void close(){
		try{
			this.conn.close();
			this.pst.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}

}
