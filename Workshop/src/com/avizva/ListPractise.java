package com.avizva;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product implements Comparable {
	private String productName;
	private String brand;
	private int price;

	public Product(String productName, String brand, int price) {
		super();
		this.productName = productName;
		this.brand = brand;
		this.price = price;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [productName=" + productName + ", brand=" + brand + ", price=" + price + "]";
	}

	@Override
	public int compareTo(Object o) {
		return getPrice() - ((Product) o).getPrice();
	}

}

public class ListPractise {
	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		list.add(new Product("Mobile", "Nokia", 13000));
		list.add(new Product("Mobile", "OnePlus", 28000));
		list.add(new Product("Mobile", "Oneplus", 24000));
		list.add(new Product("Mobile", "Samsung", 16000));

		System.out.println(list);

		List<Integer> priceList = new ArrayList<>();
		list.forEach((Product p) -> priceList.add(p.getPrice()));
		System.out.println(priceList);

		List<Integer> priceList2 = list.stream().map(Product::getPrice).collect(Collectors.toList());

		List<Integer> filteredList = list.stream().filter(p -> p.getPrice() > 13000).map(Product::getPrice)
				.collect(Collectors.toList());
		System.out.println(priceList2);
		System.out.println(filteredList);

		List<Product> sortedList = list.stream().filter(p -> p.getPrice() < 25000).sorted((p1, p2) -> p1.compareTo(p2))
				.collect(Collectors.toList());

		System.out.println(sortedList);
		System.out.println(list);

	}
}
