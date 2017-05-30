package com.epam.price;

import com.epam.Product;

import java.math.BigDecimal;

public class DiscountPriceCalculator implements PriceCalculator {

	private static final String DISCOUNT_MULTIPLICATOR = "0.9";

	public BigDecimal price(Product product) {
		return product.getPrice().multiply(new BigDecimal(DISCOUNT_MULTIPLICATOR));
	}

}
