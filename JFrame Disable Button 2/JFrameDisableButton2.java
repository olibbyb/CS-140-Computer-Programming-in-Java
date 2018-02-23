import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public abstract class JFrameDisableButton2 extends JPanel implements ActionListener
{
    public static void main(String[] args) 
    {
    	JFrame frame = new JFrame("Button");
    	frame.setVisible(true);
    	frame.setSize(200, 100);
    	JPanel panel = new JPanel();
    	frame.add(panel);
    	JButton button = new JButton("Click here");
    	button.setEnabled(true);
    	panel.add(button);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
    }
	public void actionPerformed(ActionEvent e)
	{
		Object source = e.getSource();
		JButton button1 = new JButton("Click here");
		button1.setEnabled(false);
	}
}