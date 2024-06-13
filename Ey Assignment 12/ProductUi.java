package com.ey.jdbc.task;

public class ProductUi {
	public static void main(String[] args) throws Exception{
		ProductService ps=new ProductService();
		Product p=new Product(1,"box");
		Product p1=new Product(2,"car");
		//ps.addProduct(p);
		ps.deleteProduct(1);
		


}
}
