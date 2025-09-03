public class Line {
    private String colorCode;
    private char drawChar;
    private int length;

    // Constructor
    public Line(String colorCode, char drawChar, int length) {
        this.colorCode = colorCode;
        this.drawChar = drawChar;
        this.length = length;
    }

    // Display the line in the chosen color
    public void display() {
        System.out.print(colorCode);
        for (int i = 0; i < length; i++) {
            System.out.print(drawChar);
        }
        System.out.println(ConsoleColors.RESET); // Reset color after the line
    }

    // Getters and setters (optional, for practice)
    public String getColorCode() {
        return colorCode;
    }

    public void setColorCode(String colorCode) {
        this.colorCode = colorCode;
    }

    public char getDrawChar() {
        return drawChar;
    }

    public void setDrawChar(char drawChar) {
        this.drawChar = drawChar;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
