package projetJavaL3;

import java.util.ArrayList;

public class Population {
	
	ArrayList<Circuit> circuit = new ArrayList<Circuit>();
	AdministratorCircuit administratorCircuit;

	
	public Population(AdministratorCircuit administratorCircuit,int sizeOfPopulation) {
		this.administratorCircuit= administratorCircuit;
		
		for (int i=0;i<sizeOfPopulation; i++) {
			circuit.add(null);
		}
		for (int i=0;i<sizeOfPopulation; i++) {
			Circuit newCircuit = new Circuit(administratorCircuit);
			newCircuit.createIndividual();
			saveCircuit(i, newCircuit);
		}
	}
	
	public void saveCircuit(int index, Circuit circuit) {
		this.circuit.set(index, circuit);
	}
	
	public Circuit getCircuit(int index) {
		return circuit.get(index);
	}
	public Circuit getFittest() {
		Circuit fittest=circuit.get(0);
		for(int i=0;i<circuit.size();i++) {
			if(fittest.getFitness()<=getCircuit(i).getFitness()) {
				fittest=getCircuit(i);
			}
		}
		return fittest;		
	}
	
	public int sizeOfpopulation() {
		return circuit.size();
	}
	
	
	
	
	
	
	
	

}
