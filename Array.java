import java.util.Scanner;

public class Array{
    static int[] numbers = new int[5];
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        for(int i=0; i < numbers.length; i++){
            System.out.println("Enter 5 numbers: ");
            numbers[i] = input.nextInt();
        }

    }
}