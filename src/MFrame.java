import javax.swing.*;
import java.awt.*;

public class MFrame {
    private JFrame context;

    public JFrame getContext() {
        return context;
    }

    public MFrame(JFrame context) {
        this.context = context;
    }

    JLabel label;
    public  JLabel lbl(){
        return new  JLabel();
    }
    public  void lbl(String text){
        this.context.add(new JLabel(text));
    }
    public  void lbl(String text,int x , int y ,int w ,int h){
        JLabel label = new JLabel(text);
        label.setBounds(x,y,w,h);
        this.context.add(label);
        System.out.println(label.getFont());
    }
    public  void lbl(String text, int x , int y , int w , int h, Font font){
        JLabel label = new JLabel(text);
        label.setBounds(x,y,w,h);
        label.setFont(font);
        this.context.add(label);
    }
    public  void lbl(String text,int w ,int h){
        JLabel label = new JLabel(text);
        label.setSize(w,h);
        this.context.add(label);
    }

}
