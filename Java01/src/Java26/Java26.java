/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java26;

/**
 *
 * @author BOSS PC
 */

public class Java26 {
//	public static void main(String[] args) {
//		int out, in = 0;
//		for (out = 0; out < 11; out++) {
//			for (in = 0; in < 20; in++) {
//				if (in > 11 )
//					break;
//			}
//			System.out.println("ben trong vong lap out: out = " + out + ", in = " + in);
//		}
//		System.out.println("ben ngoai vong lap out: out = " + out + ", in = " + in);
//	}

//	public static void main(String[] args) {
//		int out, in = 0;
//		outer: for (out = 0; out < 10; out++) {
//			for (in = 0; in < 20; in++) {
//				if (in > 10)
//					break outer;
//			}
//			System.out.println("ben trong vong lap out: out = " + out + ", in = " + in);
//		}
//		System.out.println("ben ngoai vong lap out: out = " + out + ", in = " + in);
//	}

//	public static void main(String[] args) {
//		int max = 100;
//		for (int i = 0; i < max; i++) {
//			if(i<50)
//				continue;
//			System.out.println(i);
//		}
//	}

	public static void main(String[] args) {
		outer: for(int i=2; i<=9; i++) {
			for(int j=1; j<=10; j++) {
				if(j>5)
					continue outer;
				System.out.println(i+" x "+j +" = "+(i*j));
			}   
			System.out.println("---");
		}
	}
    
//	public static void main(String[] args) {
//		for(int i=2; i<=9; i++) {
//			for(int j=1; j<=10; j++) {
//				if(j>5)
//					return;
//				System.out.println(i+" x "+j +" = "+(i*j));
//			}
//			System.out.println("---");
//		}
//		System.out.println("ABC");
//	}
}
