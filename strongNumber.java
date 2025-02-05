public class strongNumber {
    public static void main(String[] args) {
        System.out.println("hello world");

     System.out.println(factorial(5));
       System.out.println("145 nga");
     System.out.println(isStrong(145)?"yes":"no");

    }

    static boolean isStrong(int n)
    {
        int sum=0;
        int a=n;
        while(n!=0)
        {
            int r=n%10;
            sum=sum+factorial(r);
            n/=10;
        }

        if(sum==a){
            return true;
        }
        else{
            return false;
        }
    }
    static int factorial(int n)
    {
        int res=1;
        for(int i=2;i<=n;i++)
        {
            res=res*i;
        }
        return res;
    }
}
