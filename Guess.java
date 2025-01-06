import java.util.Scanner;
import java.util.Random;
public class Guess{
    void guess(){
        int random, guess, attempts;
        Scanner s = new Scanner(System.in);
        Random key = new Random();
        random = key.nextInt(100)+1;
        attempts = 1; 
        System.out.print("Guess the number between 1 to 100");
        while(attempts<5) {
            guess = s.nextInt();
            if (guess==random){
                System.out.print("your guess is correct");
                break;
            }
            else{
                while (guess != random) {
                    if (guess > random) {
                        System.out.print("Lower!");
                        attempts += 1;
                        break;
                    }
                    else {
                        System.out.print("Higher!");
                        attempts +=1;
                        break;
                    } 
                }
            }
            if(attempts>5){
                System.out.print("your attempts are completed");
            }
            if(guess==random){
                switch(attempts){
                    case (1):
                    System.out.print("your score is 100");
                    break;
                
                    case (2):
                    System.out.print("your score is 90");
                    break;
                
                    case (3):
                    System.out.print("your score is 80");
                    break;
                    default:
                    System.out.print("your score is 0");
                }
            }
        } 
    }
    public static void main(String[] args) {
        Guess g=new Guess();
        g.guess();
        System.out.print("you need to continue !! press one");
        
        Scanner s = new Scanner(System.in);
        int choice=s.nextInt();
        if (choice==1){
             g.guess();
        }
    }
}
