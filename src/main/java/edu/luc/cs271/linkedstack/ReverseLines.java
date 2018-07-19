package edu.luc.cs271.linkedstack;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class ReverseLines {

  public static void main(final String[] args) {
    Scanner input = new Scanner(System.in);//was final
    String str = input.next();
    printReverse(String.valueOf(input));
  }


  public static void fillStack(String inputString) {
    //input.push(inputString);
  }


  /*final Scanner input = new Scanner(System.in);{
    while(input.hasNextLine())*/

/*

    {
      final String line = input.nextLine(); //was here b4
    }
*/

//read line, print line, test EOF, if not EOF anothe rline to read...continue


  public static void printReverse(String str) {
    // TODO recursively read and print successive input lines until EOF, then print them out in reverse order
    //need LIFO order

   /* final Scanner input = new Scanner(System.in);//was final

    str = input.next();


    System.out.println(str);

    if(str == "" || str == null || (!input.hasNextLine()))

      return;
    {
      if (input.hasNextLine()) ;


      System.out.println(str.substring(0, 6));//just added
      System.out.println(str);//"" (same)

      return;
*/
    Scanner input = new Scanner(System.in);
    str = input.next();
    char first = str.charAt(0);
    char last = str.charAt(str.length() - 1);
    System.out.println(str);
    if (str == null || str.isEmpty()) {
      return;
    } else {
      System.out.print(str);
      System.out.println(first);
      System.out.println(last);
      System.out.println(str.charAt(str.length() -1));
      System.out.println(str.charAt(str.length() -2));
      System.out.println(str.charAt(str.length() -3));
      System.out.println(last);

      return;

      /*System.out.println(str.charAt(0) + str.length());  //(str.charAt(0+1));


      System.out.println(str.charAt(4));
      System.out.println(str.charAt(3));
      System.out.println(str.charAt(2));
      System.out.println(str.charAt(1));
      System.out.println(str.charAt(0));
      printReverse(str.substring(1));*/

    }

   /* System.out.println(str);
    if (str != "" && str != null && input.hasNextLine()) {
      System.out.println(str.charAt(4));//0

      if (input.hasNextLine()) {
        System.out.println(str.substring(0, 6));
        System.out.println(str.charAt(3));//2
*/
      }


      // return 1 + printReverse();
    }


       /* System.out.print(str);//

      printReverse(str.substring(1));//bottom  ***May need
      System.out.println(str.lastIndexOf(str));***May need

      */
    /*if(!input.hasNextLine())//Dont need
        System.out.println("NO more");*/







