import java.io.*;
import java.util.*;

public class D4_dataT {

    public static void main(String[] args) {
        
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
        
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        double b = in.nextDouble();
        in.nextLine(); // consume newline
        String c = in.nextLine();

        int sum = i + a;
        double result = d + b;

        System.out.println(sum);
        System.out.println(result);
        System.out.println(s + c);
    }
}