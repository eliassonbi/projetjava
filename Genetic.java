package projetJavaL3;


public class Genetic {

	AdministratorCircuit administartorCircuit;
	double rateOfMutation=0.015;
	int sizeOfTournament;
	
	public Genetic(AdministratorCircuit administartorCircuit,int sizeOfTournament) {
		this.administartorCircuit= administartorCircuit;
		this.sizeOfTournament=sizeOfTournament;
	}
	
	public Population evolution(Population population) {
		Population newpop=new Population(this.administartorCircuit, population.sizeOfpopulation());
		int elitist=0;
		newpop.saveCircuit(elitist, population.getFittest());
		elitist=1;
		
		for(int i=elitist;i<newpop.sizeOfpopulation();i++) {
			Circuit parent1=selectionTournament(population);
			Circuit parent2=selectionTournament(population);
			Circuit child = crossover(parent1,parent2);
			newpop.saveCircuit(i, child);
		}
		
		for(int i=elitist; i<newpop.sizeOfpopulation();i++) {
			mutation(newpop.getCircuit(i));
		}
		return newpop;
	}
	
	public Circuit crossover(Circuit parent1, Circuit parent2) {
		Circuit child=new Circuit(administartorCircuit);
		int startPos= (int)Math.random()*parent1.lengthCircuit();
		int endPos=(int)Math.random()*parent1.lengthCircuit();
		
		for(int i=0;i<child.lengthCircuit();i++) {
			if((startPos<endPos)&&(i>startPos)&&(i<endPos)) {
				child.setCity(i, parent1.getCity(i));
			}
			if(startPos>endPos){
				if(!((i<startPos)&&(i>endPos))) {
					child.setCity(i, parent1.getCity(i));
				}
			}
		}
		
		for(int i=0;i<parent2.lengthCircuit();i++) {
			if(!child.haveCity(parent2.getCity(i))) {
				for(int k=0;k<child.lengthCircuit();k++) {
					if(child.getCity(k)==null) {
						child.setCity(k, parent2.getCity(i));
						break;
					}
				}
			}
		}
		return child;
	}
	
	
	public void mutation(Circuit circuit) {
		for (int i=0;i<circuit.lengthCircuit();i++) {
			if(Math.random()<rateOfMutation) {
				int j=(int)(circuit.lengthCircuit()*Math.random());
				
				City city1=circuit.getCity(i);
				City city2=circuit.getCity(j);
				
				circuit.setCity(i, city2);
				circuit.setCity(j, city1);
			}
		}
	}
	
	public Circuit selectionTournament(Population population) {
		Population tournament = new Population (this.administartorCircuit, this.sizeOfTournament);
		for (int i=0;i<sizeOfTournament;i++) {
			int id=(int)(Math.random()*population.sizeOfpopulation());
			tournament.saveCircuit(i, population.getCircuit(id));
			}
		Circuit fittest=tournament.getFittest();
		return fittest;
	}
	
	
	
	
	
	
}
