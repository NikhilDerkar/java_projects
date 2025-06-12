import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TO_DO extends JFrame{
    private JPanel Main;
    private JButton ADDButton;
    private JTextField list;
    private JLabel show;


    public TO_DO() {
        setContentPane(Main);
        setTitle("To Do List");
        setSize(650, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        ADDButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String todo= list.getText();


if (!todo.isEmpty()) {
        show.setText("Task to Complete: " + todo);


    int result = todoUserDataDAO.insertUserData(todo);

    if (result == 1) {
        System.out.println("Data inserted successfully!");
    } else {
        System.out.println("Registration failed. Please try again.");
    }



        }

            }
        });
    }

        public static void main(String[] args) {
            TO_DO t=new TO_DO();
            String todo = null;

        }
}

