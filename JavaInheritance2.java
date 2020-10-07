port java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Arithmetic {
    int add(int a, int b) {
        return a + b;
    }
}
class Adder extends Arithmetic {}
public class Solution{
    public static void main(String []args){
        
        Adder adder = new Adder();
        
        System.out.println("My superclass is: " + adder.getClass().getSuperclass().getName());	
        
        System.out.print(adder.add(10,32) + " " + adder.add(10,3) + " " + adder.add(10,10) + "\n");
     }
