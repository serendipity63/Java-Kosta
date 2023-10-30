import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBConnect {
	// DB Connection
	public static Connection getConnection() {
		Connection conn = null; // 커넥션만 분리
		try {
			Class.forName("org.mariadb.jdbc.Driver"); // driver 설정
			conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/testdb", "root", "1234");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;

	}

	public static void close(Connection conn) { // 분리
		try {
			if (conn != null)
				conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void insertUser(String id, String name) {
		Connection conn = getConnection();
		Statement stmt = null;
		String sql = String.format("insert into user (id,name) values ('%s', '%s')", id, name); // 마지막에 세미콜론 붙이지 않는다
		try {
			stmt = conn.createStatement();
			int cnt = stmt.executeUpdate(sql);
			System.out.println(cnt + "개 데이터 삽입");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null)
					stmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			close(conn);
		}
	}

	public static void updateUserName(String id, String name) {
		Connection conn = getConnection();
		Statement stmt = null;
		try {
			String sql = String.format("update user set name='%s' where id='%s'", name, id);
			stmt = conn.createStatement();
			int cnt = stmt.executeUpdate(sql);
			System.out.println(cnt + "개 수정");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null)
					stmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			close(conn);
		}
	}

	public static void deleteUser(String id) {
		Connection conn = getConnection();
		Statement stmt = null;
		try {
			String sql = String.format("delete from user where id='%s'", id);
			stmt = conn.createStatement();
			int cnt = stmt.executeUpdate(sql);
			System.out.println(cnt + "개 데이터 삭제");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null)
					stmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			close(conn);
		}
	}

	public static void userInfo(String id) {
		Connection conn = getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		try {
			String sql = String.format("select * from user where id='%s'", id);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql); // null이 아니고 실패하지 않았고
			if (rs != null && rs.next()) {
				String rid = rs.getString("id");
				String rname = rs.getString("name");
				System.out.println(rid + "," + rname);

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		close(conn);
	}

	public static void allUserInfo() {
		Connection conn = getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		try {
			String sql = "select * from user";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			if (rs != null) {
				while (rs.next()) {
					String rid = rs.getString(1);
					String rname = rs.getNString(2);
					System.out.println(rid + "," + rname);
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			close(conn);
		}
	}

	public static void main(String[] args) {
//		insertUser("song", "송길동");
//		updateUserName("song", "송송이");
//		deleteUser("song");
//		userInfo("kong");
		allUserInfo();
	}
}

//prepared statement
