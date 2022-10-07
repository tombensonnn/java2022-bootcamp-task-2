package staticDemo;

public class DatabaseHelper {
	public static class Crud {
		public static void delete() {
			System.out.println("deleted");
		}
		
		public static void update() {
			System.out.println("updated");
		}
		
	}
	
	public static class Connection{
		public static void createConnection() {
			System.out.println("connection created");
		}
	}
}
