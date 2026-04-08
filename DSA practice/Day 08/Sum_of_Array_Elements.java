import java.util.*;

public class Sum_of_Array_Elements{
    public static void main(String[] args){
        int arr[] = {1,34,69,01,-1};
        int sum = 0;
        for(int num : arr){
            sum = sum + num;
        }
        System.out.println(sum);
    }
}