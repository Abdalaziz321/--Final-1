import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddEmpDialog extends JFrame {
    AddEmpDialog() {
//       label
        JLabel label = new JLabel();
        label.setText("Select employee TYPE");
        label.setBounds(50, 20, 250, 20);
        label.setFont(new Font("Serif", Font.BOLD, 20));
//      combo
        Border blackline = BorderFactory.createTitledBorder("type");
        JPanel panel = new JPanel();
        LayoutManager layout = new FlowLayout();
        panel.setLayout(layout);
        panel.setBorder(blackline);
        panel.setBounds(40, 60, 210, 60);
        ButtonGroup g = new ButtonGroup();
        JRadioButton manager = new JRadioButton("manager");
        JRadioButton teacher = new JRadioButton("teacher");
//        button
        JButton button = new JButton("ADD");
        button.setBounds(60, 130, 150, 30);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String targrt = "" ;
                if (teacher.isSelected()) {
                    targrt = "teacher";
                    NewEmployee newEmployee = new NewEmployee(targrt);
                } else if (manager.isSelected()) {
                    targrt = "manager";
                    NewEmployee newEmployee = new NewEmployee(targrt);
                } else {
                    JOptionPane.showMessageDialog(AddEmpDialog.this, "NO Type selected");
                }

                dispose();
                System.out.println(targrt);
            }
        });
        g.add(manager);
        g.add(teacher);
        super.add(label);
        panel.add(manager);
        panel.add(teacher);
        super.add(panel);
        super.add(button);
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - this.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - this.getHeight()) / 2);
        this.setLocation(x, y);
        super.setSize(310, 220);
        super.setLayout(null);
        setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
