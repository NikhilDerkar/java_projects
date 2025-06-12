import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class Admission extends JFrame{
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField4;
    private JButton processedButton;
    private JPanel Main;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JComboBox comboBox3;

public Admission(){
    setContentPane(Main);
    setTitle("Admission Form");
    setSize(650, 500);
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setVisible(true);

    processedButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String FN= textField1.getText();
            String AGE= textField2.getText();
            String GEN= Objects.requireNonNull(comboBox1.getSelectedItem()).toString();
            String CITY= textField4.getText();
            String COU= Objects.requireNonNull(comboBox2.getSelectedItem()).toString();
            String DUR= Objects.requireNonNull(comboBox3.getSelectedItem()).toString();


            int result = ADDuser.insertUserData(FN,AGE,GEN,CITY,COU,DUR);
            if (result == 1) {
                System.out.println("Data inserted successfully!");
            } else {
                System.out.println("Registration failed. Please try again.");
            }


        }
    });
}

    public static void main(String[] args) {
        Admission admi=new Admission();
    }
}
