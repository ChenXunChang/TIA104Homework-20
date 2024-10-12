package hw3;

import java.util.Scanner;

public class hw3 {
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入三邊長");
		int a = sc.nextInt();
		
		int b = sc.nextInt();
		
		int c = sc.nextInt();
		
		if (a+b>c || a+c>b || b+c>a) {
			if (a==b && b==c){
				System.out.println("正三角形");
			}else if(a==b||b==c||a==c) {
				System.out.println("等腰三角形");
			}else {
				System.out.println("Triangle");
			
			}
		sc.close();
		}
	}

}
