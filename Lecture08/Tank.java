public class Tank {
	private double radius;
	private double length;
	private double thickness;

	public Tank(double r, double len, double t) {
		radius = r;
		length = len;
		thickness = t;
	}
	public void setRadius(double r) {
		radius= r;
	}
	public double getVolume() {
		return Math.PI*radius*radius*length;
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
	public double getWeldLength() {
		double weld= 8.0*Math.PI*(radius + 0.5* thickness);
		return weld;
	}
	public double getCost(double cw, double cm) {
		double cost= cw*getWeldLength() + cm*getMass();
		return cost;
	}	
	//public double getVolume() {
	//	return ;
	//}
}