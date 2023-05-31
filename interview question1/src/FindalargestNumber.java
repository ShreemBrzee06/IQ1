import java.util.Arrays;
//9) Write a Java program to find the largest number?
public class FindalargestNumber
{     static int array [] ={5,8,2,1,90,80,15};
    public static void main(String[] args) {
   //1st method:
       int d = Arrays.stream(array).max().getAsInt();
       System.out.println( "The largest Number is: "+ d);
   //2nd method:
  //___________________________________________________________________________________//
       int maxNumber= findaLargestNumber();
       System.out.println("The Largest Number using for loop is: " + maxNumber);
    }

    public static int findaLargestNumber()
    {
        int max = array[0];
        for(int i=0; i<array.length;i++){

            if(array[i]>max){
                max= array[i];
            }

        }return max;
    }

}
