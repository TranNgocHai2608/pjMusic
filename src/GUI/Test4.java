package GUI;

import javax.swing.*;

public class Test4 extends JFrame{
    private JPanel panel1;
    private JEditorPane editorPane1;
    private JButton button1;
    private JButton button2;
    private JTextField textField1;
    private JButton button3;
    private JTable table1;

    public Test4(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(panel1);
        this.pack();
    }
    public static void main(String[] args){
        JFrame test4 = new Test4( "Play Song");
        test4.setVisible(true);
    }
}
