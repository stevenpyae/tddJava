package classes;

public class Item {

	private double unitPrice;
	private int quantity;

	public Item(double unitPrice, int quantity) {
		// TODO Auto-generated constructor stub
		this.unitPrice = unitPrice;
		this.quantity = quantity;
	}

	double getSubTotal() {
		return this.unitPrice* (double) this.quantity;
	}

}
