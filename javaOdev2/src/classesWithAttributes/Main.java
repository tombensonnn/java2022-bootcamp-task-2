package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product = new Product();
		product.setId(1);
		product.setDescription("Asus Laptop");
		product.setPrice(5000); 
		product.setStockAmount(3);
		product.setName("Laptop");
		//System.out.println(product);
		
		ProductManager productManager = new ProductManager();
		productManager.add(product);
		
		System.out.println(product.getKod());
		

	}

}
