public class Weather {
	private double avgTemperature;
	private double precipAmt;
	
	public Weather(double a, double p) {
		avgTemperature= a;
		precipAmt= p;
	}
	
	public void setAvgTemp(double t) {
		avgTemperature= t;
	}
	
	public void setPrecipAmt(double pr) {
		precipAmt= pr;
	}
	
	public String toString() {
		return ("Temperature: " + avgTemperature + 
				" ; Precipitation: " + precipAmt);
	}
}