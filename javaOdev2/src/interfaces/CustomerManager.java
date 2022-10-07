package interfaces;

public class CustomerManager {
	CustomerDao customerDao;
	
	public CustomerManager(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}
	
	public void add() {
		System.out.println("added");
	}
}
