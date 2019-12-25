package projetJavaL3;


public class Main {
	
	public static void main(String[] args) {
		
			AdministratorCircuit gc=new AdministratorCircuit();
			
			City ville1 = new City(3.002556, 45.846117, "ClermontFerrand");
					   gc.addCity(ville1);
					   City ville2 = new City(-0.644905, 44.896839, "Bordeaux");
					   gc.addCity(ville2);
					   City ville3 = new City(-1.380989, 43.470961, "Bayonne");
					   gc.addCity(ville3);
					   City ville4 = new City(1.376579, 43.662010, "Toulouse");
					   gc.addCity(ville4);
					   City ville5 = new City(5.337151, 43.327276, "Marseille");
					   gc.addCity(ville5);
					   City ville6 = new City(7.265252, 43.745404, "Nice");
					   gc.addCity(ville6);
					   City ville7 = new City(-1.650154, 47.385427, "Nantes");
					   gc.addCity(ville7);
					   City ville8 = new City(-1.430427, 48.197310, "Rennes");
					   gc.addCity(ville8);
					   City ville9 = new City(2.414787, 48.953260, "Paris");
					   gc.addCity(ville9);
					   City ville10 = new City(3.090447, 50.612962, "Lille");
					   gc.addCity(ville10);
					   City ville11 = new City(5.013054, 47.370547, "Dijon");
					   gc.addCity(ville11);
					   City ville12 = new City(4.793327, 44.990153, "Valence");
					   gc.addCity(ville12);
					   City ville13 = new City(2.447746, 44.966838, "Aurillac");
					   gc.addCity(ville13);
					   City ville14 = new City(1.750115, 47.980822, "Orleans");
					   gc.addCity(ville14);
					   City ville15 = new City(4.134148, 49.323421, "Reims");
					   gc.addCity(ville15);
					   City ville16 = new City(7.506950, 48.580332, "Strasbourg");
					   gc.addCity(ville16);
					   City ville17 = new City(1.233757, 45.865246, "Limoges");
					   gc.addCity(ville17);
					   City ville18 = new City(4.047255,48.370925, "Troyes");
					   gc.addCity(ville18);
					   City ville19 = new City(0.103163,49.532415, "Le Havre");
					   gc.addCity(ville19);
					   City ville20 = new City(-1.495348, 49.667704, "Cherbourg");
					   gc.addCity(ville20);
					   City ville21 = new City(-4.494615, 48.447500, "Brest");
					   gc.addCity(ville21);
					   City ville22 = new City(-0.457140, 46.373545, "Niort");
					   gc.addCity(ville22);


		Window w=new Window(gc);
		
		
	}

}
