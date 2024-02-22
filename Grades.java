import java.util.*;
public class Grade{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int e=sc.nextInt();
       double avg=(a+b+c+d+e)/5;
       if(avg>=90)
       {
           System.out.println("Grade A");
       }
       else if(avg>=80 && avg<90)
       {
           System.out.println("Grade B");
       }
       else if(avg>=70 && avg<80)
       {
           System.out.println("Grade C");
       }
       else if(avg>=60 && avg<70)
       {
           System.out.println("Grade D");
       }
       else if(avg>=40 && avg<60)
       {
           System.out.println("Grade E");
       }
       else
       {
           System.out.println("Grade F");
       }
    }
}