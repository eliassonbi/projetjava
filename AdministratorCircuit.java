package projetJavaL3;

import java.util.ArrayList;

public class AdministratorCircuit {

	ArrayList<City> listCity=new ArrayList<City>();
	
	public City getCity(int index) {
		return this.listCity.get(index);
	}
	public void addCity(City city) {
		this.listCity.add(city);
	}
	public int numberCity() {
		return listCity.size();
	}
	
}
