
public class TankTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tank t0 = new Tank(0.5, 4.0, 0.4);
		double mass = t0.getMass();
		double volume = t0.getVolume();
		double wL = t0.WeldLength();
		double cost = t0.Cost(1, 1);
		System.out.println(mass);
		System.out.println(volume);
		System.out.println(wL);
		System.out.println(cost);

	}

}
