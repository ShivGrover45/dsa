import java.util.Scanner;

public class rev{

    static void reverse(int[]arr,int l,int r){
        if(l>=r){
             printArray(arr);
            return;
        }
        for(int i=0;i<arr.length;i++){
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
        }
        reverse(arr, l+1, r-1);
         
        }
    
    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
  
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        reverse(arr, 0, n-1);
        sc.close();
    }

}