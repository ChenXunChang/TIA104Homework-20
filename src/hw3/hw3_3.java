package hw3;

import java.util.Scanner;

public class hw3_3 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int i;
		int a = sc.nextInt();
		for(i=1;i<=50;i++) {						
			if(a>=0&&a<10) {
				if(i/10!=a && i%10!=a) {
					System.out.print(i+" ");
				}
			}
		}
			
	}

}
