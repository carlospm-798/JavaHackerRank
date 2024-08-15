import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String read;
        int count = 0;


        while (sc.hasNext()){
            read = sc.nextLine();
            count += 1;
            System.out.println(Integer.toString(count)+ ' '+ read);
        }
    }
}