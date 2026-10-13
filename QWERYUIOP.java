import java.util.Scanner;
class QWERTYUIOP {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        scn.nextLine();
        String original = scn.nextLine();
        System.out.println("Original String: " + original);
        String reverse = new
    StringBuilder(original).reverse().toString();
    System.out.println("Reverse String:" + reverse);
    System.out.println("Enter a string to check if it is a palindrome:");
    String palindrome = scn.nextLine();
    System.out.println("Entered String: " + palindrome);
    }
}