import java.util.Scanner;

//12) Write a Java program to demonstrate nested if ... else  .. statement?
public class NestedifStatement
{
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num = n.nextInt();
        if(num>0){
            System.out.println("I am a positive number");
        } else if (num<0) {
            System.out.println("I am a negative number");
        }else{
            System.out.println("I am a zero number");
        }

        }
    }



