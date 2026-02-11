import java.util.*;
public class primefactors {
    static void primefactors1(int n){
        int i=2;
        //while(n>1)
        while(i*i<=n){
        while(n%i==0){
            System.out.println(i);
            n=n/i;
        }
        i++;
    }
    if(n>1){
        System.out.println(n);
    }


    }


    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        primefactors1(n);
    
    
    
    }
}
