import java.util.*;
public class Average{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int avg = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c;
        c = (3*avg)-(a+b);
        System.out.printf("%d",c);
    }
}