import java.util.Scanner;

public class linearsearch{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        } 
        int k=sc.nextInt();
        System.out.println("Element "+k+" found at:"+search(arr, k));
    }
    public static int search(int[] arr,int k){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==k){
                return i+1;
            }
        }
        return -1;
    }
}