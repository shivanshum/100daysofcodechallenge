import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>=-100 && n<=100){
            String s=Integer.toString(n);
            System.out.println("Good job");
        }else
        System.out.println("Wrong answer");
    }
}
