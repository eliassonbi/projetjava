package projetJavaL3;

import java.util.ArrayList;
import java.util.Collections;

public class Circuit {
	
	double fitness =0.0;
	double distance= 0;
	ArrayList<City> circuit = new ArrayList<City>();
	
	AdministratorCircuit administratorCircuit;
	
	public Circuit(AdministratorCircuit administratorCircuit) {
		this.administratorCircuit=administratorCircuit;
		
			for(int i=0;i<administratorCircuit.numberCity();i++) {
				circuit.add(null);
			
		}
		
	}
	
	public int lengthCircuit() {
		return circuit.size();		
	}
	
	public City getCity(int index) {
		return circuit.get(index);
	}
	
	public void setCity(int index, City city) {
		circuit.set(index, city);
		this.fitness=0.0;
		this.distance=0;
	}
	

	
	public void createIndividual() {
		for (int i=0;i<administratorCircuit.numberCity();i++) {
			circuit.set(i, administratorCircuit.getCity(i));
		}
		Collections.shuffle(circuit);
	}
	
	public double getDistance() {
		if(this.distance==0){
			double circuitDistance=0;
			for(int i=0;i<circuit.size();i++) {
				City start=circuit.get(i);
				City arrival=null;
				if(i+1<circuit.size()) {
					arrival=circuit.get(i+1);
				}
				else {
					arrival=circuit.get(0);
				}
				circuitDistance+=start.distance(arrival);
			}
			this.distance=circuitDistance;
		}	
		return this.distance;
	}
	public double getFitness() {
		if(this.fitness==0.0) {
			this.fitness=1/(float)getDistance();
		}
		return this.fitness;
	}
	
	public boolean haveCity(City city) {
		return circuit.contains(city);
	}
	
	
	
	
	
	
	
	
	
	


}
