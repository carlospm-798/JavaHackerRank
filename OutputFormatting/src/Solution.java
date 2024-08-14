import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();

            String int2str;
            int2str = String.valueOf(x);

            System.out.print(s1);
            for (int j=0; j<(15 - s1.length()); j++){
                System.out.print(" ");
            }

            for (int j=0; j<(3 - int2str.length()); j++){
                System.out.print(0);
            }
            System.out.print(int2str + '\n');
        }
        System.out.println("================================");

    }
}


/*      Sample Input

java 100
cpp 65
python 50

        Sample Output

================================
java           100
cpp            065
python         050
================================*/