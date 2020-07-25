package main.LambdasandStreams;
import java.util.*;

/**
 * Hello world!
 *
 */
public class AverageofIntegerList {
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the Size of the list : ");
		int listSize = sc.nextInt();
		System.out.print("\nEnter the elements of the List : ");
		List<Integer> IntegerList = new ArrayList<Integer>();
		for(int count=0;count<listSize;count++)
		{
			int number=sc.nextInt();
			IntegerList.add(number);
		}
		
		IntegerList.stream().mapToInt(number->number).average().ifPresent(average->System.out.print("\nAverage of the given Integers is :"+average));
		
		sc.close();
		
	}
}