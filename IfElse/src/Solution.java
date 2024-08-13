import java.util.*;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    public static String Condition(int N){
        String result = "";

        if (N%2 != 0){
            result = "Weird";
        } else if (N%2 == 0 && N < 5){
            result = "Not Weird";
        } else if (N%2 == 0 && N >= 6 && N <= 20){
            result = "Weird";
        } else if (N%2 == 0 && N > 20){
            result = "Not Weird";
        }

        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        System.out.println(Condition(N));
        scanner.close();
    }
}