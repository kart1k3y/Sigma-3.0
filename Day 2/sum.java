import java.util.*;

public class sum {
    public static void main(String[] args) {
        int a,b,sum;
        System.out.println("Enter a & b:");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        sum = a+b;
        System.out.println("Sum : "+sum);
        sc.close();
    }
}
