public class Tank {
	private double radius;
	private double length;
	private double thickness;

	public Tank(double r, double len, double t) {
		radius = r;
		length = len;
		thickness = t;
	}

	public double getMassCylinderWalls() {
		double mass= length*Math.PI*((radius + thickness)*(radius + thickness)- radius*radius);
		return mass;
	}
	
	public double getMassEnds() {
		double mass= 2.0*Math.PI*thickness*(radius + thickness)*(radius + thickness);
		return mass;
	}
	
	public double getMass() {
		return getMassCylinderWalls() + getMassEnds();
	}
	public double getVolume() {
		return (Math.PI)*(radius*radius)*length;
	}
	public double WeldLength() {
		return 2*((2*(Math.PI)*(radius+thickness))+ (2*Math.PI*radius));
	}
	public double Cost(double c2, double c1) {
		return c1*getMass() + c2*WeldLength();
	}
}