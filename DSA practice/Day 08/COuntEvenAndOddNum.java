import java.util.*;

public class COuntEvenAndOddNum{
    public static void main(String[] args){
        int[] arr = {12,3,4,5,1,0,22,33,445,55,-1,-10};
        int odd =0;
        int even=0;
        for(int num : arr){
            if(num %2 == 0){
                even++;
            }else{
                odd++;
            }
        }
        System.out.println("Number of even num "+even);
        System.out.println("Number of odd num "+ odd);
    }
}