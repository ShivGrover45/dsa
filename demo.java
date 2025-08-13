import java.util.Scanner;

class demo{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={23,43,45,65,78,90};

        int ele=sc.nextInt();

        System.out.println(search(arr, ele));

    }

    public static boolean search(int[] arr,int ele){

        int s=0;
        int e=arr.length-1;
        

        while(s<=e){
    
            int m=s+(e-s)/2;
            if(arr[m]==ele) return true;

            if(ele>arr[m]){
                s=m+1;
            }
            else if(ele<arr[m]){
                e=m-1;
            }
        }
        return false;
    
}
}