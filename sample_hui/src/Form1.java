import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by abran on 13.12.2016.
 */
public class Form1 {
    private JButton button1;
    private JTextField textField1;
    private javax.swing.JLabel JLabel;

    public Form1() {
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                JLabel.setText(textField1.getText());
            }
        });
    }
}
