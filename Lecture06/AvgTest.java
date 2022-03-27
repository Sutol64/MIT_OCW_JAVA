
public class AvgTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double r1 = 10, r2 = 17, r3 = 55;
		double r4 = 59, r5 = -3, r6 = 85;
		System.out.println(average3(r1, r2, r3));
		System.out.println(maximum3(r1, r2, r3));
		System.out.println(average3(r4, r5, r6));
		System.out.println(maximum3(r4, r5, r6));

	}
	public static double average3(double fst, double scd, double thrd) {
		return (fst+scd+thrd)/3;
	}

	public static double maximum3(double fst, double scd, double thrd) {
		if(fst > scd && fst > thrd) {
			return fst;
		}
		else if(scd > fst && scd > thrd) {
			return scd;
		}
		else {
			return thrd;
		}
	}
}
