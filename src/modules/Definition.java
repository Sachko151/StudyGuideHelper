package modules;

public class Definition extends Lesson {
    String data;
    public Definition(String subjectName, String lessonName, int pageInStudentBook, String data) {
        super(subjectName, lessonName, pageInStudentBook);
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
