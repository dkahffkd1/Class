package class_;

public class TestClass09 {
	public void test1() {
		for (int i=0;i<5;i++) {
			System.out.println(i);
			if(i==3) {
			//	break; // 반복문을 종료
				return ; // 반환값이 없어도 쓸 수 있다.
			}
		}
		System.out.println("test1 종료");
	}
	public int test2( ) {
		int n = 10;
		if(n> 100)
		return 100;
		//else
		return 0;// 변수 초기화처럼 초기화 시켜줘야 함
	}
	public String test3() {
		int num = 100;
		if ( num > 10)
			return "문자열";
		else
			return "100";// -> 반환값이 String일때는 무조건 문자열만 숫자쓰면 에러
	}
	public String test() {
		return "aaaa"; //,"bbb","cccc";// return으로 돌려줄 수 있는 변수값은 하나임 예시처럼 3개는 X
		
	}
}
