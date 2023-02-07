
package q1;
import javax.swing.*;

public class Q1 {

   
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
        
        s3 = JOptionPane.showInputDialog("Enter the second item");
        s4 = JOptionPane.showInputDialog("What is the price ");
        p2 = Double.parseDouble(s4);
        
        s5 = JOptionPane.showInputDialog("Entere the third item");
        s6 = JOptionPane.showInputDialog("What is the price ");
        p3 = Double.parseDouble(s6);
        
        average = (p1+p2+p3)/3;
        
        System.out.println("The names of the items are " + s1+"," + s3+ "," + s5 + " and the average is " + average 
        );
        
        
        
    }//end method   
}//end class
