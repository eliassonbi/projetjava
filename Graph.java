package projetJavaL3;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.util.ArrayList;

import javax.swing.JPanel;

public class Graph extends JPanel{
	
	private static final int BORDER_GAP = 30;

	ArrayList<Double> list =new ArrayList<Double> ();

	private static final int GRAPH_POINT_WIDTH = 3;
	
	
	public void addValue(double value) {
		list.add(value);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
	      Graphics2D g2 = (Graphics2D)g;
		
		g2.drawLine(BORDER_GAP, getHeight() - BORDER_GAP, BORDER_GAP, BORDER_GAP);
	      g2.drawLine(BORDER_GAP, getHeight() - BORDER_GAP, getWidth() - BORDER_GAP, getHeight() - BORDER_GAP);
	      
	      double xScale = ((double) getWidth() - 2 * BORDER_GAP) / (list.size()-1);
	      double yScale = ((double) getHeight() - 2 * BORDER_GAP) / (list.get(0)-1);
	      
	      ArrayList<Point> graphPoints = new ArrayList<Point>();
	      for (int i = 0; i < list.size(); i++) {
	         int x1 = (int) (i * xScale + BORDER_GAP);
	         int y1 = (int) ((10000 - list.get(i)) * yScale + BORDER_GAP);
	         graphPoints.add(new Point(x1, y1));
	      }
	      
	 
	      for (int i = 0; i < graphPoints.size() - 1; i++) {
	         int x1 = graphPoints.get(i).x;
	         int y1 = graphPoints.get(i).y;
	         int x2 = graphPoints.get(i + 1).x;
	         int y2 = graphPoints.get(i + 1).y;
	         g2.drawLine(x1, y1, x2, y2);         
	      }

	 
	      for (int i = 0; i < graphPoints.size(); i++) {
	         int x = graphPoints.get(i).x - GRAPH_POINT_WIDTH / 2;
	         int y = graphPoints.get(i).y - GRAPH_POINT_WIDTH / 2;;
	         int ovalW = GRAPH_POINT_WIDTH;
	         int ovalH = GRAPH_POINT_WIDTH;
	         g2.fillOval(x, y, ovalW, ovalH);
	      }
	   
	      
	      
	      
	      
	      
	}

}
