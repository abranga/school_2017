import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.event.ListDataListener;

import com.intellij.uiDesigner.core.*;
import com.jgoodies.forms.factories.*;
import com.jgoodies.forms.layout.*;
/*
 * Created by JFormDesigner on Tue Dec 13 17:12:13 EET 2016
 */



/**
 * @author Andrei Branga
 */
public class Form1 extends JFrame {
    public Form1() {
        initComponents();
    }



    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Andrei Branga
        scrollPane1 = new JScrollPane();
        list1 = new JList();
        list2 = new JList();
        button1 = new JButton();

        //======== this ========
        setTitle("Currency Converter");
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //======== scrollPane1 ========
        {
            scrollPane1.setViewportView(list1);
        }
        contentPane.add(scrollPane1);
        scrollPane1.setBounds(5, 5, 70, scrollPane1.getPreferredSize().height);
        contentPane.add(list2);
        list2.setBounds(310, 5, 68, 144);

        //---- button1 ----
        button1.setText("text");
        contentPane.add(button1);
        button1.setBounds(145, 60, 74, 40);

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
    private JScrollPane scrollPane1;
    private JList list1;
    private JList list2;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
