package hw3;

import java.util.Scanner;

public class hw3_2 {
	public static void main(String[]args) {
		int i;
		i=(int)(Math.random()*10) + 1;
		
		Scanner sc = new Scanner(System.in);
		
		
		
		while(true) {
		int a = sc.nextInt();
			if(i==a) {
				System.out.println("你答對囉~");
				break;
			}else if(a>10 || a<0){
				System.out.println("請輸入0~10");
			}else {
				System.out.println("錯!");
				
			}
		
		}
	}	
		
}

