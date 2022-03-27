
public class MethodExcercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Lotus";
		int age = 21;
		double height = 160;
		boolean old = isOldEnough(name,age);
		printInfo(name, age, height);
	}
	
	public static boolean isOldEnough(String nm, int ag) {
		if(ag > 18) {
			System.out.println(nm + " is Old Enough");
			return true;
		}
		else {
			System.out.println(nm + " is Not Old Enough");
			return false;
		}
	}
	public static void printInfo(String nm, int ag, double ht) {
		System.out.println("Name is " + nm);
		System.out.println("Age is " + ag);
		System.out.println("Height is " + ht);
	}

}
