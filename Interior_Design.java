import java.util.*;
public class Max{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int x,y;
        x=a+b;
        y=c+d;
        if(x<y)
        {
            System.out.println(x);
        }
        else
        {
            System.out.println(y);
        }
    }
}