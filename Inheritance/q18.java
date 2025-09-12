interface Printer {
    void print(String message);
}

class ConsolePrinter implements Printer {
    @Override
    public void print(String message) {
        System.out.println("Console: " + message);
    }
}

class FilePrinter implements Printer {
    @Override
    public void print(String message) {
        System.out.println("File: " + message);
    }
}

class Report {
    private Printer printer;

    Report(Printer printer) {
        this.printer = printer;
    }

    void generate(String content) {
        printer.print(content);
    }
}

public class q18 {
    public static void main(String[] args) {
        Report consoleReport = new Report(new ConsolePrinter());
        consoleReport.generate("Annual Report");

        Report fileReport = new Report(new FilePrinter());
        fileReport.generate("Financial Report");
    }
}

