package mspaint;
import java.awt.Dimension;
import java.awt.event.*;

import processing.core.PApplet;

public class Settings extends PApplet implements MouseMotionListener{
	public int currentBrush;
	public int[] currentSize;
	public int[] currentColor;
	private Button size1;
	private Button size2;
	private Button size3;
	
	
	private Button red;
	private Button green;
	private Button blue;
	private Button black;
	
	private Button circle;
	private Button square;
	
	public void settings() {
	    
	  }
	public void setup() {
		size(800, 300);
		if (frame != null) {
	        frame.setResizable(true);
	      }
		size1 = new Button("Brush Size 1", 1, 1, 80, 80, this);
		size2 = new Button("Brush Size 2", 81, 1, 80, 80, this);
		size3 = new Button("Brush Size 3", 161, 1, 80, 80, this);
		
		red = new Button("Red", 261, 1, 80, 80, this);
		green = new Button("Green", 341, 1, 80, 80, this);
		blue = new Button("Blue", 421, 1, 80, 80, this);
		black = new Button("Black", 501, 1, 80, 80, this);
		
		
		circle = new Button("Circle", 1, 101, 80, 80, this);
		square = new Button("Square", 91, 101, 80, 80, this);
		
		currentBrush = 0; //rectangle
		
		currentSize = new int[2];
		currentColor = new int[3];
		
		currentSize[0] = 100; //w
		currentSize[1] = 100; //h
		
		currentColor[0] = 0; //r
		currentColor[1] = 0; //g
		currentColor[2] = 0; //b
	}
	
	public void mousePressed() {
		System.out.println("Clicked: ");
    	if (size1.MouseIsOver()) {
    		currentSize[0] = 20; //w
    		currentSize[1] = 20; //h
    	  }
    	if (size2.MouseIsOver()) {
    		currentSize[0] = 50; //w
    		currentSize[1] = 50; //h
    	  }
    	if (size3.MouseIsOver()) {
    		currentSize[0] = 100; //w
    		currentSize[1] = 100; //h
    	  }
    	
    	
    	if (red.MouseIsOver()) {
    		currentColor[0] = 255; //r
    		currentColor[1] = 0; //g
    		currentColor[2] = 0; //b
    	  }
    	if (green.MouseIsOver()) {
    		currentColor[0] = 0; //r
    		currentColor[1] = 255; //g
    		currentColor[2] = 0; //b
    	  }
    	if (blue.MouseIsOver()) {
    		currentColor[0] = 0; //r
    		currentColor[1] = 0; //g
    		currentColor[2] = 255; //b
    	  }
    	if (black.MouseIsOver()) {
    		currentColor[0] = 0; //r
    		currentColor[1] = 0; //g
    		currentColor[2] = 0; //b
    	  }
    	
    	
    	if (circle.MouseIsOver()) {
    		currentBrush = 0;
    	  }
    	if (square.MouseIsOver()) {
    		currentBrush = 1;
    	  }
    }
	
	  public void draw() {
	    background(255);
	    fill(0);
	    size1.Draw();
	    size2.Draw();
	    size3.Draw();
	    
	    red.Draw();
	    green.Draw();
	    blue.Draw();
	    black.Draw();
	    
	    circle.Draw();
	    square.Draw();
	  }
	  //GET SETTINGS 

}
