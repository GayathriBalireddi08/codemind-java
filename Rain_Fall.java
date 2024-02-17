import java.util.*;
public class Max{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a<3)
        {
            System.out.print("LIGHT");
        }
        else if(a>=3 && a<7)
        {
            System.out.print("MODERATE");
        }
        else
        {
            System.out.print("HEAVY");
        }
    }
}