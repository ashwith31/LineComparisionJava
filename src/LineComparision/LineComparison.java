package LineComparision;

import java.util.*;

public class LineComparison {

	public static void main(String[] args) {

		System.out.println("Welcome to Line Comparison Problem");
		
		float x1,x2,y1,y2,x3,x4,y3,y4;
		Scanner sc =new Scanner(System.in); //Taking input from user
		System.out.println("For the 1st Line, enter the ordinates i.e.(x,y) of 1st point");
		x1=sc.nextFloat();
		y1=sc.nextFloat();
		System.out.println("For the 1st Line, enter the ordinates i.e.(x,y) of 2nd point");
		x2=sc.nextFloat();
		y2=sc.nextFloat();
		float lengthOfLineL1=(float)Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2)); //calculating the length of 1st line
		System.out.println("Length of the 1st line  is "+lengthOfLineL1);
		System.out.println("For the 2nd Line, enter the ordinates i.e.(x,y) of 1st point");
		x3=sc.nextFloat();
		y3=sc.nextFloat();
		System.out.println("For the 2nd Line, enter the ordinates i.e.(x,y) of 2nd point");
		x4=sc.nextFloat();
		y4=sc.nextFloat();
		float lengthOfLineL2=(float)Math.sqrt(Math.pow((x4-x3),2)+Math.pow((y4-y3),2)); //calculating the length of 2nd line
		System.out.println("Length of the 2nd line is "+lengthOfLineL2);
		
		Float obj1=new Float(lengthOfLineL1);
		Float obj2=new Float(lengthOfLineL2);

		float result=obj1.compareTo(obj2); //using the compareto() method to compare two methods
		if(result>0)
		{
			System.out.println("Line1 is greater than Line2");
		}
		else if(result<0)
		{
			System.out.println("Line1 is lesser than Line2");
		}
		else
		{
			System.out.println("Both lines are equal");
		}
		
	}

}
