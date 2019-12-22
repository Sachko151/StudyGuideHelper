package ui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReadLessonUI extends JFrame implements IButtonCode {

	private JPanel contentPane;
	public static final String DIRECTORY = "C:\\Users\\8530w\\Desktop\\Java\\GeographyHelper\\src\\textContent";

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public ReadLessonUI(String getTitleOfContentToRead) {
		setTitle("StudyGuide");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 899, 653);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u041F\u0440\u0435\u0434\u043C\u0435\u0442:");
		label.setFont(new Font("Tahoma", Font.PLAIN, 29));
		label.setBounds(10, 11, 149, 35);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u0421\u0442\u0440\u0430\u043D\u0438\u0446\u0430:");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 29));
		label_1.setBounds(350, 11, 149, 35);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("\u0417\u0430\u0433\u043B\u0430\u0432\u0438\u0435:");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 29));
		label_2.setBounds(121, 75, 149, 35);
		contentPane.add(label_2);
		
		JTextArea txtContent = new JTextArea();
		txtContent.setBounds(10, 144, 835, 460);
		contentPane.add(txtContent);
		txtContent.setText(textToBeDisplayed(getTitleOfContentToRead));
		
		JButton btnReadActBack = new JButton("\u041D\u0430\u0437\u0430\u0434");
		btnReadActBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonPressedCode();
			}
		});
		btnReadActBack.setBackground(Color.RED);
		btnReadActBack.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnReadActBack.setBounds(680, 11, 165, 37);
		contentPane.add(btnReadActBack);
		
		JLabel lblSubjectName = new JLabel(setSubjectName(getTitleOfContentToRead));
		lblSubjectName.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblSubjectName.setBounds(145, 11, 195, 35);
		contentPane.add(lblSubjectName);
		
		JLabel lblPage = new JLabel(setPage(getTitleOfContentToRead));
		lblPage.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblPage.setBounds(490, 11, 149, 35);
		contentPane.add(lblPage);
		
		JLabel lblLessonName = new JLabel(getTitleOfContentToRead);
		lblLessonName.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblLessonName.setBounds(257, 75, 411, 35);
		contentPane.add(lblLessonName);
	}
	public void buttonPressedCode() {
		ReadLessonMenuUI readLessonMenuUi = new ReadLessonMenuUI();
	readLessonMenuUi.setVisible(true);
		
		ReadLessonUI readLessonUi = new ReadLessonUI(null);
		readLessonUi.dispose();
		dispose();
	}
	@Override
	public void backButtonPressed() {
		// TODO Auto-generated method stub
		
	}
	private String textToBeDisplayed(String getTitleOfContentToRead){
		String content = "";
		String fileName = getTitleOfContentToRead + ".txt";
		Path path = Paths.get(DIRECTORY, fileName);
		try {
			List<String> list = Files.readAllLines(path);
			content = list.toString();
		} catch (IOException e) {
        }
		return content;
	}
	private String setSubjectName(String getTitleOfContentToRead){
        String fileName = getTitleOfContentToRead + ".txt";
        Path path = Paths.get(DIRECTORY, fileName);
        String subjectName = "";
        try {
            List<String> list = Files.readAllLines(path);
            subjectName = list.get(0);
        } catch (IOException | IndexOutOfBoundsException e) {
            subjectName = "Empty";
        }
        return subjectName;
    }
    private String setPage(String getTitleOfContentToRead){
        String fileName = getTitleOfContentToRead + ".txt";
        Path path = Paths.get(DIRECTORY, fileName);
        String subjectName;
        try {
            List<String> list = Files.readAllLines(path);
            subjectName = list.get(2);
        } catch (IOException | IndexOutOfBoundsException e) {
            subjectName = "00";
        }
        return subjectName;
    }
    }

