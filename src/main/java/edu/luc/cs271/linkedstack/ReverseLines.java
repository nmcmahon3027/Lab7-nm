package edu.luc.cs271.linkedstack;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class ReverseLines {

  public static void main(final String[] args) {
    final Scanner input = new Scanner(System.in);
    printReverse(input);

  }

  private static void printReverse(final Scanner input) {

    if (!input.hasNextLine()) {
      return;
    }

    String line = input.nextLine();
    System.out.println(line);
    printReverse(input);
    System.out.println(line);
  }
}