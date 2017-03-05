import com.intellij.ui.ClickListener;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

/**
 * Created by abran on 18.12.2016.
 */
public class Form extends JFrame implements ActionListener
{
    JPanel panel =new JPanel();
    JButton button=new JButton("CLICK ME!");
    JTextField text=new JTextField();


    public Form(String title)
    {
        super(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(new Dimension(600,300));
        setLocation(300,300);

        panel.setLayout(new FlowLayout());
        button.setSize(200,100);
        text.setSize(300,100);
        panel.add(button);
        panel.add(text);
        this.add(panel);
        button.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        text.setText("You clicked me!");

    }
}
