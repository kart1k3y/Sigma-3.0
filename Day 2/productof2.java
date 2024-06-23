import java.util.*;

public class productof2 {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a & b :");
        a = sc.nextInt();
        b = sc.nextInt();
        int ans = a*b;
        System.out.println("Product : "+ans);
        sc.close();
    }
}
