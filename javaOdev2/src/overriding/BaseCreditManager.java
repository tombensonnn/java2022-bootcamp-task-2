package overriding;

public abstract class BaseCreditManager {
	public double hesapla(double tutar) {
		return tutar * 1.18;
	}
	
	public final void save() {
		System.out.println("Saved");
	}
}
