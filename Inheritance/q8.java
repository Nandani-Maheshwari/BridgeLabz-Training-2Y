class Printer {
    void print(String text) {
        System.out.println("Printing text: " + text);
    }
}

class ColorPrinter extends Printer {
    @Override
    void print(String text) {
        System.out.println("Printing in color: " + text);
    }

    void printWithColor(String text, String color) {
        System.out.println("Printing " + text + " in " + color + " color");
    }
}

public class q8 {
    public static void main(String[] args) {
        Printer p1 = new Printer();
        Printer p2 = new ColorPrinter();
        ColorPrinter cp = new ColorPrinter();

        p1.print("Hello");
        p2.print("World");
        cp.printWithColor("Hello World", "Red");
    }
}

