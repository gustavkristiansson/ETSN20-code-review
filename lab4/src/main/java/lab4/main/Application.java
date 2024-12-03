package lab4.main;

public class Application {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Two arguments needed, e.g. file to search and pattern to match");
            return;
        }
        String input = args[0];
        String pattern = args[1];
        new Parser(input, pattern);
    }
}
