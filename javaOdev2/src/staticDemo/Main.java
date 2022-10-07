package staticDemo;

public class Main {

	public static void main(String[] args) {
		Product product = new Product();
		product.id = 1;
		product.name = "Laptop";
		product.price = 4500;
		ProductManager manager = new ProductManager();
		manager.add(product);
		
		DatabaseHelper.Crud.delete();
		DatabaseHelper.Connection.createConnection();

	}

}
