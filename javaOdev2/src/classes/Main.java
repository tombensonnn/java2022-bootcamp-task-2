package classes;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager;
		CustomerManager customerManager2 = new CustomerManager();
		
		customerManager = customerManager2;
		
		
		customerManager.Add();
		customerManager.Remove();
		customerManager.Update();
		
		String s1 = "Can";
		String s2 = "Uyumaz";
		
		s2 = s1; 
		s1 = "Arif";
		
		System.out.println(s1);
		
		int[] sayilar1 = {1,2,3};
		int[] sayilar2 = {10,20,30};
		sayilar2 = sayilar1;
		
		sayilar1[0] = 4;
		
		for (int sayilar : sayilar2) {
			System.out.println(sayilar);
		}
		
	}

}
