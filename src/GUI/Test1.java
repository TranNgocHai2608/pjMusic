package GUI;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.PatternSyntaxException;

import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
public class Test1 extends JFrame{
    private JPanel panel1;
    private JTextField textField2;
    private JProgressBar progressBar1;
    private JButton playButton;
    private JButton nextButton;
    private JSlider slider1;
    private JEditorPane editorPane1;
    private JTable danhsach;
    private JButton songButton;
    private JButton artistButton;
    private JTextField textField1;
    private JButton searchButton;


    public Test1(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(panel1);
        this.pack();
    }
    public static void main(String[] args){
        JFrame jFrame = new JFrame();
        JFrame test1 = new Test1( "Play Song");
        test1.setVisible(true);
        JTable table;
        TableModel model;
        JFrame Jframe = new JFrame();
        Object rows[][] = {{"Sơn Tùng MTP", "Sơn Tùng MTP","Nơi này có anh"},
                {"Chi Dân", "Chi Dân", "Tiếng gọi nơi anh"}};
        Object columns[] = {"Tên ca sĩ", "Tên nhạc sĩ", "Tên bài hát"};
        model = new DefaultTableModel(rows, columns) {
            public Class getColumnClass(int column) {
                Class returnValue;
                if ((column >= 0) && (column < getColumnCount())) {
                    returnValue = getValueAt(0, column).getClass();
                } else {
                    returnValue = Object.class;
                }
                return returnValue;
            }
        };
        table = new JTable(model);
        final TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(model);
        table.setRowSorter(sorter);
        jFrame.add(new JScrollPane(table), BorderLayout.CENTER);
        JPanel panel = new JPanel(new BorderLayout());
        JLabel label = new JLabel("Filter");
        panel.add(label, BorderLayout.WEST);
        final JTextField filterText = new JTextField("");
        panel.add(filterText, BorderLayout.CENTER);
        jFrame.add(panel, BorderLayout.NORTH);
        JButton button = new JButton("Filter");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = filterText.getText();
                if (text.length() == 0) {
                    sorter.setRowFilter(null);
                } else {
                    try {
                        sorter.setRowFilter(RowFilter.regexFilter(text));
                    } catch (PatternSyntaxException pse) {
                        System.out.println("Bad regex pattern");
                    }
                }
            }
        });
        jFrame.add(button, BorderLayout.SOUTH);
        jFrame.setSize(400, 300);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }

}