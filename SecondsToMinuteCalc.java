// import statement declaring the import of the Scanner class

import java.util.Scanner;

// Delcaring of the main class subject to the name of the java file

public class SecondsToMinuteCalc{

// Delcaring of the main class

  public static void main(String[] args) {

// initiating of the Scanner object

      Scanner keyboard  = new Scanner(System.in);

// creating of the vairables to be used in the main method

      int seconds           = 0;
      int minutes           = 0;
      int remainderseconds  = 0;

// invoking of the System.out.println statement.

      System.out.println("Please enter in the amount of seconds you would like to calculate into minutes");

// allocationg the number entered in by the keyboard to my seconds variable

        seconds =  keyboard.nextInt();

// calculating of the seconds in to minutes.

        minutes           = seconds /  60;
        remainderseconds  = seconds %  60;

// Displaying the end result of the calculation

      System.out.println(seconds+" seconds is eqaulivant to "+minutes+" minutes and "+remainderseconds+" seconds");

  }
}
