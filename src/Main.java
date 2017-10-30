import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a,b;
        a=in.nextInt();
        b=in.nextInt();
        if(b==1)
            System.out.println((a-80)*0.7);
        else
            System.out.println((a-70)*0.6);

    }
}
