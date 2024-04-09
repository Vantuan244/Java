package Java17;

import java.util.Scanner;

/**
 *
 * @author BOSS PC
 */
public class Java17 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen n : ");
        n = sc.nextInt();
        
        // Kiểm tra tính chẵn lẻ 
        if(n%2==0) {
            System.out.println( n + "la so chan");
        } else {
            System.out.println("la so le");
        }
    }
}
