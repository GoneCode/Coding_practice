import java.util.*;

public class SecondLargestElement{
    public static void main(String[] args){
        int arr[] = {1,3,11,33,12};
        int firstLargest = 0;
        int secondLargest = 0;
        for(int num: arr){
            if(num>firstLargest){
                secondLargest = firstLargest;
                firstLargest = num;
            }else if(num>secondLargest && num !=firstLargest){
                secondLargest = num;
            }

        }
        if(secondLargest == 0){
            System.out.println("No second largest");
        }else{
            System.out.println("SecondLargest   ---"+secondLargest);
        }
    }
}