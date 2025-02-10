import java.util.Scanner;

public class Demo041 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a character: ");
        char inputChar = scanner.next().charAt(0);
        char lowerChar = Character.toLowerCase(inputChar);
        if (Character.isLetter(lowerChar)) {
            
            if (lowerChar == 'a' || lowerChar == 'e' || lowerChar == 'i' || lowerChar == 'o' || lowerChar == 'u') {
                System.out.println(inputChar + " is a vowel.");
            } else {
                System.out.println(inputChar + " is a consonant.");
            }
        } else {
            System.out.println(inputChar + " is not a letter.");
        }
        
        scanner.close();
    }
}
