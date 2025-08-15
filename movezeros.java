import java.util.Scanner;

public class movezeros {

    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        moveZero(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" "  );
        }
    }
    public static void  moveZero(int[] arr){ //using two pointer approach 
        int j=-1;
        //finding the first zero
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }
        if(j==-1) return ;
        for(int i=j+1;i<arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                 arr[i]=arr[j];
                 arr[j]=temp;
                j++;
            }
        }
    }
}