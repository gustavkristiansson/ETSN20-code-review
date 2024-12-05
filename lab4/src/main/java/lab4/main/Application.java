package lab4.main;

public class Application {
    public static void main(String[] args) {
        if (args.length < 3 || !args[0].equals("search")) {
            System.out.println("Three arguments needed, e.g. <search> <file> <pattern>");
            return;
        }

        String input = args[1];
        String pattern = args[2];
        new Parser(input, pattern);
    }
}
