import java.util.*;

public class CheckifArrayisSorted{
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6,2};
        boolean notSorted = false;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                notSorted = true;
            }
        }
        if(!notSorted){
            System.out.println("Array is sorted");
        }else{
            System.out.println("Array is not sorted");
        }
    }
}