// In a program, input the side of a square. You have to output the area of the square.

import java.util.*;

public class question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // input side of square
        System.out.println("Enter Side of a Square : ");

        int side = sc.nextInt();

        // calculate area
        int area = side * side;

        // display area
        System.out.println("Area : " + area);
        sc.close();
    }
}
