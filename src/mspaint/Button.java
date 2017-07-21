package mspaint;
import processing.core.PApplet;
class Button extends PApplet{
  String label; // button label
  float x;      // top left corner x position
  float y;      // top left corner y position
  float w;      // width of button
  float h;      // height of button
  PApplet parent;// parent obj;
  // constructor
  Button(String labelB, float xpos, float ypos, float widthB, float heightB, PApplet _parent) {
    label = labelB;
    x = xpos;
    y = ypos;
    w = widthB;
    h = heightB;
    parent = _parent;
  }
  public void setup() {
	  size(500, 500);
  }
  void Draw() {
	parent.fill(218);
	parent.stroke(141);
	parent.rect(x, y, w, h, 10);
	parent.textAlign(CENTER, CENTER);
	parent.fill(0);
	parent.text(label, x + (w / 2), y + (h / 2));
  }
  
  boolean MouseIsOver() {
    if (parent.mouseX > x && parent.mouseX < (x + w) && parent.mouseY > y && parent.mouseY < (y + h)) {
      return true;
    }
    return false;
  }
}
