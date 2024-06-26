// checking if a number is prime or not

import java.util.*;

public class hwq1 {
    public static void main(String[] args) {
        
        Scanner scanf = new Scanner(System.in);
        // input n
        System.out.println("Enter number :");
        int n = scanf.nextInt();
        scanf.close();
        int flag = 0;
        for(int i=2;i<n;i++) {
            if(n%i==0) {
                flag=1;
                break;
            }
        }

        if(flag==0)
            System.out.println("Number is prime");
        else    
            System.out.println("Number is not prime");
        
    }
}
