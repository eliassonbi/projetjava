package projetJavaL3;

public class City {
	String name;
	double longitude;
	double latitude;
	
	public City( double longitude, double latitude, String name) {
		this.name=name;
		this.longitude=longitude;
		this.latitude=latitude;
	}
	
	public double distance(City city) {
		double X=(city.longitude-this.longitude)*40000*Math.cos((this.latitude+city.latitude)*Math.PI/360)/360;
		double Y=(this.latitude-city.latitude)*40000/360;
		return Math.sqrt((X*X)+(Y*Y));
	}
	

}
