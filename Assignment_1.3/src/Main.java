public class Main {

    public static String reverse(String input){
        char[] in = input.toCharArray();
        int begin=0;
        int end=in.length-1;
        char temp;
        while(end>begin){
            temp = in[begin];
            in[begin]=in[end];
            in[end] = temp;
            end--;
            begin++;
        }
        return new String(in);
    }

    public static boolean isPalindrome(long x)
    {
        String s = String.valueOf(x);
        String b = reverse(s);
        if (s.equalsIgnoreCase(b))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String[] args)
    {
        int i,j;
        long prod;
        boolean ok = false;
         for (i=9999; i>=0 && !ok; i--)
         {
             for (j=i; j>=0 && !ok; j--)
             {
                 prod = i*j;
                 if (isPalindrome(prod))
                 {
                     ok=true;
                     System.out.print("The largest palindrome is:" + prod);
                 }
             }
         }
    }
}
