import java.util.Scanner;

public class VatCalc{

  public static void main(String[] args) {

      Scanner keyboard  = new Scanner(System.in);
      double purchaseprice;
      double tax;
      double totalamount;

      System.out.println("Please enter in the purchase price of the item you wish to buy");
      purchaseprice = keyboard.nextDouble();

      tax = purchaseprice  * 1.14;

      totalamount = Math.round(tax*100.00)/100.00;

      System.out.println(totalamount);



  }
}
