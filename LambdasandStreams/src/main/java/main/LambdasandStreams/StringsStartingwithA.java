package main.LambdasandStreams;

import java.util.*;
import java.util.stream.Collectors;

public class StringsStartingwithA {
	public static void main(String args[]) {
		List<String> StringList = new ArrayList<String>();
		System.out.println("Enter the number of words:");
		Scanner sc= new Scanner(System.in);
		int ListSize=sc.nextInt();
		System.out.println("Enter the list of words:");
		for(int i=0;i<ListSize;i++)
		{
			String InputString;
			InputString=sc.next();
			StringList.add(InputString);
		}
		List<String> FinalList = new ArrayList<String>();
		FinalList=StringList.stream().filter(string -> string.startsWith("a")).filter(s -> s.length()==3).collect(Collectors.toList());
		System.out.println("The final list of words is:");
		for(String listItem:FinalList)
		{
			System.out.print(listItem+" ");
		}
		sc.close();
	}
}