import java.util.Scanner;

public class charHashing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int q=sc.nextInt();
        int[] hash =new int[256];
        for(int i=0;i<s.length();i++){
            hash[s.charAt(i)]+=1;
        }
        while(q>0){
            char ch=sc.next().charAt(0);
            System.out.println(hash[ch]);
            q--;
        }
        sc.close();
    }
    
}
