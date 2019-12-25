package projetJavaL3;


import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Window extends JFrame {

	Graph graph;
	JPanel top;
    JLabel jtop;
	Boolean stop=false;
	
	public Window(AdministratorCircuit ac) {
		this.setTitle("Analyse du meilleur chemin");
		this.setVisible(true);
		this.setSize(1000, 500);
	    this.setLocationRelativeTo(null);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setLayout(new BorderLayout());
	    
	    top=new JPanel();
	    jtop=new JLabel();
	    top.add(jtop);
	   // top.setBackground(Color.BLACK);
	    graph=new Graph();
	    this.getContentPane().add(graph, BorderLayout.CENTER);
	    this.getContentPane().add(top, BorderLayout.NORTH);
	    
	    
	    
	    
	    Thread t=new Thread() {
		
			Population pop= new Population(ac, 50);
			Genetic ga=new Genetic(ac,5);
		
			
			public void run() {
				double fittest = pop.getFittest().getDistance();
				
				while(!stop) {
					jtop.setText("Meilleure distance trouvée : "+ fittest+ " km");
					if(pop.getFittest().getDistance()<fittest) {
						fittest=pop.getFittest().getDistance();
					}
					graph.addValue(pop.getFittest().getDistance());
					graph.repaint();
					pop=ga.evolution(pop);
				
				}
				try {
					Thread.sleep(10);
				}
				catch (InterruptedException e) {
			        e.printStackTrace();
			      }
				
			}
		};
		t.start();
	    
	    
	    
	    
	    
	}
}
