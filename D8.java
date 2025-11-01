import java.util.Scanner;
import java.util.Random;

public class D8 {
    public static void main(String[] args) {
    System.out.println("Hello,Welcome to rock paper scissors game");
    Scanner sc=new Scanner(System.in);
    Random rand=new Random();
    System.out.println("Choose input: 1 for Rock, 2 for Paper, 3 for Scissors");
    int user=sc.nextInt();
    int com=(int)(Math.random()*3)+1;
    System.out.println("Computer chose: "+com);
    if(user==com){
        System.out.println("It's a tie!");
    }
    else if(user==1 && com==3){
        System.out.println("You win!");
    }
    else if(user==3 && com==2){
        System.out.println("You win");
    }
    else if(user==1 && com==2){
        System.out.println("You win");
    }
    else{
        System.out.println("Computer wins!");
}
    }}

