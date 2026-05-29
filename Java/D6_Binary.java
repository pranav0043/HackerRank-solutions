import java.util.Scanner;

public class D6_Binary {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        String binary = Integer.toBinaryString(n);

        int count = 0;
        int maxCount = 0;

        for (int i = 0; i < binary.length(); i++) {

            if (binary.charAt(i) == '1') {
                count++;
                maxCount = Math.max(maxCount, count);
            } else {
                count = 0;
            }
        }

        System.out.println(maxCount);
    }
}