import java.util.Scanner;

/***
* Question:Get a number from user and add 2 to that number and print the result.
  Example:Input :45 Output 47. Input:56789 Output:56791
    */

public class q1 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter tow add number:");
       int num = input .nextInt();
       int add =num + 2;
       System.out.println(add);
        

        
        
        
        
        input.close();

    }

  
}