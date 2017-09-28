import java.util.Scanner;
import java.io.*;

public class Exercise4 {
    public static void main(String args[]) {

        String name, Str1, Str2, Uppercase;
        char Initial;
        int nameLength = 0, counter = 0, copy, v, counter2 = 0;


        Scanner j = new Scanner(System.in);

        System.out.print("Please enter your full name\n: ");
        name = j.nextLine();
        nameLength = name.length();
        Str1 = name;

        Initial = name.charAt(0);

        Uppercase = name.toUpperCase();

        for (v = name.lastIndexOf(' '); nameLength <= counter; counter++)
        {

        }

        for (int i = 0; i < name.length(); i++)
        {
            if (name.charAt(i) == ' ')
            {
                counter2++;
            }
        }

        if (counter2 == 0)
        {
            System.out.println("\nThe length of your name is: " + (Str1.length() - counter2) + "\nThe first initial is: " + Initial +
                    "\nYour name in Uppercase: " + Uppercase + "\nYou did not enter a surname");

        }
        else
        {
            System.out.println("\nThe length of your name is: " + (Str1.length() - counter2) + "\nThe first initial is: " + Initial +
                    "\nYour name in Uppercase: " + Uppercase + "\nYour last surname is: " + name.substring(v + 1, nameLength));

        }
    }
}



































