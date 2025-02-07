package Day2;

import java.util.Scanner;

class pin {
    public static void main(String[] args) {
       
Scanner sc= new Scanner(System.in);

     String s1= sc.nextLine();
     String res=s1.replaceAll("[\\s]", s1);
     System.out.println(res);

    }
}