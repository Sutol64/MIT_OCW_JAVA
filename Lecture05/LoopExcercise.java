
public class LoopExcercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		double s;
		while(i < 10) {
			int j = i^2 - 5;
			System.out.println(i);
			i++;
			if(j < 0) {
				System.out.println(j);
				continue;
			}
			s = Math.sqrt(j);
			if(s > 4) {
				System.out.println(s);
				break;
			}
			
		}
		System.out.println("Done");

	}

}
