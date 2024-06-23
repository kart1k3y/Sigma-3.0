//In a program, input 3 numbers : A, B and C. You have to output the average of these 3 numbers.

import java.util.*;

public class question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.println("Enter a , b & c : ");
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // calculating average

        int avg = a + b + c;

        //Displaying average

        System.out.println("Average : " + avg );

    }
}
