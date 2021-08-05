package LineComparision;

import java.util.*;

public class LineComparison {

	public static void main(String[] args) {

		System.out.println("Welcome to Line Comparison Problem");
		
		float x1,x2,y1,y2;
		Scanner sc =new Scanner(System.in); //Taking input from user
		System.out.println("Enter the ordinates i.e. (x,y) of 1st point");
		x1=sc.nextFloat();
		y1=sc.nextFloat();
		System.out.println("Enter the ordinates i.e. (x,y) of 2nd point");
		x2=sc.nextFloat();
		y2=sc.nextFloat();
		float lengthOfLine=(float) Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2)); //calculating the length of line
		System.out.println("Length of the line is "+lengthOfLine);
		
		
	}

}
