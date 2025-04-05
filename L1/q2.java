// * Question:Get a number from user and subtract 5 to that number and print the
// result.
// Example:Input :45 Output 40. Input:56789 Output:56784

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
       Scanner input =new Scanner(System.in);
        System.out.println("Enter a subtract number:");
        int num = input.nextInt();
        int sub= num-5;
        System.out.println(sub);
       
        input.close();
    }
    
}
