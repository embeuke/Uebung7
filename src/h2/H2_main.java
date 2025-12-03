package h2;
import java.util.Arrays;

public class H2_main {

	public static void main(String[] args) {
		

	}
	
	public static int [] change (int[] a, int[] b, int start, int end) {
		
		if (end > start && Arrays.compare(a, b) != 0) {
			int [] A1 = Arrays.copyOfRange(a, 0, a.length);
			return A1;
		}
		
		if (end > start && Arrays.compare(a, b) == 0) {
			Arrays.sort(a);
			int[] A2 = Arrays.copyOfRange(a, start, end);
			return A2;
		}
		
		if (end <= start) {
			return new int[0];
		}
		
		return new int[0];
		
	}

}
