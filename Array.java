import java.util.Scanner;

public class Array{
    //initialize the array
    static int[] numbers = new int[5];
    //Declare the sum variable global
    static int sum = 0;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 5 numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        int sum = Sum(numbers);
        double average = Average(numbers);
        int max = maxNumber(numbers);
        System.out.println("The sum of the 5 numbers are " + sum);
        System.out.println("The average of the 5 numbers are " + average);
        System.out.println("The maximum number is " + max);
    }
    public static int Sum(int[] arr){

        for(int i =0; i<numbers.length; i++){
            sum+=arr[i];
        }
        return sum;
    }
    public static double Average(int[] arr){
        double avg;
        avg = (double) sum / numbers.length;
        return avg;
    }

    public static int maxNumber(int[] arr){
        int max = numbers[0];
        for (int i =0; i < numbers.length; i++){
            if(numbers[i] > max){
                max = numbers[i];
            }
        }
        return max;
    }



}
