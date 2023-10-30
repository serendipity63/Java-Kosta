package dao;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

import acc.Account;
import acc.SpecialAccount;

public class AccountDAO {
	public static Connection getConnection() {
		Connection conn = null;
		try {
			Properties db = new Properties();
			db.load(new FileInputStream("db.properties"));
			Class.forName(db.getProperty("driver"));
			conn=DriverManager.getConnection(db.getProperty("url"),
					db.getProperty("user"), db.getProperty("password"));
		} catch(Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	public static Account selectAccount(Connection conn,String id) {
		Account acc = null;
		String sql = "select * from account where id=?";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if(rs!=null && rs.next()) {
				String rid=rs.getString("id");
				String rname=rs.getString("name");
				Integer rbalance=rs.getInt("balance");
				String rgrade=rs.getString("grade");
				if(rgrade==null) { 
					acc = new Account(rid,rname,rbalance);
				} else {
					acc = new SpecialAccount(rid,rname,rbalance,rgrade);					
				}
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		return acc;
	}
	
	public static void close(Connection conn) {
		try {
			if(conn!=null) conn.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}	
}
