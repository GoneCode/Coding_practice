import java.util.Scanner;

public class LoopsExample{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        System.out.println("Using for loop:");
        for(int i=0;i<=num;i++){
            System.out.print(i+"");
        }
        System.out.println("\nUsing while loop:");
        int j=0;
        while(j<=num){
            System.out.print(j+"");
            j++;
        }
        System.out.println("\nUsing do-while loop:");
        int k=0;
        do{
            System.out.print(k+"");
            k++;
        }while(k<=num);
    }
}