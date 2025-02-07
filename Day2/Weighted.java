package Day2;

import java.util.Scanner;

public class Weighted {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine().toLowerCase();
        
        // String res= s1.replaceAll("[AEIOUaeiou]"," ");
        // Sres=res.replaceAll("\\s+","");
        // String s2=res.replaceAll("[^a-zA-Z]","")
        int op = sc.nextInt();
        int sum = 0;
        if (op == 0) {
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) >= 'a' && s1.charAt(i) <= 'z') {
                    if (s1.charAt(i) == 'a' || s1.charAt(i) == 'e' || s1.charAt(i) == 'i' || s1.charAt(i) == 'o'|| s1.charAt(i) == 'u') {
                        continue;
                    }
                    sum += s1.charAt(i) - 96;
                }
            }
        } else if(op==1) {
            for (int i = 0; i < s1.length(); i++){
                if (s1.charAt(i) >= 'a' && s1.charAt(i) <= 'z') {
                    sum += s1.charAt(i) - 96;
                }
            }
           
        }

        System.out.println(sum);

    }
}
