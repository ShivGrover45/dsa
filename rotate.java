import java.util.Scanner;

public class rotate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
      // leftRotatebyK(arr, 3);
      /* for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
       }*/
       rightRotate(arr, 3);
       for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
       }
    }
    public static int[] leftRotate(int[] arr){
        int n=arr.length;
        int temp=arr[0];
        for(int i=1;i<n;i++){
            arr[i-1]=arr[i];
        }
        arr[n-1]=temp;
        
        return arr;
    }
    public static void leftRotatebyK(int[] arr ,int k){
        reverse(arr,0,arr.length-1);
        reverse(arr,0,k-1);
        reverse(arr,k,arr.length-1);
        
    }
    public static int[] reverse(int[] arr,int l,int r){
        while(l<=r){
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
        return arr;
    }
    public static void rightRotate(int[] arr,int k){
        k%=arr.length;
        reverse(arr,arr.length-k,k-1);
        reverse(arr,0,k-1);
        reverse(arr,0,arr.length-1);
    }
}
