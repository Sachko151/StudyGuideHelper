package ui;

import modules.Definition;
import modules.Lesson;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.*;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

public class CreateDefinitionUI extends JFrame {

    private JPanel contentPane;
    private JTextField txtDefinition;
    private static final String DIRECTORY_FINAL = "C:\\Users\\8530w\\Desktop\\Java\\GeographyHelper\\src\\textContent";


    public CreateDefinitionUI(String subjectName, String lessonName, int pageInStudentBook) {
        setTitle("StudyGuide");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 902, 616);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("\u0414\u043E\u0431\u0430\u0432\u0438 \u0434\u0435\u0444\u0438\u043D\u0438\u0446\u0438\u044F \u043A\u044A\u043C \u0443\u0440\u043E\u043A\u0430");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 29));
        lblNewLabel.setBounds(205, 11, 439, 45);
        contentPane.add(lblNewLabel);

        txtDefinition = new JTextField();
        txtDefinition.setBounds(10, 110, 776, 216);
        contentPane.add(txtDefinition);
        txtDefinition.setColumns(10);

        JButton btnDefContinue = new JButton("\u041F\u0440\u043E\u0434\u044A\u043B\u0436\u0438");
        btnDefContinue.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                buttonPressedCode(subjectName, lessonName, pageInStudentBook);
            }
        });
        btnDefContinue.setBackground(Color.GREEN);
        btnDefContinue.setFont(new Font("Tahoma", Font.PLAIN, 29));
        btnDefContinue.setBounds(32, 463, 328, 104);
        contentPane.add(btnDefContinue);

        JButton btnDefBack = new JButton("\u041D\u0430\u0437\u0430\u0434");
        btnDefBack.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                backButtonPressed(subjectName, lessonName, pageInStudentBook);
            }
        });
        btnDefBack.setBackground(Color.RED);
        btnDefBack.setFont(new Font("Tahoma", Font.PLAIN, 29));
        btnDefBack.setBounds(518, 463, 328, 104);
        contentPane.add(btnDefBack);
    }

    public void buttonPressedCode(String subjectName, String lessonName, int pageInStudentBook) {
        CreateMenuUI createMenuUi = new CreateMenuUI();
        createMenuUi.setVisible(true);
        CreateDefinitionUI createDefinitionUi = new CreateDefinitionUI(subjectName, lessonName, pageInStudentBook);
        createLessonAndDefinitions(subjectName, lessonName, pageInStudentBook);
        createDefinitionUi.dispose();
        dispose();
    }

    public void backButtonPressed(String subjectName, String lessonName, int pageInStudentBook) {
        CreateMenuUI createMenuUi = new CreateMenuUI();
        createMenuUi.setVisible(true);
        CreateDefinitionUI createDefinitionUi = new CreateDefinitionUI(subjectName, lessonName, pageInStudentBook);
        createDefinitionUi.dispose();
        dispose();
    }

    public void createLessonAndDefinitions(String subjectName, String lessonName, int pageInStudentBook){
        Lesson lesson = new Lesson(subjectName, lessonName, pageInStudentBook);
        String definitionData = "\n" + txtDefinition.getText();
        definitionData = definitionData.replaceAll(">", "\n");
        Definition definition = new Definition(lesson.getSubjectName(), lesson.getLessonName(),
                lesson.getPageInStudentBook(), definitionData);
        ArrayList<String> definitions = new ArrayList<String>();
        definitions.add(definition.getData());

        lesson.setDefinitions(definitions);
        Path path = Paths.get(DIRECTORY_FINAL, lesson.getLessonName()+".txt");
        lesson.create(path, lesson.getMajorInfo());
        Path addToContent = Paths.get(DIRECTORY_FINAL, "content.txt");
        try {
            Files.write(addToContent, (lessonName+"\n").getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.out.println("Error saving into content");
        }
    }
}
