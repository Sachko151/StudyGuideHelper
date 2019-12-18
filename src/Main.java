import modules.Definition;
import modules.Lesson;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;

public class Main {
    public static final String DIRECTORY = "C:\\Users\\8530w\\Desktop\\Java\\GeographyHelper\\src\\textContent";

    public static void main(String[] args) {

        String fileName = "content.txt";
        Path path = Paths.get(DIRECTORY, "content.txt");
        try {
            List<String> list = Files.readAllLines(path);
            String[] titles = new String[list.size()];
            for (int i = 0; i < list.size(); i++) {
                titles[i] = list.get(i);
                System.out.println(titles[i]);
            }
        } catch (IOException e) {
            System.out.println("Error reading file");
        }

    }


}
