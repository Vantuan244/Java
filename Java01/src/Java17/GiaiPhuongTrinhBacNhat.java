/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java17;

import java.util.Scanner;

/**
 *
 * @author BOSS PC
 */
public class GiaiPhuongTrinhBacNhat {
    public static void main(String[] args) {
        //PTBN : ax+b = 0
        /*
        Neu a=0 
        Neu b=0 => PT vo so nghiem 
        Neu b!=0 => PT vô nghiệm
        Nếu a!=0
            Có nghiệm x = -b/a
        */
        double a,b,x;
        Scanner sc = new Scanner (System.in);
        System.out.println("Nhap a = ");
        a = sc.nextDouble();
        System.out.println("Nhap b = ");
        b = sc.nextDouble();
        
        if(a==0){
           // Tình huống a = 0
           if(b==0){
               // Tình huống a = 0  và b =0
               System.out.println("Phuong trinh vo so nghiem ");
           }else{
               //Tình huống a = 0 b !=0
               System.out.println("Phuong trinh vo nghiem");
           }
        }else{
            //Tình huống a!=0 b!0
            x=-b/a;
            System.out.println("Co nghiem x = " + x);
        }
        
    }
}
