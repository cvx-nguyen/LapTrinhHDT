/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lthdt.donglenh.chuong1;

/**
 *
 * @author HOAI NGUYEN
 */
public class Rectangle extends Shape {
    private int upper_x;
    private int upper_y;
    private int lower_x;
    private int lower_y;

    public Rectangle() {
    }

    public Rectangle(int upper_x, int upper_y, int lower_x, int lower_y) {
        this.upper_x = upper_x;
        this.upper_y = upper_y;
        this.lower_x = lower_x;
        this.lower_y = lower_y;
    }

    
    
    @Override
    public double calcPerimeter()//tính chu vi
    {
        return (2*Math.abs(upper_x - lower_x) + (Math.abs(upper_y - lower_y)));       
    }
    
    @Override
    public double calcArea() //Tính diện tích
    {
        return Math.abs((upper_x - lower_x) * (upper_y -lower_y));
    }

    @Override
    public String toString() {
        String output ="Chu vi hinh chu nhat la: " + calcPerimeter() +
                "; dien tich la: " + calcArea();
        return output;
    }

    
    public int getUpper_x() {
        return upper_x;
    }

    public void setUpper_x(int upper_x) {
        this.upper_x = upper_x;
    }

    public int getUpper_y() {
        return upper_y;
    }

    public void setUpper_y(int upper_y) {
        this.upper_y = upper_y;
    }

    public int getLower_x() {
        return lower_x;
    }

    public void setLower_x(int lower_x) {
        this.lower_x = lower_x;
    }

    public int getLower_y() {
        return lower_y;
    }

    public void setLower_y(int lower_y) {
        this.lower_y = lower_y;
    }
    
    
}
