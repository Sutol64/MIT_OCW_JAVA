public class Counter {
	public static void main(String[] args) {
		int i = 0;
		double x = 0.0;
		while (x < 10.0) {
			x += 0.2;
			i++;
			if (i % 10 == 0 || i >= 48)
				System.out.println(" i : " + i +" x : " + x);
		}
	}
}