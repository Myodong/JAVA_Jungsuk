package ch03;
class Ex3_12 {
	public static void main(String args[]) { 
		int x = 10;
		int y = 8;

		System.out.printf("%d을 %d로 나누면, %n", x, y); 
		System.out.printf("몫은 %d이고, 나머지는 %d입니다.%n", x / y, x % y); 
		
		System.out.println(10 % 8); // 10을 8 로 나눈 나머지 2차 출력된다
		System.out.println(10 % -8); // 위와 같은 결과를 출력 한다
	}
}
