package hw2;
	
	public class hw2{
		public static void main(String[] args) {
			//請設計一隻Java程式,計算1~1000的偶數和 (2+4+6+8+...+1000)
			int sum = 0;
			int count;
			for(count = 0; count <= 1000; count +=2) {				
				sum+=count;
			}	
			System.out.println(sum);						
			System.out.println("===================");
			//請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)
			int sum2 = 1;
			for (int count2=1;count2<=10;count2++) {
				sum2 *= count2;
			}
			System.out.println(sum2);
			System.out.println("===================");
			//請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)
			int sum3 = 1;
			int count3 = 1;
			while(count3<=10) {				
				sum3 *= count3;
				count3++;
			}
			System.out.println(sum3);
			System.out.println("===================");
			//請設計一隻Java程式,輸出結果為以下:1 4 9 16 25 36 49 64 81 100
			int sum4;
			for(int c=1;c<=10;c++) {
				 sum4 = c*c;
				System.out.print(sum4+" ");	
			}
			System.out.println();
			System.out.println("===================");
			//阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。請設計一隻程式,輸出結果為阿文可以選擇的數字有哪些?總共有幾個?	
			int counts=0;
			for(int i=1;i<=49;i++) {
				if(i%10!=4 && i/10!=4) {
					System.out.print(i+" ");
					counts++;
				}	
			}							
			System.out.println("有"+counts+"個");		
			System.out.println("===================");
			//設計java結果
			for(int a =10;a>=1;a--) {
				for(int b = 1;b<=a;b++) {
					System.out.print(b+" ");
				}
			System.out.println();	
			}
			//最後一題
			char letter = 'A';
			        
			for (int i = 1; i <= 6; i++) {	            
			     for (int j = 1; j <= i; j++) {
			                System.out.print(letter);
			            }
			            
			            System.out.println();
			            
			            letter++;
			  }
			}
			
		}
			
	
	