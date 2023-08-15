import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentMarks {
    private JTextField txt1;
    private JTextField txt2;
    private JTextField txt3;
    private JTextField txt4;
    private JTextField txt5;
    private JTextField txt6;
    private JTextField txt7;
    private JTextField txt8;
    private JTextField txt10;
    private JTextField txt9;
    private JButton calcbtn;
    private JLabel grade;
    private JLabel average;
    private JLabel total;
    private JPanel Main;
    private JTextField txtname;
    private JLabel name;

    public static void main(String[] args) {
        JFrame frame = new JFrame("StudentMarks");
        frame.setContentPane(new StudentMarks().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public StudentMarks() {
        calcbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int m1, m2, m3, m4, m5, m6, m7, tot;
                double avg;

                m1 = Integer.parseInt(txt1.getText());
                m2 = Integer.parseInt(txt2.getText());
                m3 = Integer.parseInt(txt3.getText());
                m4 = Integer.parseInt(txt4.getText());
                m5 = Integer.parseInt(txt5.getText());
                m6 = Integer.parseInt(txt6.getText());
                m7 = Integer.parseInt(txt7.getText());

                if (m1 > 100 || m2 > 100 || m3 > 100 || m4 > 100 || m5 > 100 || m6 > 100 || m7 > 100) {

                    txt10.setText("Ошибка - введено балл превышающий 100");
                    return;
                }

                m1 = Math.min(m1, 100);
                m2 = Math.min(m2, 100);
                m3 = Math.min(m3, 100);
                m4 = Math.min(m4, 100);
                m5 = Math.min(m5, 100);
                m6 = Math.min(m6, 100);
                m7 = Math.min(m7, 100);

                tot = m1 + m2 + m3 + m4 + m5 + m6 + m7;

                txt8.setText(String.valueOf(tot));

                avg = (double) tot / 7;
                txt9.setText(String.valueOf(avg));

                if (avg >= 87 && avg <= 100) {
                    txt10.setText("Отлично");
                } else if (avg >= 74 && avg <= 86) {
                    txt10.setText("Хорошо");
                } else if (avg >= 63 && avg <= 73) {
                    txt10.setText("Удовлетворительно");
                } else {
                    txt10.setText("Не удовлетворительно");
                }
            }
        });
    }}