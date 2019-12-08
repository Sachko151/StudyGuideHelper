package ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ReadLessonMenuUI extends JFrame implements IButtonCode {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReadLessonMenuUI frame = new ReadLessonMenuUI();
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
	public ReadLessonMenuUI() {
		setTitle("StudyGuide");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 901, 657);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u0418\u0437\u0431\u0435\u0440\u0438 \u043A\u043E\u0439 \u0443\u0440\u043E\u043A \u0434\u0430 \u0447\u0435\u0442\u0435\u0448!");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 29));
		lblNewLabel.setBounds(232, 11, 378, 57);
		contentPane.add(lblNewLabel);
		
		JRadioButton rdbtnTitle1 = new JRadioButton("Empty");
		rdbtnTitle1.setBounds(6, 162, 109, 23);
		contentPane.add(rdbtnTitle1);
		
		JRadioButton rdbtnTitle2 = new JRadioButton("Empty");
		rdbtnTitle2.setBounds(6, 188, 109, 23);
		contentPane.add(rdbtnTitle2);
		
		JRadioButton rdbtnTitle3 = new JRadioButton("Empty");
		rdbtnTitle3.setBounds(6, 214, 109, 23);
		contentPane.add(rdbtnTitle3);
		
		JRadioButton rdbtnTitle6 = new JRadioButton("Empty");
		rdbtnTitle6.setBounds(6, 292, 109, 23);
		contentPane.add(rdbtnTitle6);
		
		JRadioButton rdbtnTitle5 = new JRadioButton("Empty");
		rdbtnTitle5.setBounds(6, 266, 109, 23);
		contentPane.add(rdbtnTitle5);
		
		JRadioButton rdbtnTitle4 = new JRadioButton("Empty");
		rdbtnTitle4.setBounds(6, 240, 109, 23);
		contentPane.add(rdbtnTitle4);
		
		JRadioButton rdbtnTitle9 = new JRadioButton("Empty");
		rdbtnTitle9.setBounds(6, 370, 109, 23);
		contentPane.add(rdbtnTitle9);
		
		JRadioButton rdbtnTitle8 = new JRadioButton("Empty");
		rdbtnTitle8.setBounds(6, 344, 109, 23);
		contentPane.add(rdbtnTitle8);
		
		JRadioButton rdbtnTitle7 = new JRadioButton("Empty");
		rdbtnTitle7.setBounds(6, 318, 109, 23);
		contentPane.add(rdbtnTitle7);
		
		JRadioButton rdbtnTitle12 = new JRadioButton("Empty");
		rdbtnTitle12.setBounds(6, 448, 109, 23);
		contentPane.add(rdbtnTitle12);
		
		JRadioButton rdbtnTitle11 = new JRadioButton("Empty");
		rdbtnTitle11.setBounds(6, 422, 109, 23);
		contentPane.add(rdbtnTitle11);
		
		JRadioButton rdbtnTitle10 = new JRadioButton("Empty");
		rdbtnTitle10.setBounds(6, 396, 109, 23);
		contentPane.add(rdbtnTitle10);
		
		JRadioButton rdbtnTitle15 = new JRadioButton("Empty");
		rdbtnTitle15.setBounds(167, 214, 109, 23);
		contentPane.add(rdbtnTitle15);
		
		JRadioButton rdbtnTitle14 = new JRadioButton("Empty");
		rdbtnTitle14.setBounds(167, 188, 109, 23);
		contentPane.add(rdbtnTitle14);
		
		JRadioButton rdbtnTitle13 = new JRadioButton("Empty");
		rdbtnTitle13.setBounds(167, 162, 109, 23);
		contentPane.add(rdbtnTitle13);
		
		JRadioButton rdbtnTitle18 = new JRadioButton("Empty");
		rdbtnTitle18.setBounds(167, 292, 109, 23);
		contentPane.add(rdbtnTitle18);
		
		JRadioButton rdbtnTitle17 = new JRadioButton("Empty");
		rdbtnTitle17.setBounds(167, 266, 109, 23);
		contentPane.add(rdbtnTitle17);
		
		JRadioButton rdbtnTitle16 = new JRadioButton("Empty");
		rdbtnTitle16.setBounds(167, 240, 109, 23);
		contentPane.add(rdbtnTitle16);
		
		JRadioButton rdbtnTitle21 = new JRadioButton("Empty");
		rdbtnTitle21.setBounds(167, 370, 109, 23);
		contentPane.add(rdbtnTitle21);
		
		JRadioButton rdbtnTitle20 = new JRadioButton("Empty");
		rdbtnTitle20.setBounds(167, 344, 109, 23);
		contentPane.add(rdbtnTitle20);
		
		JRadioButton rdbtnTitle19 = new JRadioButton("Empty");
		rdbtnTitle19.setBounds(167, 318, 109, 23);
		contentPane.add(rdbtnTitle19);
		
		JRadioButton rdbtnTitle24 = new JRadioButton("Empty");
		rdbtnTitle24.setBounds(167, 448, 109, 23);
		contentPane.add(rdbtnTitle24);
		
		JRadioButton rdbtnTitle23 = new JRadioButton("Empty");
		rdbtnTitle23.setBounds(167, 422, 109, 23);
		contentPane.add(rdbtnTitle23);
		
		JRadioButton rdbtnTitle22 = new JRadioButton("Empty");
		rdbtnTitle22.setBounds(167, 396, 109, 23);
		contentPane.add(rdbtnTitle22);
		
		JRadioButton radioButton_23 = new JRadioButton("Empty");
		radioButton_23.setBounds(350, 162, 109, 23);
		contentPane.add(radioButton_23);
		
		JRadioButton radioButton_24 = new JRadioButton("Empty");
		radioButton_24.setBounds(350, 188, 109, 23);
		contentPane.add(radioButton_24);
		
		JRadioButton radioButton_25 = new JRadioButton("Empty");
		radioButton_25.setBounds(350, 214, 109, 23);
		contentPane.add(radioButton_25);
		
		JRadioButton radioButton_26 = new JRadioButton("Empty");
		radioButton_26.setBounds(350, 240, 109, 23);
		contentPane.add(radioButton_26);
		
		JRadioButton radioButton_27 = new JRadioButton("Empty");
		radioButton_27.setBounds(350, 266, 109, 23);
		contentPane.add(radioButton_27);
		
		JRadioButton radioButton_28 = new JRadioButton("Empty");
		radioButton_28.setBounds(350, 292, 109, 23);
		contentPane.add(radioButton_28);
		
		JRadioButton radioButton_29 = new JRadioButton("Empty");
		radioButton_29.setBounds(350, 318, 109, 23);
		contentPane.add(radioButton_29);
		
		JRadioButton radioButton_30 = new JRadioButton("Empty");
		radioButton_30.setBounds(350, 344, 109, 23);
		contentPane.add(radioButton_30);
		
		JRadioButton radioButton_31 = new JRadioButton("Empty");
		radioButton_31.setBounds(350, 370, 109, 23);
		contentPane.add(radioButton_31);
		
		JRadioButton radioButton_32 = new JRadioButton("Empty");
		radioButton_32.setBounds(350, 396, 109, 23);
		contentPane.add(radioButton_32);
		
		JRadioButton radioButton_33 = new JRadioButton("Empty");
		radioButton_33.setBounds(350, 422, 109, 23);
		contentPane.add(radioButton_33);
		
		JRadioButton radioButton_34 = new JRadioButton("Empty");
		radioButton_34.setBounds(350, 448, 109, 23);
		contentPane.add(radioButton_34);
		
		JRadioButton radioButton_35 = new JRadioButton("Empty");
		radioButton_35.setBounds(522, 162, 109, 23);
		contentPane.add(radioButton_35);
		
		JRadioButton radioButton_36 = new JRadioButton("Empty");
		radioButton_36.setBounds(522, 188, 109, 23);
		contentPane.add(radioButton_36);
		
		JRadioButton radioButton_37 = new JRadioButton("Empty");
		radioButton_37.setBounds(522, 214, 109, 23);
		contentPane.add(radioButton_37);
		
		JRadioButton radioButton_38 = new JRadioButton("Empty");
		radioButton_38.setBounds(522, 240, 109, 23);
		contentPane.add(radioButton_38);
		
		JRadioButton radioButton_39 = new JRadioButton("Empty");
		radioButton_39.setBounds(522, 266, 109, 23);
		contentPane.add(radioButton_39);
		
		JRadioButton radioButton_40 = new JRadioButton("Empty");
		radioButton_40.setBounds(522, 292, 109, 23);
		contentPane.add(radioButton_40);
		
		JRadioButton radioButton_41 = new JRadioButton("Empty");
		radioButton_41.setBounds(522, 318, 109, 23);
		contentPane.add(radioButton_41);
		
		JRadioButton radioButton_42 = new JRadioButton("Empty");
		radioButton_42.setBounds(522, 344, 109, 23);
		contentPane.add(radioButton_42);
		
		JRadioButton radioButton_43 = new JRadioButton("Empty");
		radioButton_43.setBounds(522, 370, 109, 23);
		contentPane.add(radioButton_43);
		
		JRadioButton radioButton_44 = new JRadioButton("Empty");
		radioButton_44.setBounds(522, 396, 109, 23);
		contentPane.add(radioButton_44);
		
		JRadioButton radioButton_45 = new JRadioButton("Empty");
		radioButton_45.setBounds(522, 422, 109, 23);
		contentPane.add(radioButton_45);
		
		JRadioButton radioButton_46 = new JRadioButton("Empty");
		radioButton_46.setBounds(522, 448, 109, 23);
		contentPane.add(radioButton_46);
		
		JRadioButton radioButton_47 = new JRadioButton("Empty");
		radioButton_47.setBounds(708, 162, 109, 23);
		contentPane.add(radioButton_47);
		
		JRadioButton radioButton_48 = new JRadioButton("Empty");
		radioButton_48.setBounds(708, 188, 109, 23);
		contentPane.add(radioButton_48);
		
		JRadioButton radioButton_49 = new JRadioButton("Empty");
		radioButton_49.setBounds(708, 214, 109, 23);
		contentPane.add(radioButton_49);
		
		JRadioButton radioButton_50 = new JRadioButton("Empty");
		radioButton_50.setBounds(708, 240, 109, 23);
		contentPane.add(radioButton_50);
		
		JRadioButton radioButton_51 = new JRadioButton("Empty");
		radioButton_51.setBounds(708, 266, 109, 23);
		contentPane.add(radioButton_51);
		
		JRadioButton radioButton_52 = new JRadioButton("Empty");
		radioButton_52.setBounds(708, 292, 109, 23);
		contentPane.add(radioButton_52);
		
		JRadioButton radioButton_53 = new JRadioButton("Empty");
		radioButton_53.setBounds(708, 318, 109, 23);
		contentPane.add(radioButton_53);
		
		JRadioButton radioButton_54 = new JRadioButton("Empty");
		radioButton_54.setBounds(708, 344, 109, 23);
		contentPane.add(radioButton_54);
		
		JRadioButton radioButton_55 = new JRadioButton("Empty");
		radioButton_55.setBounds(708, 370, 109, 23);
		contentPane.add(radioButton_55);
		
		JRadioButton radioButton_56 = new JRadioButton("Empty");
		radioButton_56.setBounds(708, 396, 109, 23);
		contentPane.add(radioButton_56);
		
		JRadioButton radioButton_57 = new JRadioButton("Empty");
		radioButton_57.setBounds(708, 422, 109, 23);
		contentPane.add(radioButton_57);
		
		JRadioButton radioButton_58 = new JRadioButton("Empty");
		radioButton_58.setBounds(708, 448, 109, 23);
		contentPane.add(radioButton_58);
		
		JButton btnReadContinue = new JButton("\u041F\u0440\u043E\u0434\u044A\u043B\u0436\u0438");
		btnReadContinue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ButtonPressedCode();
			}
		});
		btnReadContinue.setBackground(Color.GREEN);
		btnReadContinue.setFont(new Font("Tahoma", Font.PLAIN, 26));
		btnReadContinue.setBounds(20, 539, 346, 69);
		contentPane.add(btnReadContinue);
		
		JButton btnReadBack = new JButton("\u041D\u0430\u0437\u0430\u0434");
		btnReadBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BackButtonPressedCode();
			}
		});
		btnReadBack.setBackground(Color.RED);
		btnReadBack.setFont(new Font("Tahoma", Font.PLAIN, 26));
		btnReadBack.setBounds(470, 539, 346, 69);
		contentPane.add(btnReadBack);
	}
	public void ButtonPressedCode() {
		ReadLessonUI readLessonUi = new ReadLessonUI();
		readLessonUi.setVisible(true);
		
		ReadLessonMenuUI readLessonMenuUi = new ReadLessonMenuUI();
		readLessonMenuUi.dispose();
	}
	public void BackButtonPressedCode() {
		StartMenuUI startMenuUi = new StartMenuUI();
		startMenuUi.setVisible(true);
		
		ReadLessonMenuUI readLessonMenuUi = new ReadLessonMenuUI();
		readLessonMenuUi.dispose();
	}
}
