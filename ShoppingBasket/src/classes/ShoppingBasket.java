package classes;

import java.util.List;

public class ShoppingBasket {

	private List<Item> items;

	public ShoppingBasket(List<Item> items) {
		// TODO Auto-generated constructor stub
		this.items = items;
	}

	public double getTotal() {
		// TODO Auto-generated method stub
		if(items.isEmpty())
			return 0;
		
		return items.get(0).getUnitPrice();
	}

}
