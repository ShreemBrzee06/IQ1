import java.util.Scanner;

//Write a Java program to add two numbers?
public class AdditonofTwoNumbers
{
    public static void main(String[] args) {
        Scanner add = new Scanner(System.in);
        System.out.println("Please enter a first number:");
        int a = add.nextInt();
        System.out.println("Please enter a second number: ");
        int b = add.nextInt();
        int c = a+b;
        System.out.println("The addition of " + a + "+"+b+ " = "+c);
    }

}
