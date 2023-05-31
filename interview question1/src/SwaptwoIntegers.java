import java.util.Scanner;

//6) Write a Java program to swap two numbers?
public class SwaptwoIntegers {
    public static void main(String[] args) {
        int x,y,z;
        Scanner num = new Scanner(System.in);
        System.out.println("Please enter an integer: ");
         x = num.nextInt();
        System.out.println("Please enter an integer: ");
         y= num.nextInt();
        System.out.println("before swappinng number\n x = " +x+"\n y = "+ y);
        z=x; x=y; y=z;
        System.out.println("after swapping number\n x = " + x +"\n y = "+ y);
        System.out.println(z);

    }
}
