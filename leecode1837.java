import java.util.Scanner;

public class leecode1837 {
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
          int k=sc.nextInt();
        System.out.println(baseK(n,k));
    }
    public static int baseTwo(int n){
        int binary=0;
        int count=0;
        while(n!=0){
            int rem=n%2;
            double c=Math.pow(10,count);
            binary+=rem*c;
            n/=2;
            count++;
        }
        return binary;
    }
    public static int baseK(int n,int k){
        int base=0;
        int count=0;
        while(n!=0){
            int rem=n%k;
            double c=Math.pow(10,count);
            base+=rem*c;
            n/=k;
            count++;
        }
        return base;
    }
}
