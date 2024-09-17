import java.util.Scanner;

public class IT24100756Lab6Q2C {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        int sum = 0;                 

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
            sum += numbers[i];               
        }
        
        System.out.print("The numbers you entered are: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        
        System.out.println("Sum of the numbers: " + sum);
        
        double average = sum / 10.0;
        System.out.println("Average of the numbers: " + average);
    }
}
