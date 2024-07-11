import java.util.Scanner;
class Question1{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();
        sc.nextLine();
        String addr = sc.nextLine();
        System.out.println("my name is " + name);
        System.out.println("my age is " +age);
        System.out.println("my address is "+addr);

    }
}