import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int result = 0;
        Scanner scanner = new Scanner(System.in);
        try {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            result = (int)(a / b);
            System.out.println(result);
        }
        catch(InputMismatchException e)
        {
            System.out.print(e.getClass().getName());
        }
        catch(Exception e) {
            System.out.println(e);
        }
        
    }
}