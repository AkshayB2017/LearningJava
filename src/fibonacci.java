import java.io.*;
import java.util.Scanner;
public class fibonacci{ 
    static boolean isPerfectSquare(int x) 
    { 
        int s = (int) Math.sqrt(x); 
        return (s*s == x); 
    } 
       
 
    static boolean isFibonacci(int n) 
    { 
         return isPerfectSquare(5*n*n + 4) || 
               isPerfectSquare(5*n*n - 4); 
    }   
    public static void main(String[] args) 
    { 
       int n;
       Scanner s=new Scanner(System.in);
       n=Integer.parseInt(s.nextLine());
    	System.out.println(isFibonacci(n) ?  n +  " is a Fibonacci Number" : 
                                                  n + " is a not Fibonacci Number"); 
    } 
} 
