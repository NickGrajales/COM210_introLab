
package qtwo;
import javax.swing.*;

public class Qtwo {//start class

   
    public static void main(String[] args) 
   {//start method
      
        String s1;
        String s2;
        String s3;
        String s4;
        String s5;
        String s6;
        double p1;
        double p2;
        double p3;
        double average;

        s1 = JOptionPane.showInputDialog("Input first item ");
        s2 = JOptionPane.showInputDialog("What is the price ");
        p1 = Double.parseDouble(s2);

        s3 = JOptionPane.showInputDialog("Input the second item");
        s4 = JOptionPane.showInputDialog("What is the price ");
        p2 = Double.parseDouble(s4);

        s5 = JOptionPane.showInputDialog("Input the third item");
        s6 = JOptionPane.showInputDialog("What is the price ");
        p3 = Double.parseDouble(s6);

        average = (p1+p2+p3)/3;
        
         if (!s1.equalsIgnoreCase("peas"))
        {
            System.out.println("The names of the items are " + s1+"," + s3+ "," + s5 + " and the average is " + average);
        }
        else if (!s3.equalsIgnoreCase("peas"))
        {
            System.out.println("The names of the items are " + s1+"," + s3+ "," + s5 + " and the average is " + average);
        }
        else if (!s5.equalsIgnoreCase("peas"))
        {
            System.out.println("The names of the items are " + s1+"," + s3+ "," + s5 + " and the average is " + average);
        }
        else
        {
        System.out.println("No average output");
        }
       
       
       
       

    }//end method 
}//end class
