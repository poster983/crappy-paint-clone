package mspaint;

import java.awt.event.*;

import processing.core.PApplet;
import processing.core.PShape;


public class MSPaint extends PApplet implements MouseMotionListener {
	float boxX = 350;
    float boxY = 250;
    int width = 100;
    int height = 100;
    boolean isInBox = false;
    private CanvasHistory history = new CanvasHistory();
    private Settings set = new Settings();
    /*
    public void settings() {
    	size(1000, 800);
    }*/
	public void setup() {
		size(1000, 800);
		if (frame != null) {
	        frame.setResizable(true);
	      }
		/*blankArea.addMouseMotionListener(this);
        addMouseMotionListener(this);*/
		//setup settings window 
		String[] args = {"Settings"};
		
		PApplet.runSketch(args, set);
		set.settings();
		reset();
		
	}
//25 2te6wntzeennnn
	public void draw() {
		/*
		if (mouseX > boxX && mouseX < boxX + width && mouseY > boxY && mouseY < boxY + height) {
            fill(0, 0, 0);
            isInBox = true;
        } else {
            fill(255, 0, 0);
            isInBox = false;
        }*/
		
        
	}
	
	public void mouseDragged() {

		Shape brush = null;
		if(set.currentBrush == 0) {
			brush = new CircleBrush((float)(mouseX - set.currentSize[0]/3.14),mouseY - set.currentSize[1]/2, set.currentSize[0], set.currentSize[1], set.currentColor, null);
        } else if(set.currentBrush == 1) {
        	brush = new RectangleBrush(mouseX - set.currentSize[0]/2,mouseY - set.currentSize[1]/2, set.currentSize[0], set.currentSize[1], set.currentColor, null);
        }
        
		
		//System.out.println(tester.getClass());
        //ellipse(mouseX - set.currentSize[0]/2,mouseY - set.currentSize[1]/2, set.currentSize[0], set.currentSize[1]);
		brush.compile(this);
        history.record(brush);

    }
	
	public void reset() {
		background(255, 255, 255);
		history.erase();
		
	}
	public void restore() {
		background(255, 255, 255);
		history.restore(this);
	}
	
	public void undo() {
		history.removePrevious();
		background(255, 255, 255);
		history.restore(this);
	}
	
    public void mousePressed() {
    	
    }
 
    public void mouseReleased() {
 
    }
    
    public void keyPressed() {
    	System.out.println(keyCode);
    	switch(keyCode) {
    	case 119: 
    		reset();
    		break;
    	case 118: 
    		restore();
    		break;
	    case 90: 
	    	undo();
			break;
		}
    }
	
	public static void main(String _args[]) {
		PApplet.main(new String[] { mspaint.MSPaint.class.getName() });
	}
}
