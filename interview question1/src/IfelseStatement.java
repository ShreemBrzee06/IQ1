import java.util.Scanner;
//10) Write a Java program to demonstrate if..else statement ?
public class IfelseStatement
{
    public static void main(String[] args)
    {
        method1();
        method2();
    }
    //___________________________________________________________________________________________________________
    // method 1:
   public static void method1(){
       Scanner sc = new Scanner(System.in);
       System.out.println("Please enter a number: ");
       int num = sc.nextInt();

       if(num<0){
           System.out.println("Entered number is "+ num+" "+"so"+" " +"I am in if loop");
       }else{
           System.out.println("Entered number is " +num + " "+"so"+" " + "I am in else loop");
       }
    }
//________________________________________________________________________________________________________
    // 2nd method

    public static void method2()
    {
        Scanner n = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num1 = n.nextInt();
        boolean flag = false;
        for(int i =2; i<num1;i++){
            if(num1%2==0){
                flag = true;
                break;
            }
        }if(!flag){
        System.out.println(num1+ " "+"is a Prime Number.");
            }else{
        System.out.println(num1+ " "+"is not a Prime Number.");
    }
   }


}
