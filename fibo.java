import java.util.Scanner;

public class fibo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        sc.close();
        for(int i=0;i<n;i++)
        {
        System.out.print(Fibo(i)+" ");
        }
       
    }
    static int Fibo(int n){
        if(n<=1) return n;
        return Fibo(n-1)+Fibo(n-2);
    }
}
