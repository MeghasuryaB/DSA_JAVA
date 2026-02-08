public class lcm {
    static int lcm(int a,int b){
        int res=0,max=0;
            if(a>b)
            max=a;
        else
            max=b;
        for(int i=max;i>=0;i++){
            if(i%a==0 && i%b==0){
                res=i;
                return(res);
            }
        }
        return 0;
    }
    public static void main(String[] args) {    
        int a=7,b=3;
        System.out.print(lcm(a,b));        
    }
}
