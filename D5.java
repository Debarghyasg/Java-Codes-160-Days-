import java.util.Scanner;
public class D5 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number:");
        int a=sc.nextInt();
        System.out.println("Enter 2nd number:");
        
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println("sum:"+sum);
        if(b>a){
            int diff=b-a;
            System.out.println("Difference:"+diff);
        }
        else{
            int diff=a-b;
            System.out.println("Difference:"+diff);
        }
        System.out.println("Product:"+(a*b));
        if(b!=0){
            System.out.println("Quotient:"+(a/b));
        }
        else{
            System.out.println("Quotient: Division by zero error");
        }
    }};



