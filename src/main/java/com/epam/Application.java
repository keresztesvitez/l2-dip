package com.epam;

import com.epam.data.Stock;
import com.epam.price.DiscountPriceCalculator;
import com.epam.price.ExclusivePriceCalculator;
import com.epam.price.PriceCalculator;
import com.epam.store.Store;

public class Application {

	public void startDefault() {
		System.out.println("Default store: ");
		Stock stock = new Stock();
		PriceCalculator discount = new DiscountPriceCalculator();
		Store store = new Store(stock, discount);
		store.printPrices();
		System.out.println("Stock: " + store.stock());
	}

	public void startExclusive() {
		System.out.println("Exclusive store: ");
		Stock stock = new Stock();
		PriceCalculator exclusive = new ExclusivePriceCalculator();
		Store store = new Store(stock, exclusive);
		store.printPrices();
		System.out.println("Stock: " + store.stock());
	}

	public static void main(String[] args) {
		new Application().startDefault();
		System.out.println();
		new Application().startExclusive();
	}
}
