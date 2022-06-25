import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignInFrame extends JFrame {
    SignInFrame(){
        JLabel lbl_header =new JLabel();
        JLabel b_lbl =new JLabel();
        JLabel a_Lbl =new JLabel();
        JLabel c_lbl =new JLabel();
        JTextField a_txt = new JTextField();
        JTextField b_txt= new JTextField();
        JPanel panel =new JPanel();
        panel.setLayout(new GridLayout(5, 2));
        JButton bt_login =new JButton();
        JButton bt_signup =new JButton();

//        header
        lbl_header.setText("SIGN UP SCREEN");
        lbl_header.setSize(100,40);
        lbl_header.setBounds(100,0,200,40);
        lbl_header.setFont(new Font("Serif", Font.BOLD, 30));
//
        panel.setLocation(50,50);
//        row 1
        a_Lbl.setText("email");
        a_Lbl.setSize(100,40);
//        a_txt.setBounds(100,60,140,24);
//      row 2
        b_lbl.setText("password");
        b_lbl.setSize(100,40);
//        b_txt.setBounds(100,100,140,24);

//        buutons
        bt_login.setText("Login");
        bt_login.setSize(100,40);;
//        buutons
        bt_signup.setText("Signup");
        bt_signup.setSize(100,40);
//        bt_signup.setBounds(100,180,120,30);

        super.add(panel);
        super.add(lbl_header);
        panel.add(a_Lbl);
        panel.add(a_Lbl);
        panel.add(b_lbl);
        panel.add(c_lbl);
        panel.add(a_txt);
        panel.add(b_txt);
        panel.add(bt_login);
        panel.add(bt_signup);
        super.setSize(300,270);
        super.setLayout(null);
        super.setVisible(true);
        setLocationRelativeTo(null);

    }
    }

