package com.kosta.shop;
//service class main을 봐서 하셈

import java.sql.Connection;
import java.util.List;

import com.kosta.order.Order;
import com.kosta.product.Goods;

import dao.GoodsDAO;
import dao.OrderDAO;

public class Shop {
	private GoodsDAO goodsDAO;
	private OrderDAO orderDAO;

	public void addProduct(Goods goods) {
		Connection conn = GoodsDAO.getConnection();
		goodsDAO.insertGoods(goods);
	}

	public int order(Order order) { // order
		Connection conn = OrderDAO.getConnection();
		// 주문 정보를 데이터베이스에 추가
		OrderDAO orderDAO = new OrderDAO();
		int orderNo = orderDAO.insertOrder(order);

		// 주문한 상품의 재고량을 줄임
		GoodsDAO goodsDAO = new GoodsDAO();
		Goods orderedProduct = goodsDAO.selectProductByCode(order.getProductCode());
		if (orderedProduct != null) {
			int currentStock = orderedProduct.getStock();
			int orderedAmount = order.getAmount();
			if (currentStock >= orderedAmount) {
				orderedProduct.setStock(currentStock - orderedAmount);
				goodsDAO.updateProduct(orderedProduct);
			} else {
				// 재고 부족 시 예외 처리
				throw new RuntimeException("재고가 부족합니다.");
			}
		}

		return orderNo;
	}

	public Goods findProductByCode(String code) {
		Connection conn = OrderDAO.getConnection();
		return goodsDAO.selectProductByCode(code);
	}

	public Order findOrderByNo(int orderNo) {
		Connection conn = OrderDAO.getConnection();
		return orderDAO.selectOrderByNo(orderNo);
	}

	public Order cancelOrder(int orderNo) {
		Connection conn = OrderDAO.getConnection();
		Order canceledOrder = orderDAO.cancelOrder(orderNo);

		if (canceledOrder != null) {
			GoodsDAO goodsDAO = new GoodsDAO();
			Goods orderedProduct = goodsDAO.selectProductByCode(canceledOrder.getProductCode());
			if (orderedProduct != null) {
				int currentStock = orderedProduct.getStock();
				int canceledAmount = canceledOrder.getAmount();
				orderedProduct.setStock(currentStock + canceledAmount);
				goodsDAO.updateProduct(orderedProduct);
			}
		}

		return canceledOrder;
	}

	public void printOrderDetailsByCustomerAndIsCanceled(String customer, String isCanceled) {
		Connection conn = OrderDAO.getConnection();
		List<Order> orders = orderDAO.selectOrdersByCustomerAndIsCanceled(customer, isCanceled);

		// 조회된 주문 내역 출력
		for (Order order : orders) {
			System.out.println(order);
		}

	}

	public void printAllProductInfo() {
		Connection conn = OrderDAO.getConnection();
		List<Goods> products = goodsDAO.selectAllProducts();

		// 조회된 상품 정보 출력
		for (Goods product : products) {
			System.out.println(product);
		}
	}

	public void printAllOrderInfo() {
		Connection conn = OrderDAO.getConnection();
		List<Order> orders = orderDAO.selectAllOrders();

		// 조회된 주문 정보 출력
		for (Order order : orders) {
			System.out.println(order);
		}
	}

	// 구현해야 하는 부분: ApplicationMain.java 오류 없이 작동하도록 필요한 모든 메서드를 구현한다.
	// 주문테이블을 오더테이블에 삽입하는거뿐만 아니라 상품의 재고량을 줄여야한다
}
