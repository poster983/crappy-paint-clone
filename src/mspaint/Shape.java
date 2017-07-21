package mspaint;

import processing.core.PApplet;

public class Shape extends PApplet {
	protected float x;
	protected float y;
	
	protected int[] color;
	protected boolean hasStroke = false;
	protected int[] strokeColor;
	public Shape(float _x, float _y, int[] _color, int[] _strokeColor) {
		x=_x;
		y=_y;
		color = _color;
		strokeColor = _strokeColor;
		if(strokeColor != null) {
			hasStroke = true;
		}
		
	}
	
	public void compile(PApplet parent) {
		System.out.println("Nothing To Compile1");
	}
}
