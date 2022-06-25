import javax.swing.*;

public class Login {
    private JPanel panel1;
    private JTextField textField1;
    private JTextField textField2;
    private JButton LOGINButton;

    public static void main(String[] args) {
//        Test x =new Test();
        JFrame frame =new JFrame("Test");
        frame.setContentPane(new Login().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.pack();

    }

}
