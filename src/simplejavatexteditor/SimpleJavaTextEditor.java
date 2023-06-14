package simplejavatexteditor;

import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class SimpleJavaTextEditor extends JTextPane {

    public final static String NAME = "NotePadtex";
    public final static String EDITOR_EMAIL = "202203110026@stu.qlu.edu.cn";

    /**
     * @param args
     */
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel ("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Exception e) {
            e.printStackTrace();
        }

        new UI().setVisible(true);
    }

}
