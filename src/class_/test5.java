package class_;

import java.util.Scanner;

public class test5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a , b ;
		System.out.println("입력");
		a = sc.nextInt();
		b = sc.nextInt();
		if(a<0) {
			System.out.println(a+" 절대값 =>"+ a*-1);
			if (b<0)
				System.out.println(b+" 절대값 =>"+ b*-1);
		}
		if(a>0) {
			System.out.println(a+" 절대값 =>"+a);
			if(b>0)
				System.out.println(b+" 절대값 =>" +b);
		}
	}
}