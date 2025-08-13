import java.util.HashMap;
import java.util.Scanner;

public class charMapping {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        HashMap<Character,Integer> values=new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++){
            values.put(s.charAt(i), values.getOrDefault(s.charAt(i),0)+1);
        }
        int q=sc.nextInt();
        while(q>0){
            char ch=sc.next().charAt(0);
            System.out.println(values.get(ch));
            q--;
        }
    }
    
}
