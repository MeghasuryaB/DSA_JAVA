import java.util.*;
public class primefactors {
    static void primefactors1(int n){
        int i=2;
        
        while(n>1){
        while(n%i==0){
            System.out.println(i);
            n=n/i;
        }
        i++;
    }


    }


    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        primefactors1(n);
    
    
    
    }
}
