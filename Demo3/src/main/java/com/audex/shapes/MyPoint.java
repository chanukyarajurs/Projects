package com.audex.shapes;

public class MyPoint {
	private int x=0;
	private int y=0;

public MyPoint(){
}

public MyPoint(int x, int y){
	this.x=x;
	this.y = y;
}
	
public int getX(){
	return this.x;
}
public int getY(){
	return this.y;
}

public void setX(int x){
	this.x = x;
}
public void setY(int y){
	this.y = y;
}

//New in this class program
public int[] getXY(){


	//2nd Way of doing

	//3rd way : Anonymous Array
	return (new int[]{this.x,this.y});
}


public void setXY(int x, int y){
	this.x = x;
	this.y = y;
}
public double distance(int x, int y){
	int diffX = x-this.x;
	int diffY = y-this.y;
	return Math.sqrt((diffX * diffX) + (double)(diffY * diffY));
}

public double distance(MyPoint anotherPoint){
	int diffX = anotherPoint.getX() - this.x;
	int diffY = anotherPoint.getY() - this.y;
	return (Math.sqrt((diffX * diffX) + (double)(diffY * diffY)));
}

public double distance(){
	return (Math.sqrt((this.x * this.x) + (this.y * this.y)));
}

public String toString(){
	return "(" + this.x + "," + this.y + ")";
}

}