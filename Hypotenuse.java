import java.util.*;
public class Angle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        double c,d ;
        d = (a*a)+(b*b);
        c = Math.sqrt(d);
        System.out.printf("%.2f",c);
        
    }
}