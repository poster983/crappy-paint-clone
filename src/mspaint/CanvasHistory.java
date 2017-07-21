package mspaint;

import java.util.*;

import processing.core.PApplet;

public class CanvasHistory {
	ArrayList<Shape> history;
	public CanvasHistory() {
		history = new ArrayList<Shape>();
	}
	public ArrayList<Shape> getHistory() {
		return history;
	}
	public void record(Shape shape) {
		history.add(shape);
	}
	public void remove(Shape shape) {
		
	}
	public void removePrevious() {
		//System.out.println("PIs");
		if(history.size() > 0) {
			history.remove(history.size()-1);
		}
		System.out.println(history.size());
	}

	public Shape[] toArray() {
		Shape[] historyArr = new Shape[history.size()];
		historyArr = history.toArray(historyArr);
		return historyArr;
	}
	public void restore(PApplet canvas) {
		if(history.size() > 0) {
			for(Shape x: history) {
				x.compile(canvas);
				
			}
		}
		
	}
	
	public void erase() {
		history.clear();
	}
	/*
	public String toString() {
		String[] historyArr = new String[history.size()];
		historyArr = history.toArray(historyArr);
		return 
	}*/
}
