package Class01;

import java.util.Scanner;

public class J1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�K�X��J����");
		int a = sc.nextInt();
		int b = 0;
		while(true){
			try {
				System.out.println("�ЦA��J�@���K�X�G");
				int c = sc.nextInt();
				if(a == c) {
					System.out.println("�K�X���T");
					break;
				}
				else {
					b = b + 1;
					throw new ArithmeticException();
				}
			}
			catch(Exception e){
				if(b == 3){
					throw  new  RuntimeException("��J�T�����~�I�{������I");
				}
				System.out.println("�P�Ĥ@����J�����P�I");
			}
		}
	}
}