import java.util.Scanner;

//Write a Java program to convert from Fahrenheit to Celsius?
public class FarenheittoCelcius
{
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Please enter your Fahrenheit Temperature:");
        int fahreheitTemp = n.nextInt();
        int celsius = ((fahreheitTemp-32)*5)/9;
        System.out.println("Your temperature from Fahrenheit to Celsius is: " + celsius);

    }



}
