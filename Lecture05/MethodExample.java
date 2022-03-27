public class MethodExample {
	public static void main(String[] args) {
		double boxWeight= 50;
		double boxCube= 10;
		String boxID = "Box A";
		double density= getDensity(boxWeight, boxCube);
		System.out.println("Density (output from main): "+ density);
		printBox(boxWeight, boxCube);
	}

	public static double getDensity(double bw, double bc) {
		double result= bw/bc;	// 'result' could be 'density'-no name conflict
		return result;
	}

	public static void printBox(double w, double c) {
		System.out.println("Box weight: "+w+" cube: "+c);
		System.out.println(" Density (output from printBox): "+getDensity(w,c));
		//System.out.println("ID :" + boxID);
	}
}