package javaOdev2;

public class Methods {

	public static void main(String[] args) {
		sayiBulmaca();
		mesajVer("Selam");
	}
	
	public static void sayiBulmaca() {
		int[] sayilar = {1,2,5,7,9,0};
		int aranacak = 5;
		
		boolean varMi = false;
		
		for (int sayi : sayilar) {
			if(sayi==aranacak) {
				varMi = true;
			}
		}
		
		if(varMi) {
			System.out.println("Aranan sayı var. Sayı: " + aranacak);
		} else {
			System.out.println("Aranan sayı yok");
		}
	}
	
	public static void mesajVer(String mesaj) {
		System.out.println("Mesaj: " + mesaj);
	}

}
