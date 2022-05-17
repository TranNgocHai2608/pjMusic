package GUI;
import javax.swing.*;

public class Test2 extends JFrame{
    private JPanel panel1;
    private JTextPane avatar;
    private JButton artistButton;
    private JButton songButton;
    private JTextField textField1;
    private JButton searchButton;
    private JTable table1;
    private JEditorPane editorPane1;
    private JTextArea textArea1;

    public Test2(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(panel1);
        this.pack();
    }
    public static void main(String[] args){
        JFrame test2 = new Test2( "Play Song");
        test2.setVisible(true);
    }
}

