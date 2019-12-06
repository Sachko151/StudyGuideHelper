package modules;

import java.util.ArrayList;

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
    public void create() {

    }

    @Override
    public void read() {
        System.out.println("Lesson name is " + this.lessonName + " and the definitions are " + this.definitions);
    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }
}
