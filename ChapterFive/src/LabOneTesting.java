/*
* Kristina Bogin
* 
* March 31, 2024
* 
* CS A170
*/
import java.util.Scanner;
/**
 * Task 1, Lab 1, Chapter 5. 
 * This program contains 3 methods, a main, square1, and square2. 
 * The square methods calculate the square of a given number. 
 */
public class LabOneTesting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Input an integer: ");
        int num1 = in.nextInt();
        square1(num1);
        
        System.out.print("Input an integer: ");
        int num2 = in.nextInt();
        System.out.println("The result is " + square2(num2));
        
        //scanner.close();
    }
    
    public static void square1(int num) {
        int result = num * num;
        System.out.println("The result is " + result);
    }
    
    public static int square2(int num) {
        return num * num;
    }
}
