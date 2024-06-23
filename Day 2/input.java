import java.util.*;

public class input {
    public static void main(String[] args) {
        System.out.print("Earth is flat : ");
        Scanner sc = new Scanner(System.in);
        boolean a = sc.nextBoolean();
        System.out.print("Your answer : "+a);
        sc.close();
    }
}
