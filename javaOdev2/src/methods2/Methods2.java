package methods2;

public class Methods2 {

	public static void main(String[] args) {
		ekle();
		
		sil();
		
		guncelle();
		
		int toplam = topla(1,2);
		
		System.out.println(toplam);
		
		String sehir = sehirVer();
		
		System.out.println(sehir);
		
		int ikinciToplam = multipleSum(1,2,3,4);
		
		System.out.println(ikinciToplam);
		
	}
	
	public static void ekle() {
		System.out.println("Eklendi");
	}
	
	public static void sil() {
		System.out.println("Silindi");
	}
	
	public static void guncelle() {
		System.out.println("Güncellendi");
	}
	
	public static int topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}
	
	public static String sehirVer() {
		return "Ankara";
	}
	
	public static int multipleSum(int... args) {
		int total = 0;
		
		for (int arg : args) {
			total += arg;
		}
		
		return total;
	}

}
