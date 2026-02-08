
import java.util.Scanner;

public class Intsum {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int total=0;
        while (n!=0){
            int digit=n%10;
            total=total+digit;
            n=n/10;
        }
        System.out.println("Total="+total);
        s.close();
    }
}
