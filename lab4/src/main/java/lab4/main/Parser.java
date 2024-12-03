package lab4.main;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class Parser {
    private Scanner s;
    private final String pattern;

    public Parser(String file, String pattern) {
        this.pattern = pattern;
        try {
            this.s = new Scanner(new File(file));
            findPattern();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + file);
        }
    }

    public void findPattern() {
        int i = 0;

        while(s.hasNextLine()) {
            String line = s.nextLine();
            if (line.contains(pattern)) {
                System.out.println(line + " LineNumber: " + i);
            }
            i++;
        }
    }

}