import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*
 * Created by JFormDesigner on Sun Dec 18 18:04:32 EET 2016
 */



/**
 * @author Andrei Branga
 */
public class Frame extends JFrame {
    public Frame() {
        initComponents();
    }

    private void button1MouseClicked(MouseEvent e) {
        textField1.setText("You clicked me!");
        if (radioButton1.isSelected())
        {
            button1.setBackground(Color.red);
        }
    }

    private void button2MouseEntered(MouseEvent e) {
        textField1.setText("Mouse Inside!!!");
    }

    private void button2MouseExited(MouseEvent e) {
        textField1.setText("");
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Andrei Branga
        button1 = new JButton();
        textField1 = new JTextField();
        button2 = new JButton();
        radioButton1 = new JRadioButton();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- button1 ----
        button1.setText("text");
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button1MouseClicked(e);
            }
        });
        contentPane.add(button1);
        button1.setBounds(20, 55, 69, button1.getPreferredSize().height);
        contentPane.add(textField1);
        textField1.setBounds(115, 60, 120, textField1.getPreferredSize().height);

        //---- button2 ----
        button2.setText("text");
        button2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                button2MouseEntered(e);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                button2MouseExited(e);
            }
        });
        contentPane.add(button2);
        button2.setBounds(30, 150, 75, button2.getPreferredSize().height);

        //---- radioButton1 ----
        radioButton1.setText("text");
        contentPane.add(radioButton1);
        radioButton1.setBounds(new Rectangle(new Point(210, 125), radioButton1.getPreferredSize()));

        { // compute preferred size
            Dimension preferredSize = new Dimension();
            for(int i = 0; i < contentPane.getComponentCount(); i++) {
                Rectangle bounds = contentPane.getComponent(i).getBounds();
                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
            }
            Insets insets = contentPane.getInsets();
            preferredSize.width += insets.right;
            preferredSize.height += insets.bottom;
            contentPane.setMinimumSize(preferredSize);
            contentPane.setPreferredSize(preferredSize);
        }
        setSize(400, 300);
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Andrei Branga
    private JButton button1;
    private JTextField textField1;
    private JButton button2;
    private JRadioButton radioButton1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
