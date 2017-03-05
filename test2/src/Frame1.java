import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import com.jgoodies.forms.factories.*;
import com.jgoodies.forms.layout.*;
import org.jdesktop.beansbinding.*;
import org.jdesktop.beansbinding.AutoBinding.UpdateStrategy;
/*
 * Created by JFormDesigner on Tue Dec 13 16:53:16 EET 2016
 */



/**
 * @author Andrei Branga
 */
public class Frame1 extends JFrame {
    public Frame1() {
        initComponents();
    }

    private void button1MouseClicked(MouseEvent e) {
        label1.setText(textField1.getText());
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Andrei Branga
        button1 = new JButton();
        textField1 = new JTextField();
        label1 = new JLabel();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(new FormLayout(
            "8*(default, $lcgap), default",
            "3*(default, $lgap), default"));

        //---- button1 ----
        button1.setText("text");
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button1MouseClicked(e);
            }
        });
        contentPane.add(button1, CC.xywh(1, 3, 3, 1));
        contentPane.add(textField1, CC.xywh(6, 3, 12, 1));

        //---- label1 ----
        label1.setText("text");
        contentPane.add(label1, CC.xywh(3, 7, 9, 1));
        pack();
        setLocationRelativeTo(getOwner());

        //---- bindings ----
        bindingGroup = new BindingGroup();
        bindingGroup.addBinding(Bindings.createAutoBinding(UpdateStrategy.READ_WRITE,
            button1, button1, BeanProperty.create("selected")));
        bindingGroup.addBinding(Bindings.createAutoBinding(UpdateStrategy.READ_WRITE,
            textField1, textField1, BeanProperty.create("text")));
        bindingGroup.addBinding(Bindings.createAutoBinding(UpdateStrategy.READ_WRITE,
            label1, label1, BeanProperty.create("labelFor")));
        bindingGroup.bind();
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Andrei Branga
    private JButton button1;
    private JTextField textField1;
    private JLabel label1;
    private BindingGroup bindingGroup;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
