
public class Test1 {
	public static void main(String[] arg) {
		int t = test();
		System.out.println(t);
	}
	public static int test() {
		int i;
		for(i = 0; i < 10; i++) {
			if(Math.sqrt(i) > 2.5) {
				break;
			}
		}
		return i;
	}

}
