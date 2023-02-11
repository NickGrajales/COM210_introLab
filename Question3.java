package question3;

import java.util.Scanner;

public class Question3 {

    public static void main(String[] args) 
{

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of items: ");
        int numitems = input.nextInt();

        String[] item = new String[numitems];
        double[] price = new double[numitems];
        
        double average = 0;
        boolean total = false;
        input.nextLine();

        for (int i = 0; i < numitems; i++) 
        {
            System.out.println("Enter item name: ");
            item[i] = input.nextLine();

            String red = input.nextLine();

            System.out.println("Enter item price: ");
            price[i] = input.nextDouble();
        
        if ( item[i].equalsIgnoreCase("Peas")) 
            {
                average = price[i] / numitems;
                total=true;
            } 
        }

        
            if (total) 
            {
               System.out.println("The average price is: " + average);
            } 
            else 
            {
                System.out.println("No average output");
            }
        
         
        for (int j = numitems - 1; j >= 0; j--) 
        {
            
            System.out.println(item[j] + " " + price[j]);
        }

    }
}
