package GUI;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SongFrame extends JFrame {
    private JPanel main;
    private JTextField txtSearch;
    private JFormattedTextField txtSongName;
    private JFormattedTextField txtArtist;
    private JFormattedTextField txtSinger;
    private JTextArea textArea1;
    private JButton playButton;
    private JTextPane textPane1;
    private JButton searchButton;
    private JButton artistButton;
    private JTable tbListRecommend;

    public SongFrame(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(main);
        this.pack();

    }
//    public listRecommend(){
//        Vector id = new Vector();
//        Vector name = new Vector();
//        Vector singer = new Vector();
//        id.add("ID");
//        name.add("Song name");
//        singer.add("Singer");
//    }
    public static void main(String[] args){
        JFrame frame = new SongFrame( "Play Song");
        frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
