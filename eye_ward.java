import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class eye_ward extends JFrame {
    private JTextField textField2;
    private JTextField textField1;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JButton registerButton;
    private JButton cancleButton;
    private JPanel MainPanel;
    private JLabel show;

    public eye_ward() {
        setContentPane(MainPanel);
        setTitle("Registration");
        setSize(1500, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String fn= textField2.getText();
                String ag= textField1.getText();
                String gen=  textField3.getText();
                String ey= textField4.getText();
                String dia= textField5.getText();
                show.setText("Patient Name : " +fn+" , " +" Age : " +ag+" , " +"Gender :  " +gen+" , " +"Eye :  "+ey+" , " +"Problem :   " +dia);


            }
        });
        cancleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                textField2.setText("");
                textField1.setText("");
                  textField3.setText("");
                 textField4.setText("");
                 textField5.setText("");
                show.setText("");


            }
        });
    }

    public static void main(String[] args) {
        eye_ward e=new eye_ward();
    }
}































