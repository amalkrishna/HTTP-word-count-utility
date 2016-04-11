package com.wc.util;

import java.io.*;
import java.util.Scanner;
import java.util.*;

public class CountCalculator {

	static File file = null;

	public static int countWord(String word) 
	{
		int count = 0;
		try
		{
			file=new File("D://Java/test.txt");
			Scanner scanner = new Scanner(file);
			while (scanner.hasNextLine())
			{
    			String nextToken = scanner.next();
    			if (nextToken.equalsIgnoreCase(word))
    			{
    				count++;
    			}
			}
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e);
		}
		return count;
	}	
}