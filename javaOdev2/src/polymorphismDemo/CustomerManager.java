package polymorphismDemo;

public class CustomerManager {
	
	private BaseLogger logger;
	
	public CustomerManager(BaseLogger baseLogger) {
		this.logger = baseLogger;
	}

	public void add() {
		System.out.println("Added");
		this.logger.log("Logged");
	}
}
