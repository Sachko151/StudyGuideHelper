package ui;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReadLessonMenuUI extends JFrame {

    private JPanel contentPane;
    public static final String DIRECTORY = "C:\\Users\\8530w\\Desktop\\Java\\GeographyHelper\\src\\textContent";
    public static final String FILE_NAME = "content.txt";

    /**
     * Launch the application.
     */

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

        JRadioButton rdbtnTitle1 = new JRadioButton(setTitle(0));
        rdbtnTitle1.setActionCommand(setTitle(0));
        rdbtnTitle1.setBounds(6, 162, 109, 23);
        contentPane.add(rdbtnTitle1);

        JRadioButton rdbtnTitle2 = new JRadioButton(setTitle(1));
        rdbtnTitle2.setBounds(6, 188, 109, 23);
        contentPane.add(rdbtnTitle2);
        rdbtnTitle2.setActionCommand(setTitle(1));

        JRadioButton rdbtnTitle3 = new JRadioButton(setTitle(2));
        rdbtnTitle3.setBounds(6, 214, 109, 23);
        contentPane.add(rdbtnTitle3);
        rdbtnTitle3.setActionCommand(setTitle(2));

        JRadioButton rdbtnTitle4 = new JRadioButton(setTitle(3));
        rdbtnTitle4.setBounds(6, 240, 109, 23);
        contentPane.add(rdbtnTitle4);
        rdbtnTitle4.setActionCommand(setTitle(3));

        JRadioButton rdbtnTitle5 = new JRadioButton(setTitle(4));
        rdbtnTitle5.setBounds(6, 266, 109, 23);
        contentPane.add(rdbtnTitle5);
        rdbtnTitle5.setActionCommand(setTitle(4));

        JRadioButton rdbtnTitle6 = new JRadioButton(setTitle(5));
        rdbtnTitle6.setBounds(6, 292, 109, 23);
        contentPane.add(rdbtnTitle6);
        rdbtnTitle6.setActionCommand(setTitle(5));

        JRadioButton rdbtnTitle7 = new JRadioButton(setTitle(6));
        rdbtnTitle7.setBounds(6, 318, 109, 23);
        contentPane.add(rdbtnTitle7);
        rdbtnTitle7.setActionCommand(setTitle(6));

        JRadioButton rdbtnTitle8 = new JRadioButton(setTitle(7));
        rdbtnTitle8.setBounds(6, 344, 109, 23);
        contentPane.add(rdbtnTitle8);
        rdbtnTitle8.setActionCommand(setTitle(7));

        JRadioButton rdbtnTitle9 = new JRadioButton(setTitle(8));
        rdbtnTitle9.setBounds(6, 370, 109, 23);
        contentPane.add(rdbtnTitle9);
        rdbtnTitle9.setActionCommand(setTitle(8));

        JRadioButton rdbtnTitle10 = new JRadioButton(setTitle(9));
        rdbtnTitle10.setBounds(6, 396, 109, 23);
        contentPane.add(rdbtnTitle10);
        rdbtnTitle10.setActionCommand(setTitle(9));

        JRadioButton rdbtnTitle11 = new JRadioButton(setTitle(10));
        rdbtnTitle11.setBounds(6, 422, 109, 23);
        contentPane.add(rdbtnTitle11);
        rdbtnTitle11.setActionCommand(setTitle(10));

        JRadioButton rdbtnTitle12 = new JRadioButton(setTitle(11));
        rdbtnTitle12.setBounds(6, 448, 109, 23);
        contentPane.add(rdbtnTitle12);
        rdbtnTitle12.setActionCommand(setTitle(11));

        JRadioButton rdbtnTitle13 = new JRadioButton(setTitle(12));
        rdbtnTitle13.setBounds(167, 162, 109, 23);
        contentPane.add(rdbtnTitle13);
        rdbtnTitle13.setActionCommand(setTitle(12));

        JRadioButton rdbtnTitle14 = new JRadioButton(setTitle(13));
        rdbtnTitle14.setBounds(167, 188, 109, 23);
        contentPane.add(rdbtnTitle14);
        rdbtnTitle14.setActionCommand(setTitle(13));

        JRadioButton rdbtnTitle15 = new JRadioButton(setTitle(14));
        rdbtnTitle15.setBounds(167, 214, 109, 23);
        contentPane.add(rdbtnTitle15);
        rdbtnTitle15.setActionCommand(setTitle(14));

        JRadioButton rdbtnTitle16 = new JRadioButton(setTitle(15));
        rdbtnTitle16.setBounds(167, 240, 109, 23);
        contentPane.add(rdbtnTitle16);
        rdbtnTitle16.setActionCommand(setTitle(15));

        JRadioButton rdbtnTitle17 = new JRadioButton(setTitle(16));
        rdbtnTitle17.setBounds(167, 266, 109, 23);
        contentPane.add(rdbtnTitle17);
        rdbtnTitle17.setActionCommand(setTitle(16));

        JRadioButton rdbtnTitle18 = new JRadioButton(setTitle(17));
        rdbtnTitle18.setBounds(167, 292, 109, 23);
        contentPane.add(rdbtnTitle18);
        rdbtnTitle18.setActionCommand(setTitle(17));

        JRadioButton rdbtnTitle19 = new JRadioButton(setTitle(18));
        rdbtnTitle19.setBounds(167, 318, 109, 23);
        contentPane.add(rdbtnTitle19);
        rdbtnTitle19.setActionCommand(setTitle(18));

        JRadioButton rdbtnTitle20 = new JRadioButton(setTitle(19));
        rdbtnTitle20.setBounds(167, 344, 109, 23);
        contentPane.add(rdbtnTitle20);
        rdbtnTitle20.setActionCommand(setTitle(19));

        JRadioButton rdbtnTitle21 = new JRadioButton(setTitle(20));
        rdbtnTitle21.setBounds(167, 370, 109, 23);
        contentPane.add(rdbtnTitle21);
        rdbtnTitle21.setActionCommand(setTitle(20));

        JRadioButton rdbtnTitle22 = new JRadioButton(setTitle(21));
        rdbtnTitle22.setBounds(167, 396, 109, 23);
        contentPane.add(rdbtnTitle22);
        rdbtnTitle22.setActionCommand(setTitle(21));

        JRadioButton rdbtnTitle23 = new JRadioButton(setTitle(22));
        rdbtnTitle23.setBounds(167, 422, 109, 23);
        contentPane.add(rdbtnTitle23);
        rdbtnTitle23.setActionCommand(setTitle(22));

        JRadioButton rdbtnTitle24 = new JRadioButton(setTitle(23));
        rdbtnTitle24.setBounds(167, 448, 109, 23);
        contentPane.add(rdbtnTitle24);
        rdbtnTitle24.setActionCommand(setTitle(23));

        JRadioButton rdbtnTitle25 = new JRadioButton(setTitle(24));
        rdbtnTitle25.setBounds(350, 162, 109, 23);
        contentPane.add(rdbtnTitle25);
        rdbtnTitle25.setActionCommand(setTitle(24));

        JRadioButton rdbtnTitle26 = new JRadioButton(setTitle(25));
        rdbtnTitle26.setBounds(350, 188, 109, 23);
        contentPane.add(rdbtnTitle26);
        rdbtnTitle26.setActionCommand(setTitle(25));

        JRadioButton rdbtnTitle27 = new JRadioButton(setTitle(26));
        rdbtnTitle27.setBounds(350, 214, 109, 23);
        contentPane.add(rdbtnTitle27);
        rdbtnTitle27.setActionCommand(setTitle(26));

        JRadioButton rdbtnTitle28 = new JRadioButton(setTitle(27));
        rdbtnTitle28.setBounds(350, 240, 109, 23);
        contentPane.add(rdbtnTitle28);
        rdbtnTitle28.setActionCommand(setTitle(27));

        JRadioButton rdbtnTitle29 = new JRadioButton(setTitle(28));
        rdbtnTitle29.setBounds(350, 266, 109, 23);
        contentPane.add(rdbtnTitle29);
        rdbtnTitle29.setActionCommand(setTitle(28));

        JRadioButton rdbtnTitle30 = new JRadioButton(setTitle(29));
        rdbtnTitle30.setBounds(350, 292, 109, 23);
        contentPane.add(rdbtnTitle30);
        rdbtnTitle30.setActionCommand(setTitle(29));

        JRadioButton rdbtnTitle31 = new JRadioButton(setTitle(30));
        rdbtnTitle31.setBounds(350, 318, 109, 23);
        contentPane.add(rdbtnTitle31);
        rdbtnTitle31.setActionCommand(setTitle(30));

        JRadioButton rdbtnTitle32 = new JRadioButton(setTitle(31));
        rdbtnTitle32.setBounds(350, 344, 109, 23);
        contentPane.add(rdbtnTitle32);
        rdbtnTitle32.setActionCommand(setTitle(31));

        JRadioButton rdbtnTitle33 = new JRadioButton(setTitle(32));
        rdbtnTitle33.setBounds(350, 370, 109, 23);
        contentPane.add(rdbtnTitle33);
        rdbtnTitle33.setActionCommand(setTitle(32));

        JRadioButton rdbtnTitle34 = new JRadioButton(setTitle(33));
        rdbtnTitle34.setBounds(350, 396, 109, 23);
        contentPane.add(rdbtnTitle34);
        rdbtnTitle34.setActionCommand(setTitle(33));

        JRadioButton rdbtnTitle35 = new JRadioButton(setTitle(34));
        rdbtnTitle35.setBounds(350, 422, 109, 23);
        contentPane.add(rdbtnTitle35);
        rdbtnTitle35.setActionCommand(setTitle(34));

        JRadioButton rdbtnTitle36 = new JRadioButton(setTitle(35));
        rdbtnTitle36.setBounds(350, 448, 109, 23);
        contentPane.add(rdbtnTitle36);
        rdbtnTitle36.setActionCommand(setTitle(35));

        JRadioButton rdbtnTitle37 = new JRadioButton(setTitle(36));
        rdbtnTitle37.setBounds(522, 162, 109, 23);
        contentPane.add(rdbtnTitle37);
        rdbtnTitle37.setActionCommand(setTitle(36));

        JRadioButton rdbtnTitle38 = new JRadioButton(setTitle(37));
        rdbtnTitle38.setBounds(522, 188, 109, 23);
        contentPane.add(rdbtnTitle38);
        rdbtnTitle38.setActionCommand(setTitle(37));

        JRadioButton rdbtnTitle39 = new JRadioButton(setTitle(38));
        rdbtnTitle39.setBounds(522, 214, 109, 23);
        contentPane.add(rdbtnTitle39);
        rdbtnTitle39.setActionCommand(setTitle(38));

        JRadioButton rdbtnTitle40 = new JRadioButton(setTitle(39));
        rdbtnTitle40.setBounds(522, 240, 109, 23);
        contentPane.add(rdbtnTitle40);
        rdbtnTitle40.setActionCommand(setTitle(39));

        JRadioButton rdbtnTitle41 = new JRadioButton(setTitle(40));
        rdbtnTitle41.setBounds(522, 266, 109, 23);
        contentPane.add(rdbtnTitle41);
        rdbtnTitle41.setActionCommand(setTitle(40));

        JRadioButton rdbtnTitle42 = new JRadioButton(setTitle(41));
        rdbtnTitle42.setBounds(522, 292, 109, 23);
        contentPane.add(rdbtnTitle42);
        rdbtnTitle42.setActionCommand(setTitle(41));

        JRadioButton rdbtnTitle43 = new JRadioButton(setTitle(42));
        rdbtnTitle43.setBounds(522, 318, 109, 23);
        contentPane.add(rdbtnTitle43);
        rdbtnTitle43.setActionCommand(setTitle(42));

        JRadioButton rdbtnTitle44 = new JRadioButton(setTitle(43));
        rdbtnTitle44.setBounds(522, 344, 109, 23);
        contentPane.add(rdbtnTitle44);
        rdbtnTitle44.setActionCommand(setTitle(43));

        JRadioButton rdbtnTitle45 = new JRadioButton(setTitle(44));
        rdbtnTitle45.setBounds(522, 370, 109, 23);
        contentPane.add(rdbtnTitle45);
        rdbtnTitle45.setActionCommand(setTitle(44));

        JRadioButton rdbtnTitle46 = new JRadioButton(setTitle(45));
        rdbtnTitle46.setBounds(522, 396, 109, 23);
        contentPane.add(rdbtnTitle46);
        rdbtnTitle46.setActionCommand(setTitle(45));

        JRadioButton rdbtnTitle47 = new JRadioButton(setTitle(46));
        rdbtnTitle47.setBounds(522, 422, 109, 23);
        contentPane.add(rdbtnTitle47);
        rdbtnTitle47.setActionCommand(setTitle(46));

        JRadioButton rdbtnTitle48 = new JRadioButton(setTitle(47));
        rdbtnTitle48.setBounds(522, 448, 109, 23);
        contentPane.add(rdbtnTitle48);
        rdbtnTitle48.setActionCommand(setTitle(47));

        JRadioButton rdbtnTitle49 = new JRadioButton(setTitle(48));
        rdbtnTitle49.setBounds(708, 162, 109, 23);
        contentPane.add(rdbtnTitle49);
        rdbtnTitle49.setActionCommand(setTitle(48));

        JRadioButton rdbtnTitle50 = new JRadioButton(setTitle(49));
        rdbtnTitle50.setBounds(708, 188, 109, 23);
        contentPane.add(rdbtnTitle50);
        rdbtnTitle50.setActionCommand(setTitle(49));

        JRadioButton rdbtnTitle51 = new JRadioButton(setTitle(50));
        rdbtnTitle51.setBounds(708, 214, 109, 23);
        contentPane.add(rdbtnTitle51);
        rdbtnTitle51.setActionCommand(setTitle(50));

        JRadioButton rdbtnTitle52 = new JRadioButton(setTitle(51));
        rdbtnTitle52.setBounds(708, 240, 109, 23);
        contentPane.add(rdbtnTitle52);
        rdbtnTitle52.setActionCommand(setTitle(51));

        JRadioButton rdbtnTitle53 = new JRadioButton(setTitle(52));
        rdbtnTitle53.setBounds(708, 266, 109, 23);
        contentPane.add(rdbtnTitle53);
        rdbtnTitle53.setActionCommand(setTitle(52));

        JRadioButton rdbtnTitle54 = new JRadioButton(setTitle(53));
        rdbtnTitle54.setBounds(708, 292, 109, 23);
        contentPane.add(rdbtnTitle54);
        rdbtnTitle54.setActionCommand(setTitle(53));

        JRadioButton rdbtnTitle55 = new JRadioButton(setTitle(54));
        rdbtnTitle55.setBounds(708, 318, 109, 23);
        contentPane.add(rdbtnTitle55);
        rdbtnTitle55.setActionCommand(setTitle(54));

        JRadioButton rdbtnTitle56 = new JRadioButton(setTitle(55));
        rdbtnTitle56.setBounds(708, 344, 109, 23);
        contentPane.add(rdbtnTitle56);
        rdbtnTitle56.setActionCommand(setTitle(55));

        JRadioButton rdbtnTitle57 = new JRadioButton(setTitle(56));
        rdbtnTitle57.setBounds(708, 370, 109, 23);
        contentPane.add(rdbtnTitle57);
        rdbtnTitle57.setActionCommand(setTitle(56));

        JRadioButton rdbtnTitle58 = new JRadioButton(setTitle(57));
        rdbtnTitle58.setBounds(708, 396, 109, 23);
        contentPane.add(rdbtnTitle58);
        rdbtnTitle58.setActionCommand(setTitle(57));

        JRadioButton rdbtnTitle59 = new JRadioButton(setTitle(58));
        rdbtnTitle59.setBounds(708, 422, 109, 23);
        contentPane.add(rdbtnTitle59);
        rdbtnTitle59.setActionCommand(setTitle(58));

        JRadioButton rdbtnTitle60 = new JRadioButton(setTitle(59));
        rdbtnTitle60.setBounds(708, 448, 109, 23);
        contentPane.add(rdbtnTitle60);
        rdbtnTitle60.setActionCommand(setTitle(59));

        ButtonGroup group = new ButtonGroup();
        group.add(rdbtnTitle1);
        group.add(rdbtnTitle2);
        group.add(rdbtnTitle3);
        group.add(rdbtnTitle4);
        group.add(rdbtnTitle5);
        group.add(rdbtnTitle6);
        group.add(rdbtnTitle7);
        group.add(rdbtnTitle8);
        group.add(rdbtnTitle9);
        group.add(rdbtnTitle10);
        group.add(rdbtnTitle11);
        group.add(rdbtnTitle12);
        group.add(rdbtnTitle13);
        group.add(rdbtnTitle14);
        group.add(rdbtnTitle15);
        group.add(rdbtnTitle16);
        group.add(rdbtnTitle17);
        group.add(rdbtnTitle18);
        group.add(rdbtnTitle19);
        group.add(rdbtnTitle20);
        group.add(rdbtnTitle21);
        group.add(rdbtnTitle22);
        group.add(rdbtnTitle23);
        group.add(rdbtnTitle24);
        group.add(rdbtnTitle25);
        group.add(rdbtnTitle26);
        group.add(rdbtnTitle27);
        group.add(rdbtnTitle28);
        group.add(rdbtnTitle29);
        group.add(rdbtnTitle30);
        group.add(rdbtnTitle31);
        group.add(rdbtnTitle32);
        group.add(rdbtnTitle33);
        group.add(rdbtnTitle34);
        group.add(rdbtnTitle35);
        group.add(rdbtnTitle36);
        group.add(rdbtnTitle37);
        group.add(rdbtnTitle38);
        group.add(rdbtnTitle39);
        group.add(rdbtnTitle40);
        group.add(rdbtnTitle41);
        group.add(rdbtnTitle42);
        group.add(rdbtnTitle43);
        group.add(rdbtnTitle44);
        group.add(rdbtnTitle45);
        group.add(rdbtnTitle46);
        group.add(rdbtnTitle47);
        group.add(rdbtnTitle48);
        group.add(rdbtnTitle49);
        group.add(rdbtnTitle50);
        group.add(rdbtnTitle51);
        group.add(rdbtnTitle52);
        group.add(rdbtnTitle53);
        group.add(rdbtnTitle54);
        group.add(rdbtnTitle55);
        group.add(rdbtnTitle56);
        group.add(rdbtnTitle57);
        group.add(rdbtnTitle58);
        group.add(rdbtnTitle59);
        group.add(rdbtnTitle60);
        JButton btnReadContinue = new JButton("\u041F\u0440\u043E\u0434\u044A\u043B\u0436\u0438");
        btnReadContinue.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                buttonPressedCode(group);
            }
        });
        btnReadContinue.setBackground(Color.GREEN);
        btnReadContinue.setFont(new Font("Tahoma", Font.PLAIN, 26));
        btnReadContinue.setBounds(20, 539, 346, 69);
        contentPane.add(btnReadContinue);

        JButton btnReadBack = new JButton("\u041D\u0430\u0437\u0430\u0434");
        btnReadBack.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                backButtonPressed();
            }
        });
        btnReadBack.setBackground(Color.RED);
        btnReadBack.setFont(new Font("Tahoma", Font.PLAIN, 26));
        btnReadBack.setBounds(470, 539, 346, 69);
        contentPane.add(btnReadBack);


    }
    public void buttonPressedCode(ButtonGroup group) {
        ReadLessonUI readLessonUi = new ReadLessonUI(group.getSelection().getActionCommand());
        readLessonUi.setVisible(true);

        dispose();
    }


    public void backButtonPressed() {
        StartMenuUI startMenuUi = new StartMenuUI();
        startMenuUi.setVisible(true);
        ReadLessonMenuUI readLessonMenuUi = new ReadLessonMenuUI();
        readLessonMenuUi.dispose();
        dispose();

    }

    public String setTitle(int i) throws IndexOutOfBoundsException {
        Path path = Paths.get(DIRECTORY, FILE_NAME);
        String title = "";
        try {
            List<String> list = Files.readAllLines(path);
            title = list.get(i);
            Path chechPath = Paths.get(DIRECTORY, title+".txt");
            if (Files.exists(chechPath)){
            } else {
                title = "Empty";
            }
        } catch (IOException | IndexOutOfBoundsException e) {
            title = "Empty";
        }
        return title;
    }

    public String getResponeFromJButton(ButtonGroup group) {
        return null;
    }

}
