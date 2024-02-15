package class_;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0, b = 0;
		System.out.println("입력");
		a = sc.nextInt();
		b = sc.nextInt();
	
	if(a%2==0 ) {
		System.out.println("짝수");
	}	else if(a%2==1) {
		System.out.println("홀수");
	}
	if(b%2==0 ) {
		System.out.println("짝수");
	}else if(b%2==1) {
		System.out.println("홀수");
	} 
	}
}
