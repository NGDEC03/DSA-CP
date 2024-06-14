import java.util.*;
public class Main {
    public static void main(String[] args) {
        int[]arr={4,5,1,2,3};
        for(int i=0;i<arr.length;i++){
            while(arr[i]!=i+1){
                int index=arr[i]-1;
                swap(i,index,arr);
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int i,int index,int[]arr){
        int temp=arr[i];
        arr[i]=arr[index];
        arr[index]=temp;
    }
}
