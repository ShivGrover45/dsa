import java.util.Scanner;

public class secondlarge {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ans=seondLargestElement(arr);
        System.out.println(ans);
    }
    public static int seondLargestElement(int[] arr){
        int large=arr[0];
        int slarge = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>large){
                large=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>slarge && arr[i]!=large){
                slarge=arr[i];
            }
       }
        return slarge;
    }
}