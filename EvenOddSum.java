//java program t0 find odd or even
import java.util.Scanner;

public class EvenOddSum{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("enter the no1:" +num1);
        System.out.println("enter the no2:" +num2);
        int num3 = num1+num2;
        
         if(num3% 2 == 0){
            System.out.println(num3 + " is even");
         }
        else{
            System.out.println(num3 + " is odd");
        }
    }
}

 
