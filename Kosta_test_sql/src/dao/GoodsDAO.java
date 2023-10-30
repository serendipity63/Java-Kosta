package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.kosta.product.Goods;

public class GoodsDAO {

	public int insertGoods(Goods goods) {
		Connection conn = DBConnect.getConnection();
		PreparedStatement pstmt = null;
		String sql = "insert into goods(code,name,price,stock,category) values(?,?,?,?,?)";
		int cnt = 0;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, goods.getCode());
			pstmt.setString(2, goods.getName());
			pstmt.setInt(3, goods.getPrice());
			pstmt.setInt(4, goods.getStock());
			pstmt.setString(5, goods.getCategory());
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
		DBConnect.close(conn);
		return cnt;
	}

	public int selectProduct(String name) {
		Goods goods = null;
		Connection conn = DBConnect.getConnection();
		PreparedStatement pstmt = null;
		String sql = "insert into goods(category, code, name, price, stock) values (?,?,?,?,?)";
		int cnt = 0;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, goods.getCategory());
			pstmt.setString(2, goods.getCode());
			pstmt.setString(3, goods.getName());
			pstmt.setInt(4, goods.getPrice());
			pstmt.setInt(5, goods.getStock());
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

	public Goods selectProductByCode(String code) {
		Connection conn = getConnection();
		Goods goods = null;
		String sql = "select * from goods where code=?";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, code);
			rs = pstmt.executeQuery();

			if (rs != null && rs.next()) {
				String codes = rs.getString("code");
				String names = rs.getString("name");
				int prices = rs.getInt("price");
				int stocks = rs.getInt("stock");
				String categories = rs.getString("category");
				goods = new Goods();
				goods.setCode(codes);
				goods.setName(names);
				goods.setPrice(prices);
				goods.setStock(stocks);
				goods.setCategory(categories);

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
		return goods;
	}

	public void updateProduct(Goods orderedProduct) {
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		String sql = "update goods set name=?, price=?, stock=? where code=?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, orderedProduct.getName());
			pstmt.setInt(2, orderedProduct.getPrice());
			pstmt.setInt(3, orderedProduct.getStock());
			pstmt.setString(4, orderedProduct.getCode());
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
	}

	public List<Goods> selectAllProducts() {
		Connection conn = getConnection();
		List<Goods> goodsList = new ArrayList<>();
		String sql = "select * from goods";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs != null && rs.next()) {
				String codes = rs.getString("code");
				String names = rs.getString("name");
				int prices = rs.getInt("price");
				int stocks = rs.getInt("stock");
				String categories = rs.getString("category");
				Goods goods = new Goods();
				goods.setCode(codes);
				goods.setName(names);
				goods.setPrice(prices);
				goods.setStock(stocks);
				goods.setCategory(categories);
			}

		} catch (

		Exception e) {
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
		return goodsList;
	}
}