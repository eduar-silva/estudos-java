package entities;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	private Instant date;
	private OrderStatus status;
	private Client client;
	
	private List<OrderItem> items = new ArrayList<>();
	
	public Order() {
	}

	public Order(Instant date, OrderStatus status, Client client) {
		this.date = date;
		this.status = status;
		this.client = client;
	}

	public Instant getDate() {
		return date;
	}

	public void setDate(Instant date) {
		this.date = date;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	
	public void addItem(OrderItem item) {
		items.add(item);
	}
	
	public void removeItem(OrderItem item) {
		items.remove(item);
	}
	
	public Double total() {
		Double sum = 0.0;
		for (OrderItem ordItm : items) {
			sum += ordItm.subTotal();
		}
		return sum;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(OrderItem itm : items) {
			sb.append("\n"+itm.getProduct().getName() + ", $" + itm.getPrice() + ", Quantity: " + itm.getQuantity() + ", $" + itm.subTotal());
		}
		return sb.toString();
	}
}
