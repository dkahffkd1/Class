package class_;

import java.util.Scanner;

public class MainClass05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = 0 ;
		System.out.println("수 입력");
		num = input.nextInt();
		TestClass05 t = new TestClass05();
		t.sumFunc(num);// <== Method에서 ()<-괄호는 값을 호출하는 용도임
	}
}
