//even numbers
import java.util.Scanner;
public class even{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println("enter the input"+n);
        if (n==0)
           System.out.println("it is even");
        else if (n%2==0)
            System.out.println("it is even");
        else
            System.out.println("it is odd");
        
        
    }
}