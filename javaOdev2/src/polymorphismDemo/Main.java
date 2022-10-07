package polymorphismDemo;

public class Main {

	public static void main(String[] args) {
		//EmailLogger logger = new EmailLogger();
		//logger.log("Email log");

		//BaseLogger[] loggers = new BaseLogger[] {new FileLogger(), new EmailLogger(), new DatabaseLogger()};
		
		//for (BaseLogger logger : loggers) {
			//logger.log("logged");
		//}
		
		CustomerManager customerManager = new CustomerManager(new ConsoleLogger());
		
		customerManager.add();

	}

}
