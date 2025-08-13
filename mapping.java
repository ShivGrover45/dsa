import java.util.HashMap;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthTextAreaUI;

public class mapping {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=5;
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        HashMap<Integer,Integer> value=new HashMap<Integer,Integer>();
        for(int i=0;i<size;i++){
            value.put(arr[i], value.getOrDefault(arr[i], 0) + 1);
        }

        int q=sc.nextInt();
        while(q>0){
            int number=sc.nextInt();
            System.out.println(value.get(number));
            q--;
        }
    }
}
