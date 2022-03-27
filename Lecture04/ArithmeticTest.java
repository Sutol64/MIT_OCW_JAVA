
public class ArithmeticTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int NoOfStudents1 = 136;
		NoOfStudents1 = NoOfStudents1++;
		NoOfStudents1 = NoOfStudents1--;
		int NoOfStudents2 = 20;
		int total = NoOfStudents1 + NoOfStudents2++;
		System.out.println(total);
		int leftOver = total%3;
		//System.out.println(leftOver);

	}

}
