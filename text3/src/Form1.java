import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by abran on 13.12.2016.
 */
public class Form1 extends JFrame{
    private JButton button1;
    private JTextField textField1;
    private JLabel jLabel1;
    private JPanel jPanel;

    public Form1() {

        button1 = new JButton();
        textField1 = new JTextField();
        jLabel1 = new JLabel();
        jPanel = new JPanel();
        jPanel.add(button1);
        jPanel.add(textField1);
        jPanel.add(jLabel1);

        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

            }
        });
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                jLabel1.setText(textField1.getText());
            }
        });
    }
}
