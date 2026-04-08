import java.util.Scanner;
import java.util.*;

public class Find_Maximum_and_Minimum{
    public static void main(String[] args){
        // Input: `[3, 5, 1, 8, 2, 9]`
        int[] arr = {55,50,1,0,2,9,-1};
        int min = arr[0];
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("min "+min+" and "+"max "+max);
    }
}