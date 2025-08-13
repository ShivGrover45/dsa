import java.util.Scanner;

public class rec {

  public static void natural(int i,int n){
    if(i<n){
        return;
    }
    System.out.println(i);
    natural(--i, n);
  }

  public static void revNatural(int i,int n){
    if(i>n){
        return;
    }
    revNatural(i+1, n);
    System.out.println(i);
  }

  public static void sum(int i,int n,int s){
    if(i>n){
      System.out.println(s);
        return;
    }
    
     sum(i+1,n, s+i);
     
  }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
      
        int n=scanner.nextInt();
        //revNatural(1, n);
      sum(1,n,  0);
       
        scanner.close();
    }
    
}
