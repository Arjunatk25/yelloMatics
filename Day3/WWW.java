package Day3;

import java.util.Scanner;

public class WWW {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine().toLowerCase();

        String[] arr = s1.split(" ");

        int len = arr.length;
        String result = "";

        for (int d = 0; d < len; d++) {
            char[] ch = arr[d].toCharArray();
            int i = 0, j = ch.length - 1, n = ch.length;
            int sum = 0;
            if (n % 2 == 0) {
                while (i < j) {
                    sum += ((ch[i] - 'a') - (ch[j] - 'a'));
                    i++;
                    j--;
                }
            } else {
                while (i < j) {
                    sum += ((ch[i] - 'a') - (ch[j] - 'a'));
                    i++;
                    j--;
                }
                sum += ch[n / 2] - 96;
            }
            result += sum;

        }

        System.out.println(result);
    }
}
