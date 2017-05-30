package com.epam.store;

import com.epam.Product;
import com.epam.data.Stock;
import com.epam.price.PriceCalculator;

import java.math.BigDecimal;

public class Store {

	private Stock stock;
	private PriceCalculator priceCalculator;

	public Store() {
	}

	public Store (Stock stock, PriceCalculator priceCalculator) {
		this.stock = stock;
		this.priceCalculator = priceCalculator;
	}

	public void printPrices() {
		for (Product product : stock.list()) {
			BigDecimal price = priceCalculator.price(product);
			System.out.println(product.getName() + ": " + price);
		}
	}

	public BigDecimal stock() {
		BigDecimal sum = BigDecimal.ZERO;
		for (Product product : stock.list()) {
			BigDecimal price = priceCalculator.price(product);
			sum = sum.add(price);
		}
		return sum;
	}

}
