import modules.Definition;
import modules.Lesson;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Lesson lesson = new Lesson("Biology", "Biology lesson", 5);
        Definition definition = new Definition(lesson.getSubjectName(), lesson.getLessonName(), 5,"BIOLOGY DATA HERE!");
        Definition definition2 = new Definition(lesson.getSubjectName(), lesson.getLessonName(),5, "BIOLOGY DATA HERE!2");
        ArrayList<String> definitions = new ArrayList<String>();
        definitions.add(definition.getData());
        definitions.add(definition2.getData());
        lesson.setDefinitions(definitions);
        //System.out.println(lesson.getDefinitions());
        lesson.read();
    }
}
