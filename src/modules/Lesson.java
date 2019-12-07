package modules;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class Lesson implements IHasKeyFeatures {
    String subjectName;
    String lessonName;
    int pageInStudentBook;
    ArrayList<String> definitions;

    public Lesson(String subjectName, String lessonName, int pageInStudentBook) {
        this.subjectName = subjectName;
        this.lessonName = lessonName;
        this.pageInStudentBook = pageInStudentBook;
    }


    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getLessonName() {
        return lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    public ArrayList<String> getDefinitions() {
        return definitions;
    }

    public void setDefinitions(ArrayList<String> definitions) {
        this.definitions = definitions;
    }

    public int getPageInStudentBook() {
        return pageInStudentBook;
    }

    public void setPageInStudentBook(int pageInStudentBook) {
        this.pageInStudentBook = pageInStudentBook;
    }

    @Override
    public void create(Path path, String content) {
        try {
            Files.write(path, content.getBytes(), StandardOpenOption.CREATE);
        } catch (IOException e) {
            System.out.println("Error");
        }
    }

    @Override
    public void read(Path path) {
        try {
            List<String> list = Files.readAllLines(path);
            list.forEach(line -> System.out.println(line));
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }
}
