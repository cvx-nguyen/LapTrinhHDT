/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lthdt.donglenh.chuong1;

import java.util.Date;

/**
 *
 * @author HOAI NGUYEN
 */
public class Student extends Person{
    private String truonghoc;

    public Student() {
    }

    public Student(String hoten, int gioitinh, Date ngaysinh) {
        super(hoten, gioitinh, ngaysinh);
    }

    public String getTruonghoc() {
        return truonghoc;
    }

    public void setTruonghoc(String truonghoc) {
        this.truonghoc = truonghoc;
    }
    
    
}
