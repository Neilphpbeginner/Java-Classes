import java.util.Scanner;

public class  ComputeArea{



  public static void main(String[] args) {

      Scanner keyboard  = new Scanner(System.in);
      double ave;
      double number1,number2,number3;

        System.out.println("Enter in three numbers");

        number1 = keyboard.nextDouble();
        number2 = keyboard.nextDouble();
        number3 = keyboard.nextDouble();

        ave = (number1  + number2 + number3)  / 3;

        System.out.println("The Avereage is: "+ave);

  }
}
