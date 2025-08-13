import java.util.Scanner;

public class sorting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<4;i++){
            int min=i;
            for(int j=i;j<5;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        for(int i=0;i<5;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
