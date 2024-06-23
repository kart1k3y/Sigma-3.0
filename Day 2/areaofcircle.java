import java.util.*;

public class areaofcircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius : ");
        float radius = sc.nextFloat();
        float area = radius*radius*3.14f;
        System.out.println("Area of circle : "+area);
        sc.close();
    }
}
