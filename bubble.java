import java.util.Scanner;

public class bubble {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        //bubble sort logic

        for(int i=arr.length-1;i>=1;i--){
            for(int j=0;j<=i-1;j++){
                //comparision and swap 
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        //print the sorted array
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
