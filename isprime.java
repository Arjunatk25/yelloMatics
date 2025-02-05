import java.util.*;

class isprime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean result = true;

        if (n <= 1)
            result = false;
        if (n % 2 == 0)
            result = false;
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                result = false;
            }
        }

        System.out.println("Given num " + n);
        System.out.println(result);
        sc.close();
    }
}