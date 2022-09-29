package methodOverloading;

public class Main {

	public static void main(String[] args) {
		DortIslem dortIslem = new DortIslem();
		
		int toplam1 = dortIslem.topla(2, 3);
		int toplam2 = dortIslem.topla(1, 2, 3);

		
		// hem 2 parametreli hem 3 parametreli olan topla fonksiyonu çalıştırılabilir. 
		//(ikisi de aynı isme sahip) 
		System.out.println(toplam1);
		System.out.println(toplam2);
	}

}
