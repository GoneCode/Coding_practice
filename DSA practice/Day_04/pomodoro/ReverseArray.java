package Day_04.pomodoro;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many intergers you need to add in array ? ");

        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the numbers on by one");
        for(int i =0;i<n;i++){
            int num = sc.nextInt();
            arr[i]=num;
        }
        reverseArrayfun(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void reverseArrayfun(int[] arr){
        for(int i =0;i<arr.length/2;i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
    }

}