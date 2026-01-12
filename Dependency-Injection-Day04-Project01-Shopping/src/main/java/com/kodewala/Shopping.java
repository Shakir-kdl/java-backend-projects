package com.kodewala;

public class Shopping {
	Product product;
	Buyer buyer;
	PaymentInfo paymentInfo;

	public Shopping() {
		// TODO Auto-generated constructor stub
	}

//Constructor - for mandatory info And Immutable
	public Shopping(Product product, Buyer buyer, PaymentInfo paymentInfo) {


		this.product = product;
		this.buyer = buyer;
		this.paymentInfo = paymentInfo;
	}

	public void details() {
		System.out.println("Product name: " + product.productName);
		System.out.println("Product ID: " + product.productId);
		System.out.println("Product Price: " + product.productPrice);
		System.out.println("Buyer name: " + buyer.name);
		System.out.println("Buyer email: " + buyer.email);
		System.out.println("Buyer Address: " + buyer.address);
		System.out.println("Payment Mode: " + paymentInfo.creditCard);
	}

	public static void main(String args[]) {
		Product product = new Product();
		product.setProductName("Laptop");
		product.setProductId("101");
		product.setProductPrice(250000);
		Buyer buyer = new Buyer("Shaikh", "Sh@123.com", "E_City");
		PaymentInfo info = new PaymentInfo("SBI CREDIT Card");
		Shopping shopping = new Shopping(product, buyer, info);
		shopping.details();
		Shopping shopping2 = new Shopping();

	}

}
