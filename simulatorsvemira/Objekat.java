package simulatorsvemira;

import java.awt.Graphics;
import java.awt.Color;

public abstract class Objekat {
	protected int centerX, centerY;
	protected Color objColor;

	public Objekat(int x,int y,Color c) {
		super();
		setX(x);
		setY(y);
		setColor(c);
	}
	public void changeX(int x) {
		this.centerX += x;
	}
	
	public void changeY(int y) {
		this.centerY += y;
	}
	
	public void setX(int x) {
		this.centerX = x;
	}
	
	public void setY(int y) {
		this.centerY = y;
	}
	
	public int getX() {
		return centerX;
	}
	
	public int getY() {
		return centerY;
	}
	
	public void setColor(Color c) {
		this.objColor=c;
	}
	
	public abstract void paint(Graphics g);
}
