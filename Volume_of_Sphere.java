import java.util.*;
public class Volume{
    public static void main(String[] main){
        Scanner sc=new Scanner(System.in);
        int r = sc.nextInt();
        double vol;
        vol = (1.333333*3.14*r*r*r);
        System.out.printf("%.2f",vol);
    }
}