package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import classes.ShoppingBasket;

public class ShoppingBasketTest {

	@Test
	public void totalOfEmptyBasket() {
		ShoppingBasket basket = new ShoppingBasket();
		assertEquals(0.0, basket.getTotal(), 0.0);
	}
}
