package ui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CreateMenuUI extends JFrame implements IButtonCode {

    private JPanel contentPane;
    private JTextField txtSubjectName;
    private JTextField txtLessonName;
    private JTextField txtPageInStudentBook;


    public CreateMenuUI() {
        setTitle("StudyGuide");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 910, 647);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("Create a new Study Guide!");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
        lblNewLabel.setBounds(222, 11, 416, 37);
        contentPane.add(lblNewLabel);

        JLabel label = new JLabel("\u0418\u043C\u0435 \u043D\u0430 \u0443\u0440\u043E\u043A\u0430:");
        label.setFont(new Font("Tahoma", Font.PLAIN, 29));
        label.setBounds(10, 201, 227, 36);
        contentPane.add(label);

        JLabel label_1 = new JLabel("\u0418\u043C\u0435 \u043D\u0430 \u043F\u0440\u0435\u0434\u043C\u0435\u0442\u0430:");
        label_1.setFont(new Font("Tahoma", Font.PLAIN, 29));
        label_1.setBounds(10, 147, 251, 37);
        contentPane.add(label_1);

        JLabel label_2 = new JLabel("\u0421\u0442\u0440\u0430\u043D\u0438\u0446\u0430 \u0432 \u0443\u0447\u0435\u0431\u043D\u0438\u043A\u0430:");
        label_2.setFont(new Font("Tahoma", Font.PLAIN, 29));
        label_2.setBounds(10, 248, 291, 46);
        contentPane.add(label_2);

        txtSubjectName = new JTextField();
        txtSubjectName.setBounds(271, 147, 184, 36);
        contentPane.add(txtSubjectName);
        txtSubjectName.setColumns(10);

        txtLessonName = new JTextField();
        txtLessonName.setColumns(10);
        txtLessonName.setBounds(226, 201, 360, 36);
        contentPane.add(txtLessonName);

        txtPageInStudentBook = new JTextField();
        txtPageInStudentBook.setColumns(10);
        txtPageInStudentBook.setBounds(328, 248, 92, 41);
        contentPane.add(txtPageInStudentBook);

        JButton btnAddDefinition = new JButton("\u0414\u043E\u0431\u0430\u0432\u0438 \u0434\u0435\u0444\u0438\u043D\u0438\u0446\u0438\u044F");
        btnAddDefinition.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                buttonPressedCode();
            }
        });
        btnAddDefinition.setBackground(Color.GREEN);
        btnAddDefinition.setFont(new Font("Tahoma", Font.PLAIN, 22));
        btnAddDefinition.setBounds(31, 484, 321, 74);
        contentPane.add(btnAddDefinition);

        JButton button = new JButton("\u041D\u0430\u0437\u0430\u0434");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                backButtonPressed();
            }
        });
        button.setFont(new Font("Tahoma", Font.PLAIN, 22));
        button.setBackground(Color.RED);
        button.setBounds(536, 484, 321, 74);
        contentPane.add(button);
    }

    public void buttonPressedCode() {
        CreateDefinitionUI createDefinitionUi = new CreateDefinitionUI(txtSubjectName.getText(), txtLessonName.getText(),
                Integer.parseInt(txtPageInStudentBook.getText()));
        createDefinitionUi.setVisible(true);

        CreateMenuUI createMenuUi = new CreateMenuUI();
        createMenuUi.dispose();
        dispose();
    }

    public void backButtonPressed() {
        StartMenuUI startMenuUi = new StartMenuUI();
        startMenuUi.setVisible(true);

        CreateMenuUI createMenuUi = new CreateMenuUI();
        createMenuUi.dispose();
        dispose();
    }
}
