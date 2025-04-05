// Question:Get a number from user and divide by the number by 6 and print the
// quotient.
// Example:Input: 45 Output 7. Input: 143 Output: 23

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the number: ");
    int num = input.nextInt();
    int div = num /6;
    System.out.println(div);
    input.close();

    }

    
}
