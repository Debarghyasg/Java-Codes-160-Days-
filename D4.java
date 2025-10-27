import java.util.Scanner;
public class D4 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number:");
        int a=sc.nextInt();
        System.out.println("Enter last number:");
        int b=sc.nextInt();

        long sum = 0;
        for (int i = a; i <= b; i++) {    
            sum += i; 
        }
        System.out.println("The sum of all integers from 1 to 100 is: " + sum);
    }
}