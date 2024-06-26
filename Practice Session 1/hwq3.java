// print prime numbers between a & b

import java.util.*;

public class hwq3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Prime no. from : ");
        int a = sc.nextInt();
        System.out.print("To : ");
        int b = sc.nextInt();
        int flag,n;
        for (n = a; n < b; n++) {
            flag = 0;
            for (int i = 2; i < n; i++) {
                if(n%i==0){
                    flag=1;
                    break;
                }
            }
            if (flag==0)
                System.out.println(n);
        }
    }
}
