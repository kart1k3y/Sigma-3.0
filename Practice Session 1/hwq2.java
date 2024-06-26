// print prime numbers from a to b

public class hwq2 {
    public static void main(String[] args) {
        int flag;
        for(int n = 2 ; n <= 100 ; n++) {
            flag = 0;
            for(int i=2;i<n;i++) {
                if(n%i==0) 
                    flag=1;
            }
            if(flag==0)
                    System.out.println(n);
        }
    }
}

