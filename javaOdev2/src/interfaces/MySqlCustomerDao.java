package interfaces;

public class MySqlCustomerDao implements CustomerDao {

	@Override
	public void add() {
		System.out.println("MySQL Eklendi");
		
	}

}
