package com.epam.price;

import com.epam.Product;

import java.math.BigDecimal;

public class ExclusivePriceCalculator implements PriceCalculator {

	private static final String EXCLUSIVE_MULTIPLICATOR = "2";

	public BigDecimal price(Product product) {
		return product.getPrice().multiply(new BigDecimal(EXCLUSIVE_MULTIPLICATOR));
	}

}
