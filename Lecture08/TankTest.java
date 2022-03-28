public class  TankTest {
	public static void main(String[] args) {
		Tank t0= new Tank(0.5, 4.0, 0.04);
		Tank t1= new Tank(1.0, 1.0, 0.04);
		System.out.println(t0.getVolume()+" "+t1.getVolume());
		
		Tank t2;
		t2= t1;
		t2.setRadius(1.1);  // Easy to do accidentally
		System.out.println(t0.getVolume()+" "+t1.getVolume());
		
		Pipe2 p= new Pipe2(0.1, 10.0, t0, t1);
		double volume= p.getSystemVolume();
		System.out.println("System volume: " + volume);
	}
}