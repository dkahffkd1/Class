package class_;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0, b = 0;
		System.out.println("입력");
		a = sc.nextInt();
		b = sc.nextInt();
		if(a%3==0) {
			System.out.println("a는 3의 배수");
			if(b%3==0) {
				System.out.println("b는 3의 배수");
			}else {
				System.out.println("");
			}
		}
	}
}