package addition;

import java.util.Scanner;

public class Add {
	 
	public static void main(String[] args) {
		int num1, num2, sum;
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("enter the num1");
		num1 = obj.nextInt();
		System.out.println("enter the num2");
        num2 = obj.nextInt();
        
        obj.close();
        
        sum = num1 + num2;
        
        System.out.printf("%d+%d=%d",num1,num2,sum);
        
        
	}

}
