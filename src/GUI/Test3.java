package GUI;
import javax.swing.*;

public class Test3 extends JFrame{
    private JPanel panel1;
    private JEditorPane editorPane1;
    private JButton artistButton;
    private JButton songButton;
    private JTextField textField1;
    private JButton searchButton;
    private JTable table1;

    public Test3(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(panel1);
        this.pack();
    }
    public static void main(String[] args){
        JFrame test3 = new Test3( "Play Song");
        test3.setVisible(true);
    }
}