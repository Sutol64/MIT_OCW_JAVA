// This is almost the same as TripleTest 
// but with an object

public class NumberTest {
	public static void main(String[] args) {
		Number n= new Number(5.0);
		System.out.println("n main 1: "+n);
		triple(n);
		System.out.println("n main 2: "+n);
	}

	public static void triple(Number n) {
		System.out.println("n 1: "+n);
		n.setBase(n.getBase()*3);
		System.out.println("n 2: "+n);
	}
}
// What is the output?  