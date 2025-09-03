import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Choose color
        System.out.println("Choose a color for your line:");
        System.out.println("1. Red");
        System.out.println("2. Green");
        System.out.println("3. Yellow");
        System.out.println("4. Blue");
        System.out.println("5. Purple");
        System.out.println("6. Cyan");
        System.out.print("Enter number (1-6): ");
        int colorChoice = scanner.nextInt();
        scanner.nextLine(); // consume newline

        String colorCode = ConsoleColors.RESET;
        switch (colorChoice) {
            case 1: colorCode = ConsoleColors.RED; break;
            case 2: colorCode = ConsoleColors.GREEN; break;
            case 3: colorCode = ConsoleColors.YELLOW; break;
            case 4: colorCode = ConsoleColors.BLUE; break;
            case 5: colorCode = ConsoleColors.PURPLE; break;
            case 6: colorCode = ConsoleColors.CYAN; break;
            default: colorCode = ConsoleColors.RESET;
        }

        // Choose character
        System.out.print("Enter a character to draw: ");
        char drawChar = scanner.nextLine().charAt(0);

        // Choose length
        System.out.print("Enter line length (number): ");
        int length = scanner.nextInt();

        // Create Line object
        Line line = new Line(colorCode, drawChar, length);

        // Display the line
        System.out.println("Here is your line:");
        line.display();

        scanner.close();
    }
}