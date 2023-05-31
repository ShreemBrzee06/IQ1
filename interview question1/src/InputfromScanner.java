import java.util.Scanner;

//4) Write a Java program to print the input from scanner?
public class InputfromScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your Name: ");
        String s = sc.nextLine();
        System.out.println("Your entered Name is: " + s);

    }
}
