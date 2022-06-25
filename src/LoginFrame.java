import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class LoginFrame extends JFrame {

    LoginFrame(){
//        try {
//            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
//        } catch (ClassNotFoundException ex) {
//            ex.printStackTrace();
//        } catch (InstantiationException ex) {
//            ex.printStackTrace();
//        } catch (IllegalAccessException ex) {
//            ex.printStackTrace();
//        } catch (UnsupportedLookAndFeelException ex) {
//            ex.printStackTrace();
//        }

        readFile();
        JLabel q_lbl =new JLabel();
        JLabel b_lbl =new JLabel();
        JLabel a_Lbl =new JLabel();
        JLabel c_lbl =new JLabel();
        JTextField a_txt = new JTextField();
        JTextField b_txt= new JTextField();

        JButton bt_login =new JButton();
        JButton bt_signup =new JButton();

//        header
        q_lbl.setText("Login screen");
        q_lbl.setBounds(60,0,250,40);
        q_lbl.setFont(new Font("Serif", Font.BOLD, 30));
//        row 1
        a_Lbl.setText("email");
        a_Lbl.setBounds(40,60,100,20);
        a_txt.setBounds(100,60,140,24);
//      row 2
        b_lbl.setText("password");
        b_lbl.setBounds(40,100,100,20);
        b_txt.setBounds(100,100,140,24);

//        buutons
        bt_login.setText("Login");
        bt_login.setBounds(100,140,120,30);
//        buutons
        bt_signup.setText("Signup");
        bt_signup.setBounds(100,180,120,30);

        bt_login.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ArrayList<Employee> all = new ArrayList<Employee>();
                all.addAll(School.mSchool.managers);
                all.addAll(School.mSchool.teachers);

                for (Employee i : all){
                    System.out.println("================");
                    if (a_txt.getText().toString().equals(i.getId().toString()) && b_txt.getText().toString().equals(i.getId().toString())){
                        System.out.println("yes");
                        Home home = new Home();
                        home.setVisible(true);
                        dispose();
                        return;
                    }
                }
                JOptionPane.showMessageDialog(LoginFrame.this, " Wrong password or id ");
                System.out.println(School.mSchool.showData());

            }

        });

        bt_signup.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AddEmpDialog addEmpDialog = new AddEmpDialog();
                addEmpDialog.setVisible(true);

            }
        });

        super.add(q_lbl);
        super.add(a_Lbl);
        super.add(a_Lbl);
        super.add(b_lbl);
        super.add(c_lbl);
        super.add(a_txt);
        super.add(b_txt);
        super.add(bt_login);
        super.add(bt_signup);
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((Toolkit.getDefaultToolkit().getScreenSize().width  - getSize().width) / 2, (Toolkit.getDefaultToolkit().getScreenSize().height - getSize().height) / 2);
        super.setSize(300,270);
        super.setLayout(null);
        setLocationRelativeTo(null);
        super.setVisible(true);
    }

    private void readFile(){
        try (FileInputStream fis = new FileInputStream("books.dat");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            School school = (School) ois.readObject();
            School y = new School();
            School.mSchool =school;
            System.out.println("y" + y.showData());
            System.out.println("-- stored --");
            System.out.println(school.showData());
            System.out.println("-- ------ --");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
