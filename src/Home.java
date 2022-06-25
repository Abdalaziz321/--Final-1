/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import javax.swing.*;
import java.awt.*;
import java.io.*;

/**
 *
 * @author 01
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {

        readFile();
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AddSub = new javax.swing.JButton();
        AddManger = new javax.swing.JButton();
        addStudent = new javax.swing.JButton();
        showSub = new javax.swing.JButton();
        showSal = new javax.swing.JButton();
        showCount = new javax.swing.JButton();
        save = new javax.swing.JButton();
        Exit = new javax.swing.JButton();

        setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);

        AddSub.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        AddSub.setText("Add Subject");
        AddSub.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        AddSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddSubActionPerformed(evt);
            }
        });

        AddManger.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        AddManger.setText("Add Employee");
        AddManger.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        AddManger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddMangerActionPerformed(evt);
            }
        });

        addStudent.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        addStudent.setText("Add Student");
        addStudent.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        addStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStudentActionPerformed(evt);
            }
        });

        showSub.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        showSub.setText("Show subjects");
        showSub.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        showSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showSubActionPerformed(evt);
            }
        });

        showSal.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        showSal.setText("Show salaries");
        showSal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        showSal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showSalActionPerformed(evt);
            }
        });

        showCount.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        showCount.setText("Show Count");
        showCount.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        showCount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showCountActionPerformed(evt);
            }
        });

        save.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        save.setText("Save all data");
        save.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        Exit.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        Exit.setText("Exit");
        Exit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(82, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(showCount, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(showSal, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(showSub, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddSub, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(82, Short.MAX_VALUE)
                    .addComponent(AddManger, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(65, 65, 65)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(addStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AddSub, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(showSub, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(showSal, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(showCount, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(29, 29, 29)
                    .addComponent(AddManger, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(322, Short.MAX_VALUE)))
        );
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((Toolkit.getDefaultToolkit().getScreenSize().width  - getSize().width) / 2, (Toolkit.getDefaultToolkit().getScreenSize().height - getSize().height) / 2);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AddMangerActionPerformed(java.awt.event.ActionEvent evt) {
        AddEmpDialog add = new AddEmpDialog();

    }
    private void addStudentActionPerformed(java.awt.event.ActionEvent evt) {
        AddStudent addStudent = new AddStudent();
        addStudent.setVisible(true);
    }

    private void AddSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddSubActionPerformed
        AddSubject addSubject = new AddSubject();
        addSubject.setVisible(true);

    }//GEN-LAST:event_AddSubActionPerformed



    private void showSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showSubActionPerformed
        ShowEmp showEmp = new ShowEmp("subs");
        showEmp.setVisible(true);

    }//GEN-LAST:event_showSubActionPerformed

    private void showSalActionPerformed(java.awt.event.ActionEvent evt) {
        ShowEmp showEmp = new ShowEmp("emp");
        showEmp.setVisible(true);
    }

    private void showCountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showCountActionPerformed
//        readFile();.
        ShowCount choseSub = new ShowCount();
        choseSub.setVisible(true);
    }//GEN-LAST:event
    // _showCountActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {
//        ObjectIOExample objectIO = new ObjectIOExample();
        final String filepath = "F:\\ioFile";
        School school = new School();
        System.out.println(school.showData());
        file();
//        try {
//            FileOutputStream fileOut = new FileOutputStream(filepath);
//            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
//            objectOut.writeObject(school);
//            objectOut.close();
//            System.out.println("The Object  was succesfully written to a file");
//
//        } catch (Exception ex) {
//            ex.printStackTrace();
//            System.out.println(ex.getMessage());
//    }
    }
    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed
    public void file(){
        try (FileOutputStream fos = new FileOutputStream("books.dat");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

//            System.out.println(School.mSchool.students);
            System.out.println(" i am saving");
            System.out.println("saved" + School.mSchool.showData());
            oos.writeObject(School.mSchool);
        } catch (IOException e) {
            System.out.println(" E 1 ");
            e.printStackTrace();
        }
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
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddManger;
    private javax.swing.JButton AddSub;
    private javax.swing.JButton Exit;
    private javax.swing.JButton addStudent;
    private javax.swing.JButton save;
    private javax.swing.JButton showCount;
    private javax.swing.JButton showSal;
    private javax.swing.JButton showSub;
    // End of variables declaration//GEN-END:variables
}
