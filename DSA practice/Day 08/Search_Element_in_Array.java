import java.util.*;

public class Search_Element_in_Array{
    public static void main(String[] args){
        int arr[] = {1,2,3,4,0,2,11,2};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to search for");
        int n = sc.nextInt();
        boolean found = false;
        for(int num : arr) {
            if (num == n) {
                System.out.println("Found");
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("Not found ");
        }
    }
}