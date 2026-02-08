import java.util.*;

public class primenum {
    static void sieve(int n){
        boolean[] prime=new boolean[n+1];
        for(int i=2;i<=n;i++){
            for(int j=i*i;j<=n;j=j+i){
                prime[j]=true;
            }
        }
        for(int j=2;j<=n;j++)
        {
            if(prime[j]==false){
                System.out.println(j);
            }
        }

    }
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       
       sieve(n);
       s.close();

    }
}
