package hw1;
	
	public class hw1{
		//請設計一隻Java程式,計算12,6這兩個數值的和與積	
		public static void main (String[] args) {
			int a = 6 + 12;
			int b = 6*12;
			System.out.println(a);
			System.out.println(b);
			System.out.println("===================");
		//請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)
			System.out.println(200/12+"打"+200%12+"顆");
			System.out.println("===================");
		//請由程式算出256559秒為多少天、多少小時、多少分與多少秒
			int day = 256559/(60*60*24);
			int hour = (256559%(24*60*60))/3600;
			int min = (256559 %(60*60))/60;
			int sec = (256559%60);
			System.out.println(day+"天"+ hour +"小時"+ min + "分鐘"+sec+"秒");
			System.out.println("===================");
		//請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長	
			double pi = 3.1415;
			int r = 5;
			double area = Math.pow(r,2)*pi;
			double rear = 2*pi*r;
			System.out.println("周長="+ rear);
			System.out.println("面積="+area);
			System.out.println("===================");
		//某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本金加利息共有多少錢 (用複利計算,公式請自行google)	
			double p = 1500000;
			double newSaving = p*Math.pow((1+0.02),10); 
			System.out.println(newSaving);
			System.out.println("===================");
			System.out.println(5+5);//運算 5+5=10
			System.out.println(5+'5');//第一個5是int 第2個5是char
			System.out.println(5+"5");//第一個5是int 第2個5是String
		}   
	}