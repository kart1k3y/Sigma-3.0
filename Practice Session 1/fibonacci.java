// fibonacci series upto n numbers

import java.util.*;

public class fibonacci {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt();
        int f1 = 0;
        int f2 = 1;
        int f3;
        System.out.print(f1 + "\t" + f2);
        for(int i = 0 ; i <=n ; i++) {
            f3= f1+f2;
            System.out.print("\t" + f3);
            f1=f2;
            f2=f3;
        }
    }
}
