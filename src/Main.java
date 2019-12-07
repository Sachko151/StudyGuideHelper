import modules.Definition;
import modules.Lesson;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Lesson lesson = new Lesson("Biology", "Biology lesson", 5);
        Definition definition = new Definition(lesson.getSubjectName(), lesson.getLessonName(), 5, "BIOLOGY DATA HERE!");
        Definition definition2 = new Definition(lesson.getSubjectName(), lesson.getLessonName(), 5, "BIOLOGY DATA HERE!2");
        ArrayList<String> definitions = new ArrayList<String>();
        definitions.add(definition.getData());
        definitions.add(definition2.getData());
        lesson.setDefinitions(definitions);
        String directory = "C:\\Users\\8530w\\Desktop\\Java\\GeographyHelper\\src\\textContent";
        String fileName = "sample.txt";
        String content = lesson.getLessonName() + lesson.getSubjectName() + lesson.getPageInStudentBook() +
                "\n" + lesson.getDefinitions();
        Path path = Paths.get(directory, fileName);
        lesson.read(path);


    }
    public void testPlaceholders(){

    }
}
