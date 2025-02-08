package Day2;

public class LowtoUpper {
    

    public static void main(String[] args) {
     
                
        String S1="ArJuN";
        System.out.println("given String is "+S1);
        char[] charA = S1.toCharArray();
        for(int i=0;i<charA.length;i++)
        {
            if(charA[i]>=65 && charA[i]<=90)
            {
                charA[i]=(char)(charA[i]+32);
            }
            else{
                charA[i]=(char)(charA[i]-32);
            }
        }
         

       System.out.println(charA);
    }
}
/*
 * 
 * 
 * 
 * 
 * 
 */