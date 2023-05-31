import java.util.Scanner;

//Write a Java program to swap two numbers without using third variable?
public class SwappingtwoNumberswithoutThirdVar
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the value of x: ");
        int x = sc.nextInt();
        System.out.println("Please enter the value of y: ");
        int y= sc.nextInt();
        System.out.println("before swapping the value of x:" +x + " and the value of y :" + y);
        x= x+y; // gives total value to x
        y=x-y;  // assigning original value x to y by using subtraction method
        x=x-y;  // assigning original value of y  to x.

        System.out.println("after swapping the value of x: " + x +" "+ "and the value of y: " +y);
    }
}
