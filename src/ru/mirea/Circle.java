package ru.mirea;

public class Circle {
    private int radius;
    private int xPos;
    private int yPos;

    private double lenght;

    public Circle(int radius, int xPos, int yPos) {
        this.radius = radius;
        this.xPos = xPos;
        this.yPos = yPos;
        calcLenght();
    }

    public Circle(int radius) {
        this.radius = radius;
        calcLenght();
    }

    public int getRadius() {
        return radius;
    }

    public int getxPos() {
        return xPos;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }

    public double getLenght() {
        return lenght;
    }

    public double getSpace() {
        return lenght * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", xPos=" + xPos +
                ", yPos=" + yPos +
                ", lenght=" + lenght +
                '}';
    }
    public void printCircle(){
        System.out.println(this);
    }
    private void calcLenght(){
     lenght = 2 * Math.PI * 2 * radius;
    }
// write your code here
}
