import java.util.Scanner;

public class rev2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        reverse(arr,0);
        sc.close();
    }

    public static void reverse(int[] arr,int i){

        if(i>=arr.length/2){
            printArray(arr);
            return ;
        }
        
            int temp=arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;
        
        reverse(arr, i+1);
    }
    static void printArray(int [] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
