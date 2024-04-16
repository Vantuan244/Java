/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java24;

import java.util.Scanner;

/**
 *
 * @author BOSS PC
 */
public class Java24 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner (System.in);
        System.out.println("Nhap so nguyen n > 0 ");
        n = sc.nextInt();
        
        String nhiPhan = "";
        while (n > 0){
            nhiPhan = (n%2) + nhiPhan;
            n = n/2;
        }
        System.out.println("So he nhi phan la " + nhiPhan);
//        Chia liên tục cho 2 và lấy phần dư 
//        Đảo ngược chuỗi => Kết quả ;
//        10 : 2 = 5 dư 0 , 5 : 2 = 2 dư 1 , 2 : 2 = 1 dư 0 , 1 : 2 = 0 dư 1
//        => sang nhị phân từ số 10 là 1010 ( đảo ngược từ dưới lên )

    }
   
}
