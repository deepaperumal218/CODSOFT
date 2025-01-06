import java.util.Scanner;

public class Grade
{
    void calculate(){
        int marks[] = new int[6];
        int i;
        float total=0, avg_percent;
        Scanner scanner = new Scanner(System.in);
        System.out.print("The number of subject is ");
        int n=scanner.nextInt();
        for(i=0; i<n; i++) { 
            System.out.print("Enter Marks of Subject"+(i+1)+":");
            marks[i] = scanner.nextInt();
            total = total + marks[i];
        }
        scanner.close();
        avg_percent=((total/n));
        System.out.println("the total score is"+total);
        System.out.println("The student percentage is: "+avg_percent);
        System.out.println("The student Grade is: ");
        if(avg_percent>=90){
            System.out.print("o");
        }
        else if((avg_percent>=80) && (avg_percent<90)){
            System.out.print("A");
        } 
        else if((avg_percent>=70) && (avg_percent<80)){
            System.out.print("B");
        }
        else if ((avg_percent>=60) && (avg_percent<70)){
            System.out.print("C");
        }
        else{
            System.out.print("fail"); 
        }
    }
    public static void main(String args[]){
        Grade g=new Grade();
        g.calculate();
        
    }
}