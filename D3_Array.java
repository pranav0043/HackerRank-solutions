import java.util.Scanner;
//DAY 3 
public class D3_Array {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] a = new int[n];

        for(int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        for(int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
}