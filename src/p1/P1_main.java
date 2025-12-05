package p1;

public class P1_main {

	public static void main(String[] args) {
		
		Bruch a = new Bruch(3, 2);
	    Bruch b = new Bruch(3, 4);
		multFrac(5, 2, 3, 4);
		multFrac(a, b);

	}
	
	public static void multFrac (int z1, int n1, int z2, int n2) {
		
		int zaehler = z1 * z2;
		int nenner = n1 * n2;
		System.out.println(zaehler+ ":" + nenner);
	}
	
	public static void multFrac (Bruch a, Bruch b) {
		
		int ergebnisZ = a.z * b.z;
		int ergebnisN = a.n * b.n;
		System.out.println(ergebnisZ + ":" + ergebnisN);
		
	}


}
