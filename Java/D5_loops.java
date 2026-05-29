

import java.io.*;
import java.util.*;

public class D5_loops {

    public static void main(String[] args) throws IOException {     //If an input error happens, Java will handle it

        BufferedReader bufferedReader =
                new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        for(int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }

        bufferedReader.close();
    }
}