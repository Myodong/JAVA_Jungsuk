package ch03;
class Ex3_11 {
	public static void main(String args[]) { 
		double pi = 3.141592; 
		double shortPi = Math.round(pi * 1000) / 1000.0;
		System.out.println(shortPi);
		
		
		//과정
		System.out.println(pi);
		System.out.println(pi * 1000);
		System.out.println( Math.round(pi * 1000));
		System.out.println( Math.round(pi * 1000) / 1000); // 3  int 결과값
		System.out.println( (double)Math.round(pi * 1000) / 1000); // 3.142 double 형변환
		System.out.println( Math.round(pi * 1000) / 1000.0); // 3.142 double 결과
		
	}
}