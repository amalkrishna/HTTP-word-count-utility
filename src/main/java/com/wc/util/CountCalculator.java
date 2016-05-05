/*
 * CountCalcuator.java
 * 
 * v1.0
 *
 * 20 April 2016
 */

package com.wc.util;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CountCalculator {

 static File file = null;
 private static List < String > wordlist = null;
 
 /**  
  *  Function to count the word that is queried
  */
 public static int countWord(String word) {
  int count = 0;                            //Count Variable
  readData();                               //Calling Function readData
  if (wordlist != null) {
   try {
    for (Object obj: wordlist) {
     String element = (String) obj;
     if (element.equalsIgnoreCase(word)) {
      /*Increment count if the word is found*/
      count++;                              
     }
    }
   } catch (Exception e) {
    System.out.println(e);
   }
  }
  return count;                             //Return count
 }

 /**  
  *
  *  Function to read the file and cache the content 
  */
 public static void readData() {
  if (wordlist == null) {
   try {
    wordlist = new ArrayList < String > ();  //ArrayList 
    file = new File("D://Java/test.txt");    //Open the input file
    Scanner scanner = new Scanner(file);     
    while (scanner.hasNext()) {
     wordlist.add(scanner.next());           //Append the content to ArrayList
    }
    scanner.close();
   } catch (FileNotFoundException e) {
    System.out.println(e);
   }
  }
 }
}