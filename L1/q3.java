// Question:Get a number from user and multiply 3 to that number and print the
// result.
// Example:Input: 45 Output 135. Input: 1200 Output: 3600

import java.util.Scanner;

public class q3 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter three multiply number: ");
            int num = input.nextInt();
            int mul = (num*3);
            System.out.println(mul);
            
            input.close();
        }
    
}
