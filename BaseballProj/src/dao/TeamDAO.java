
package dao;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import dto.Team;

// insert
public class TeamDAO {
	public Connection getConnection() {
		Connection conn = null;
		try {
			Properties db = new Properties();
			db.load(new FileInputStream("db.properties"));
			Class.forName(db.getProperty("driver"));
			conn = DriverManager.getConnection(db.getProperty("url"), db.getProperty("user"),
					db.getProperty("password"));

		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

	public int insertTeam(Team team) {
		Connection conn = getConnection();
		int cnt = 0;
		PreparedStatement pstmt = null;
		String sql = "insert into team(name,local) values(?,?,?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, team.getName());
			pstmt.setString(2, team.getLocal());
			cnt = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		close(conn);
		return cnt;
	}

	public Team selectTeam(String teamName) {
		Connection conn = getConnection();
		Team team = null;
		String sql = "select * from team where name=?";
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, teamName);
			rs = pstmt.executeQuery();
			if (rs != null && rs.next()) {
				team = new Team(rs.getInt("num"), rs.getString("name"), rs.getString("local"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		close(conn);
		return team;

	}

	public List<Team> selectTeamList() {
		Connection conn = getConnection();
		List<Team> teamList = new ArrayList<>();
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "select * from team";
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			if (rs != null) {
				while (rs.next()) {
					teamList.add(new Team(rs.getInt("num"), rs.getString("name"), rs.getString("local")));

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
		}
		close(conn);
		return teamList;
	}

	public void close(Connection conn) {
		try {
			if (conn != null)
				conn.close();
		} catch (Exception e) {
			e.printStackTrace();

		}
	}
}
