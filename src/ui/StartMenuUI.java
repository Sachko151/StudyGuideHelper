package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class StartMenuUI extends JFrame implements IButtonCode{

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StartMenuUI frame = new StartMenuUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public StartMenuUI() {
		setTitle("StudyGuide");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 890, 644);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Study Guide ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 37));
		lblNewLabel.setBounds(294, 21, 233, 38);
		contentPane.add(lblNewLabel);
		
		JLabel lblBySachko = new JLabel("by Sachko151");
		lblBySachko.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblBySachko.setBounds(328, 71, 135, 27);
		contentPane.add(lblBySachko);
		
		JButton btnCreate = new JButton("Create");
		btnCreate.setBackground(Color.GREEN);
		btnCreate.setFont(new Font("Tahoma", Font.PLAIN, 34));
		btnCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				buttonPressedCode();
			}
		});
		btnCreate.setBounds(30, 446, 233, 149);
		contentPane.add(btnCreate);
		
		JButton btnRead = new JButton("Read");
		btnRead.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ReadLessonMenuUI readLessonMenuUi = new ReadLessonMenuUI();
				readLessonMenuUi.setVisible(true);
				
				StartMenuUI startMenuUi = new StartMenuUI();
				startMenuUi.dispose();
                dispose();
			}
		});
		btnRead.setBackground(Color.ORANGE);
		btnRead.setFont(new Font("Tahoma", Font.PLAIN, 34));
		btnRead.setBounds(315, 446, 233, 149);
		contentPane.add(btnRead);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DeleteLessonMenuUI deleteLessonMenuUi = new DeleteLessonMenuUI();
				deleteLessonMenuUi.setVisible(true);
				
				StartMenuUI startMenuUi = new StartMenuUI();
				startMenuUi.dispose();
                dispose();
			}
		});
		btnDelete.setBackground(Color.RED);
		btnDelete.setFont(new Font("Tahoma", Font.PLAIN, 34));
		btnDelete.setBounds(599, 446, 233, 149);
		contentPane.add(btnDelete);
		
		JLabel lblThisAppIs = new JLabel("This app is made for making study guides for upcoming exams.");
		lblThisAppIs.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblThisAppIs.setBounds(10, 209, 822, 57);
		contentPane.add(lblThisAppIs);
		
		JLabel lblSelectOneOf = new JLabel("Select one of either options to start!");
		lblSelectOneOf.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSelectOneOf.setBounds(10, 259, 822, 57);
		contentPane.add(lblSelectOneOf);
	}
	public void buttonPressedCode() {
		CreateMenuUI createMenuUi = new CreateMenuUI();
		createMenuUi.setVisible(true);
		
		StartMenuUI startMenuUi = new StartMenuUI();
		startMenuUi.dispose();
        dispose();
	}

	@Override
	public void backButtonPressed() {
		// empty no back button found
		
	}
}
