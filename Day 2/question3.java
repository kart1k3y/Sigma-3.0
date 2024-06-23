// Enter cost of 3 items from the user (using float data type) - a pencil, a pen and
// an eraser. You have to output the total cost of the items back to the user as their bill.


import java.util.*;

public class question3 {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float pen,pencil,eraser;

        // Input price
        System.out.println("Enter Price of Pen :");
        pen = sc.nextFloat();
        System.out.println("Enter Price of Pencil :");
        pencil = sc.nextFloat();
        System.out.println("Enter Price of Eraser :");
        eraser = sc.nextFloat();
        
        // Calculate cost
        float cost = pen + pencil + eraser;

        // Display cost
        System.out.println("Cost :" + cost);
        
        // Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem
        float gst = 0.18f * cost;
        System.out.println("Total Cost : "+ (cost+gst));        
        sc.close();
   } 
}



