package ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

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

public class CreateDefinitionUI extends JFrame implements IButtonCode{

	private JPanel contentPane;
	private JTextField txtDefinition;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateDefinitionUI frame = new CreateDefinitionUI();
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
	public CreateDefinitionUI() {
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
				ButtonPressedCode();
			}
		});
		btnDefContinue.setBackground(Color.GREEN);
		btnDefContinue.setFont(new Font("Tahoma", Font.PLAIN, 29));
		btnDefContinue.setBounds(32, 463, 328, 104);
		contentPane.add(btnDefContinue);
		
		JButton btnDefBack = new JButton("\u041D\u0430\u0437\u0430\u0434");
		btnDefBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BackButtonPressedCode();
			}
		});
		btnDefBack.setBackground(Color.RED);
		btnDefBack.setFont(new Font("Tahoma", Font.PLAIN, 29));
		btnDefBack.setBounds(518, 463, 328, 104);
		contentPane.add(btnDefBack);
	}
	public void ButtonPressedCode() {
		CreateMenuUI createMenuUi = new CreateMenuUI();
		createMenuUi.setVisible(true);
		
		CreateDefinitionUI createDefinitionUi = new CreateDefinitionUI();
		createDefinitionUi.dispose();
	}
	public void BackButtonPressedCode() {
		CreateMenuUI createMenuUi = new CreateMenuUI();
		createMenuUi.setVisible(true);
		
		CreateDefinitionUI createDefinitionUi = new CreateDefinitionUI();
		createDefinitionUi.dispose();
	}

}
