package baitapjava_32;

import java.util.Scanner;

public class Bai28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner in = new Scanner(System.in);
	        System.out.print("Input a number: ");
	        double n = in.nextDouble();

	        if (n > 0)
	        {
	            if (n < 1)
	            {
	                System.out.println("Positive small");
	            }
	            else if (n > 1000000)
	            {
	                System.out.println("Positive large");
	            }
	            else
	            {
	                System.out.println("Positive");
	            }
	        }
	        else if (n < 0)
	        {
	            if (Math.abs(n) < 1)
	            {
	                System.out.println("Negative small");
	            }
	            else if (Math.abs(n) > 1000000)
	            {
	                System.out.println("Negative large");
	            }
	            else
	            {
	                System.out.println("Negative");
	            }
	        }
	        else
	        {
	            System.out.println("Zero");
	        }

	}

}
