package Class01;

import java.util.Scanner;

public class J1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("密碼輸入測試");
		int a = sc.nextInt();
		int b = 0;
		while(true){
			try {
				System.out.println("請再輸入一次密碼：");
				int c = sc.nextInt();
				if(a == c) {
					System.out.println("密碼正確");
					break;
				}
				else {
					b = b + 1;
					throw new ArithmeticException();
				}
			}
			catch(Exception e){
				if(b == 3){
					throw  new  RuntimeException("輸入三次錯誤！程式停止！");
				}
				System.out.println("與第一次輸入的不同！");
			}
		}
	}
}