package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

import classes.Item;
import classes.ShoppingBasket;

public class ShoppingBasketTest {

	@Test
	public void totalOfEmptyBasket() {
		ShoppingBasket basket = buildBasketWithItems();
		assertEquals(0.0, basket.getTotal(), 0.0);
	}
	@Test
	public void totalOfSingleItem() {
		ShoppingBasket basket = buildBasketWithItems(new Item(100.0, 1));
		assertEquals(100.0, basket.getTotal(), 0.0);
	}
	@Test
	public void totalOfTwoItems() {
		ShoppingBasket basket = buildBasketWithItems(new Item(100.0, 1), new Item(200.0,1));
		assertEquals(300.0, basket.getTotal(), 0.0);
	}

	@Test
	public void totalOfItemwithQuantityTwo() {
		ShoppingBasket basket = buildBasketWithItems(new Item(100.0, 2));
		assertEquals(200.0, basket.getTotal(), 0.0);
	}
	
	private ShoppingBasket buildBasketWithItems(Item...items) {
		return new ShoppingBasket(Arrays.asList(items));
	}
}
