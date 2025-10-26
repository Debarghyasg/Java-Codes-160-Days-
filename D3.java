import java.util.Scanner;
public class D3 {
    public static void main(String[] arga){
        System.out.println("Printing of numbers from user input1 to user input 2 and also in reverse order");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number:");
        int a=sc.nextInt();
        System.out.println("Enter last number:");
        int b=sc.nextInt();
        System.out.println("Numbers are: ");
        for(int i=a;i<=b;i++){
            System.out.print(i+" ");
        }
    System.out.println();
    System.out.println("Reverse order: ");
        for(int i=b;i>=a;i--){
            System.out.print(i+" ");
        }
    }
}
