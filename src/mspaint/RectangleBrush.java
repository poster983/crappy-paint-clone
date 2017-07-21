package mspaint;

import processing.core.PApplet;

public class RectangleBrush extends Shape {

	
	protected float w;
	protected float h;

	public RectangleBrush(float _x, float _y, float _w, float _h, int[] _color, int[] _strokeColor) {
		super(_x, _y, _color, _strokeColor);

		w=_w;
		h=_h;
	}

	public void compile(PApplet parent) {
		parent.rect(x, y, w, h);
		parent.fill(color[0], color[1], color[2]);
		parent.noStroke();
	}
	
}
