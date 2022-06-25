import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;



public class NewEmployee extends JFrame {
    JTextField txtName,txtId,txtAddress,txtPhone,txtEmail,txtBasicSalary,txtLiveExpisive,txtPassword , txtManagerBoinus,txtCoursesCount;
    private String type;
//    private boolean firstTime=false;

    public NewEmployee(String type ){
        this.type = type;
        MFrame c = new MFrame(this);
//      header
        JLabel lbl_header =new JLabel("add employee data ("+type+")");
        lbl_header.setSize(500,40);
        lbl_header.setHorizontalAlignment(JLabel.CENTER);
        lbl_header.setFont(new Font("Serif", Font.BOLD, 26));
        lbl_header.setForeground(Color.ORANGE);
        lbl_header.setBackground(Color.BLUE);
        Font font = new Font("Dialog", Font.PLAIN,16);
//        Fields: Employee Name, Employee id, Employee Address,
//                Employee phone number , Employee Email, Employee
//        basicSalary, Employee liveExpensive ,Employee Password
//        text input

        txtName=new JTextField();
        txtId=new JTextField();
        txtAddress=new JTextField();
        txtPhone=new JTextField();
        txtEmail=new JTextField();
        txtBasicSalary=new JTextField();
        txtLiveExpisive=new JTextField();
        txtPassword=new JTextField();
        txtManagerBoinus =new JTextField();
        txtCoursesCount =new JTextField();

        txtId.setBounds(270,50,160,25);
        txtName.setBounds(270,80,160,25);
        txtAddress.setBounds(270,110,160,25);
        txtPhone.setBounds(270,140,160,25);
        txtEmail.setBounds(270,170,160,25);
        txtBasicSalary.setBounds(270,200,160,25);
        txtLiveExpisive.setBounds(270,230,160,25);
        txtPassword.setBounds(270,260,160,25);
        super.add(txtId);
        super.add(txtName);
        super.add(txtAddress);
        super.add(txtPhone);
        super.add(txtEmail);
        super.add(txtBasicSalary);
        super.add(txtLiveExpisive);
        super.add(txtPassword);
//      end txt
//      add labels
        c.lbl(type + " id :",100,50,150,25,font);
        c.lbl(type + " name :",100,80,150,25 , font);
        c.lbl(type + " Address :",100,110,150,25 , font);
        c.lbl(type + " phone :",100,140,150,25 , font);
        c.lbl(type + " Email :",100,170,150,25 , font);
        c.lbl(type + " basicSalary:",100,200,150,25 , font);
        c.lbl(type + " liveExpensive :",100,230,150,25 , font);
        c.lbl(type + " Password :",100,260,150,25 , font);

        if(type == "teacher"){
            c.lbl("CoursesCount:",100,290,150,25,font);
            txtCoursesCount.setBounds(270,290,160,25);
            super.add(txtCoursesCount);
        }else {
            c.lbl("Manager bouns:",100,290,150,25,font);
            txtManagerBoinus.setBounds(270,290,160,25);
            super.add(txtManagerBoinus);
        }

        JButton bt_add =new JButton("add "+type);
        bt_add.setBounds(180,330,200,40);
        super.setLayout(null);
        super.add(lbl_header);

//      action listners
        bt_add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addData();
                dispose();
            }
        });

        super.add(bt_add);
        super.setSize(550, 450);
        super.setLayout(null);
        setLocationRelativeTo(null);
        super.setVisible(true);
    }

//    NewEmployee(String type){
//        new NewEmployee(type,false);
//    }
     void addData(){
        String id = this.txtId.getText();
         String name = this.txtName.getText();
         String address = this.txtAddress.getText();
         String phone=this.txtPhone.getText();
         String email = this.txtEmail.getText();
         double baseSalary = Double.parseDouble(this.txtBasicSalary.getText());
         double liveExpisive = Double.parseDouble(this.txtLiveExpisive.getText());
         String password = this.txtPassword.getText();

         if (type == "teacher"){
             int count = Integer.parseInt(txtCoursesCount.getText());

             Teacher mEmp = new Teacher(id, name, address, phone, email, baseSalary, liveExpisive, password,count);
             School.mSchool.teachers.add(mEmp);
         }else {
             double managerBoinus = Double.parseDouble(txtManagerBoinus.getText());
             Manager mEmp = new Manager(id, name, address, phone, email, baseSalary, liveExpisive, password,managerBoinus);
             School.mSchool.managers.add(mEmp);
         }

         System.out.println(School.mSchool.showData());
    }
    JLabel lbl(JFrame contex,  String text){
        JLabel lbl = new JLabel(text);
        return lbl;
    }
    void lbl(   String text, int x , int y ,int w ,int h ){
        JLabel lbl = new JLabel(text);
        lbl.setBounds(x,y,w,h);
        super.add(lbl);
    }


}
