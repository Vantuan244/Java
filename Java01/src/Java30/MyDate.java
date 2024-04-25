/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java30;

/**
 *
 * @author BOSS PC
 */
public class MyDate {
    private int day;
    private int month;
    private int year;
    
    public MyDate(int d, int m, int y){
        this.day = d;
        this.month = m;
        this.year = y;
    }
    
    public void printDay(){
        System.out.println("Day: "+this.day);       
    }
    public void printMonth(){
        System.out.println("Month: "+this.month);       
    }
    public void printYear(){
        System.out.println("Year: "+this.year);       
    }
    public void printDate(){
        System.out.println("Date: "+this.day +"-"+this.month + "-" + this.year);       
    }
}
