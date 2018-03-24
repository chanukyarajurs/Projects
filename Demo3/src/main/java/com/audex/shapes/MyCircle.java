package com.audex.shapes;
import com.audex.shapes.MyPoint;

public class MyCircle {
private MyPoint center = new MyPoint();
private int radius = 1;

public MyCircle(){
}


public MyCircle(int x, int y, int radius){
	center.setX(x);
	center.setY(y);
	this.radius = radius;
}

public MyCircle(MyPoint center, int radius){
this.center = center;
this.radius = radius;
}

public int getRadius(){
	return this.radius;
}

public void setRadius(int radius){
	this.radius = radius;
}

public MyPoint getCenter(){
	return this.center;
}

public void setCenter(MyPoint center){
	this.center = center;
}

public int getCenterX(){
	return this.center.getX();
}

public void setCenterX(int x){
	this.center.setX(x);
}

public int getCenterY(){
	return this.center.getY();
}

public void setCenterY(int y){
	this.center.setY(y);
}

public int[] getCenterXY(){
	return this.center.getXY();
}

public void setCenterXY(int x, int y){
	this.center.setXY(x, y);
}

public double getArea(){
	return (Math.PI * this.radius * this.radius);
}

public double getCircumference(){
	return 2 * Math.PI * this.radius;
}

public double distance(MyCircle anotherCircle){
	return this.center.distance(anotherCircle.getCenter());

}


public String toString(){
	return "MyCircle[radius=" + this.radius + ", center=" + this.center.toString();
}

}
