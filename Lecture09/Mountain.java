public class Mountain {
	String name;			// Package access
	private double elevation;		
	public Mountain(String n, double e) {
		name= n;
		elevation= e;
	}

	public boolean isTallerThan(Mountain m) {
		if (elevation > m.elevation)
			return true;
		else
			return false;
	}	// Or return (elevation > m.elevation)
}