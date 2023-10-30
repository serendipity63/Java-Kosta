package dao;
// DATA ACCESS OBJECT 

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.kosta.order.Order;

public class OrderDAO {
	public static Connection getConnection() {
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

	public void close(Connection conn) {
		try {
			if (conn != null)
				conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public int insertOrder(String customer, String productCode, int amount) {
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		String sql = "insert into orders(customer, productCode, amount, isCanceled) values (?,?,?,?)";
		int cnt = 0;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, customer);
			pstmt.setString(2, productCode);
			pstmt.setInt(3, amount);
			pstmt.setBoolean(4, false); // 주문 생성 시 취소 여부는 기본적으로 false로 초기화
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

	public Order selectOrderByNo(int orderNo) {
		Connection conn = getConnection();
		Order order = null;
		String sql = "select * from orders where no=?";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, orderNo);
			rs = pstmt.executeQuery();

			if (rs != null && rs.next()) {
				int no = rs.getInt("no");
				String customer = rs.getString("customer");
				String productCode = rs.getString("productCode");
				int amount = rs.getInt("amount");
				boolean isCanceled = rs.getBoolean("isCanceled");
				order = new Order();
				order.setNo(no);
				order.setCustomer(customer);
				order.setProductCode(productCode);
				order.setAmount(amount);
				order.setCanceled(isCanceled);
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
		return order;
	}

	public Order cancelOrder(int orderNo) {
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		String sql = "update orders set isCanceled = true where no = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, orderNo);
			pstmt.executeUpdate();
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

		// Return the canceled order
		return selectOrderByNo(orderNo);
	}

	public List<Order> selectAllOrders() {
		Connection conn = getConnection();
		List<Order> orderList = new ArrayList<>();
		String sql = "select * from orders";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs != null && rs.next()) {
				int no = rs.getInt("no");
				String customer = rs.getString("customer");
				String productCode = rs.getString("productCode");
				int amount = rs.getInt("amount");
				boolean isCanceled = rs.getBoolean("isCanceled");
				Order order = new Order();
				order.setNo(no);
				order.setCustomer(customer);
				order.setProductCode(productCode);
				order.setAmount(amount);
				order.setCanceled(isCanceled);
				orderList.add(order);
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
		return orderList;
	}

	public List<Order> selectOrdersByCustomerAndIsCanceled(String customer, String isCanceled) {
		Connection conn = getConnection();
		List<Order> orderList = new ArrayList<>();
		String sql = "select * from orders where customer = ? and isCanceled = ?";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, customer);
			pstmt.setBoolean(2, Boolean.parseBoolean(isCanceled));
			rs = pstmt.executeQuery();

			while (rs != null && rs.next()) {
				int no = rs.getInt("no");
				String productCode = rs.getString("productCode");
				int amount = rs.getInt("amount");
				boolean canceled = rs.getBoolean("isCanceled");
				Order order = new Order();
				order.setNo(no);
				order.setCustomer(customer);
				order.setProductCode(productCode);
				order.setAmount(amount);
				order.setCanceled(canceled);
				orderList.add(order);
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
		return orderList;
	}

}