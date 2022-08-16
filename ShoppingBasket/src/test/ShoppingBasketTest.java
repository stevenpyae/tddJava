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
		ShoppingBasket basket = new ShoppingBasket(new ArrayList<>());
		assertEquals(0.0, basket.getTotal(), 0.0);
	}
	@Test
	public void totalOfSingleItem() {
		ShoppingBasket basket = new ShoppingBasket(Arrays.asList(new Item(100.0, 1)));
		assertEquals(100.0, basket.getTotal(), 0.0);
	}
}
