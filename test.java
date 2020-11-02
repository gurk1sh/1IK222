public class test {
    public static void main(String[] args) {
        String x = "madam";
        String y = "test";
        System.out.println(isPalindrom(x, 0,x.length() - 1));
        System.out.println(isPalindrom(y, 0,y.length() - 1));
    }

    public static boolean isPalindrom(String str, int p, int q) //Check if the word is a palindrome
    {
        if (q <= p)
        {
          return true;
        }
        else if (str.charAt(p) != str.charAt(q))
        {
            return false;
        }
        else
        {
            return isPalindrom(str, p+1,q-1);
        }
    }
}
