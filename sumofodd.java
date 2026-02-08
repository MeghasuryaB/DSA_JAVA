import java.util.Scanner;
public class sumofodd {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }     
        int sum=0;
        for(int i=0;i<n;i++){
            if(i%2!=0){
                sum=sum+a[i];
            }
        }
        System.out.print(sum);
    }
}
