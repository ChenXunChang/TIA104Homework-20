package hw4;

public class hw4_1 {
	public static void main(String[]args) {
		int[] numbers = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
		int sum = 0;
		for(int i=0;i<numbers.length;i++) {
			 sum += numbers[i];
		}
		
		double average = sum/numbers.length;
		
		System.out.println("平均" + "=" + average);
		System.out.println("大於平均值的元素有:");
		for(int number :numbers) {
			if (number > average) {
				System.out.println(number);
			}
		}
		//請建立一個字串,經過程式執行後,輸入結果是反過來的	
		String s = "Hello world";
		String reversed = reverseString(s);  // 呼叫反轉方法
        System.out.println(reversed);
      
        //有個字串陣列如下 (八大行星):
	       //{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
	       //請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
		String [] planets = {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
		String vowels = "aeiou";
		int count=0;
        String [] elements;
		for (int i=0;i<planets.length;i++) {
			elements = planets[i].split("");	
			for(int j = 0;j<elements.length;j++) {
				if(vowels.contains(elements[j])) {
					count++;
				}
			}
		}
		System.out.println("共" + count + "個");
	    
	       
	}
	//設置反轉方法
	public static String reverseString (String input) {
    	char[] charArray = input.toCharArray();
    	String reversed = "";
    	for(int i = charArray.length-1;i>=0;i--) {
    		reversed += charArray[i];
    	}
    	return reversed;
    }
}



