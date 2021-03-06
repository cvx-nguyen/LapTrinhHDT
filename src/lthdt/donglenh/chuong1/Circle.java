/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lthdt.donglenh.chuong1;

/**
 *
 * @author HOAI NGUYEN
 */
public class Circle extends Shape {
    private int radius;
    private int x, y;

    public Circle() {
    }

    public Circle(int radius, int x, int y) {
        this.radius = radius;
        this.x = x;
        this.y = y;
    }
    
    @Override
    public double calcPerimeter(){
        double result = 2*Math.PI*this.radius;
        return result;
    }
    
    @Override
    public double calcArea(){
        double result = Math.PI*this.radius*this.radius;
        return result;
    }

    @Override
    public String toString() {
        String output ="Chu vi hinh tron la: " + calcPerimeter() +
                "; dien tich la: " + calcArea();
        return output;
    }
    
    

    public int getRadius() {
        return radius;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    
}
