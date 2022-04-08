public class Number {
	private double base;
	public Number(double n) {
		base= n;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double b) {
		base= b;
	}

	public String toString() {
		return (" "+ base);
	}
}	