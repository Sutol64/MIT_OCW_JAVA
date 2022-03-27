
public class InverseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double xStart = 0.0;
		double xEnd = 2.0;
		double deltaX = 0.1;
		final double TOLERANCE = 1E-14;
		for(double x = 0.0; xEnd > x; x = x + TOLERANCE) {
			System.out.println(x);
			System.out.println(1/(xEnd - x));
		}
	}

}
