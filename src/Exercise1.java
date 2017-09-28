/**
 * Created by t00195834 on 21/09/2017.
 */
import java.util.Scanner;

public class Exercise1
{
    public static void main(String args[])
    {
        float ExchangeRate, Euros;

        Scanner j = new Scanner(System.in);


        System.out.print("Please enter the exchange rate\n:");
        ExchangeRate = j.nextFloat();
        System.out.print("Please enter the amount in Euros\n:");
        Euros = j.nextFloat();
        if(Euros == 0 && ExchangeRate == 0)
        {
            System.exit(1);
        }
        while(Euros != 0 && ExchangeRate != 0)
        {
            System.out.println("\n\nThe exchange rate is: " + ExchangeRate + "(GBP).\nThe amount of money in Euros entered is: " + Euros +
                    "(Euros).\nFrom GBP To Euro: " + String.format("%.2f", (ExchangeRate * Euros)));

            System.out.print("\n\nPlease enter the exchange rate\n:");
            ExchangeRate = j.nextFloat();

            System.out.print("Please enter the amount in Euros\n:");
            Euros = j.nextFloat();
        }
    }
}
