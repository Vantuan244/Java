/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java27;

/**
 *
 * @author BOSS PC
 */
import java.util.Scanner;

public class Java27 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=0;
		try {
			System.out.println("Nhap vao so nguyen n: ");
			n = sc.nextInt();
		} catch (Exception e) {
			System.out.println("Nhap du lieu khong đung");
		} finally {
			System.out.println("Finally!");
		}
		System.out.println("Gia tri nhap la: "+n);
		System.out.println("Ket thuc chuong trinh");
	}
}
