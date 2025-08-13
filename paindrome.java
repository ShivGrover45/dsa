import java.util.Scanner;

public class paindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       String s=sc.nextLine();
      boolean result= palindrome(s, 0);
      System.out.println(result);
    }
    static boolean palindrome(String s,int i){
        if(i>=s.length()/2) return true;
        if(s.charAt(i)!=s.charAt(s.length()-i-1)){
            return false;
        }
        return palindrome(s,i+1);
    }
}
