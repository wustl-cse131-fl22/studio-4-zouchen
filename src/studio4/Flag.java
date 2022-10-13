package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		int canvasHeight = 512;
		int canvasWidth = 22 * canvasHeight / 16;
		StdDraw.setCanvasSize(canvasWidth, canvasHeight);
		
		StdDraw.setXscale(0, 18);
		StdDraw.setYscale(0, 13);
		
		double[] x1 = {0, 0, 3};
		double[] y1 = {13, 7, 13};
		StdDraw.setPenColor(0, 50, 0);
		StdDraw.filledPolygon(x1, y1);
		
		double[] x2 = {0, 0, 9, 3};
		double[] y2 = {7, 5, 13, 13};
		StdDraw.setPenColor(0, 100, 200);
		StdDraw.filledPolygon(x2, y2);
		
		double[] x3 = {0, 0, 18, 18, 9};
		double[] y3 = {5, 3, 10, 13, 13};
		StdDraw.setPenColor(0, 0, 255);
		StdDraw.filledPolygon(x3, y3);
		
		double[] x4 = {0, 0, 18, 18};
		double[] y4 = {1, 0, 0, 5};
		StdDraw.setPenColor(255, 0, 0);
		StdDraw.filledPolygon(x4, y4);
	}
}