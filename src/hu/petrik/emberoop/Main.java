package hu.petrik.emberoop;

public class Main {

    public static void main(String[] args) {
	Ember e1 = new Ember("Lakatos Ferenc", "1983-1-12", "Budapest");
	Ember e2 = new Ember("Kovács Béla", "1977-7-17", "Budapest");
	Ember e3 = new Ember("Erős István", "1981-6-22", "Debrecen");
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);

		System.out.printf("$s - Életkor $d", e1, e1.getEletkor());
		System.out.printf("$s - Életkor $d", e2, e2.getEletkor());

		e1.getSzuletesiEv();
    }
}
