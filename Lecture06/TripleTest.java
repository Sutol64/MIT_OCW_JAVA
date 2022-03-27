public class TripleTest {
	public static void main(String[] args) {
		double z=5.0;
		System.out.println("z main 1: "+z);
		triple(z);
		System.out.println("z main 2: "+z);
	}

	public static void triple(double z) {
		System.out.println("z 1: "+z);
		z *= 3;
		System.out.println("z 2: "+z);
	}
}