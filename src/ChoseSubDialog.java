import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ChoseSubDialog {

    JFrame f;

    ChoseSubDialog(){
        f=new JFrame("ComboBox Example");
         JLabel label = new JLabel();
        JTextField txtCount =new JTextField();
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(40,10,250,30);
        label.setText("chose target sub");
        JButton b=new JButton("Show");
        b.setBounds(200,60,90,30);


        final JComboBox cb=new JComboBox();
//        cb.setModel(new  javax.swing.DefaultComboBoxModel<String>(){
//
//        });
        cb.setBounds(50, 60,120,30);

        txtCount.setBounds(50,100,240,30);
        txtCount.setEditable(false);
        f.add(cb); f.add(label); f.add(b);f.add(txtCount);
        f.setLayout(null);
        f.setSize(350,350);
        f.setVisible(true);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String data = "Programming language Selected: "
                        + cb.getItemAt(cb.getSelectedIndex());
                label.setText(data);
            }
        });
    }}